package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {
    public static void main(String[] args) {
        Map<Character, BiFunction<Double, Double, Double>> operators = new HashMap<>();
        operators.put('+', Double::sum);
        operators.put('-', (a, b) -> a - b);
        operators.put('*', (a, b) -> a * b);
        operators.put('/', (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Không thể chia cho 0");
            }
            return a / b;
        });

        Scanner scanner = new Scanner(System.in);

        System.out.println("Đây là máy tính đời nhà tống của phép toán [a] [+-*/] [b]");
        System.out.print("Nhập biểu thức: ");

        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        try {
            if (elements.length != 3) {
                throw new IllegalArgumentException("Sai định dạng");
            }

            double a = Double.parseDouble(elements[0]);
            double b = Double.parseDouble(elements[2]);
            char operator = elements[1].charAt(0);

            if (!operators.containsKey(operator)) {
                throw new IllegalArgumentException("Toán tử không hợp lệ");
            }

            double result = operators.get(operator).apply(a, b);
            printResult(result);

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void printResult(double result) {
        if (result == (int) result) {
            System.out.println("Kết quả: " + (int) result);
        } else {
            System.out.println("Kết quả: " + result);
        }
    }
}
