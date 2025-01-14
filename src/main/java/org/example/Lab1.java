package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Lab1 {
    public static void main(String[] args) {
        // 1. Kiểu dữ liệu nguyên thủy
        int intNumber = 1;
        long longNumber = 100_000;
        float floatNumber = 1.5f;
        double doubleNumber = 1500;
        char character = '.';
        boolean booleanValue = false;
        byte byteValue = 127; // -128 -> 127
        short shortValue = 32_767; // -32,768 -> 32,767

        System.out.println("int: " + intNumber);
        System.out.println("long: " + longNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
        System.out.println("char: " + character);
        System.out.println("boolean: " + booleanValue);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);

        // 2. Kiểu dữ liệu wrapper classes
        Integer integer = 1;
        Long longValue = 1_000L; // có thêm chữ L ở sau
        Double doubleValue = 1.0; // bắt buộc phải nhập số thập phân
        Float floatValue = 1.0f; // bắt buộc phải có f ở sau
        Character charValue = 'b';
        Boolean booleanValue2 = true;
        Byte byteValue2 = 127;
        Short shortValue2 = 32_767;

        System.out.println("Integer: " + integer);
        System.out.println("Long: " + longValue);
        System.out.println("Double: " + doubleValue);

        // 3. Kiểu chuổi (String)
        String str = "đây là, một con cá MẶN      ";

        System.out.println("String: " + str);
        System.out.println("charAt: " + str.charAt(0));
        System.out.println("length: " + str.length());
        System.out.println("substring: " + str.substring(0, 6));
        System.out.println("toLowerCase: " + str.toLowerCase());
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("trim: " + str.trim());
        System.out.println("replace: " + str.replace("MẶN", "MẬP"));
        System.out.println("split: " + str.split(",")[0]);
        System.out.println("contains: " + str.contains("MẶN"));
        System.out.println("equals: " + str.equals("đây"));
        System.out.println("indexof" + str.indexOf("là"));
        System.out.println("lastIndexOf: " + str.lastIndexOf("a"));

        // 4. Kiểu dữ liệu đặc biệt BigDecimal, Date, DateTime
        BigDecimal bigValue = new BigDecimal("10000.1");
        System.out.println("BigDecimal: " + bigValue);

        LocalDate now = LocalDate.now();
        System.out.println("LocalDate: " + now);

        LocalDateTime time = LocalDateTime.now();
        System.out.println("LocalDateTime: " + time);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("LocalDateTime format: " + time.format(timeFormatter));
        System.out.println("Timestamp: " + new Date().getTime());


    }

}
