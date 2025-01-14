package org.example;

public class Lab2 {
    public static void main(String[] args) {
        // 1. các toán tử số học trong java
        System.out.println("+-*/ phép toán cơ bản");
        System.out.println("% chia lấy dư, vd 2 % 3 = 2");

        // 2. các toán tử so sánh trong java
        System.out.println("== so sánh bằng, vd 2 == 3 = false");
        System.out.println("!= so sánh khác, vd 2 != 3 = true");
        System.out.println("> so sánh lớn hơn, vd 2 > 3 = false");
        System.out.println("< so sánh nhỏ hơn, vd 2 < 3 = true");
        System.out.println(">= so sánh lớn hơn hoặc bằng, vd 2 >= 3 = false");
        System.out.println("<= so sánh nhỏ hơn hoặc bằng, vd 2 <= 3 = true");
        System.out.println("&& so sánh và, vd 2 < 3 && 3 > 2 = true");
        System.out.println("|| so sánh hoặc, vd 2 < 3 || 3 < 2 = true");
        System.out.println("! so sánh phủ định, vd !(2 < 3) = false");

        // 3. các toán tử gán trong java;
        System.out.println("= gán giá trị, vd int a = 2");
        System.out.println("+= cộng và gán, vd a += 2 tương đương a = a + 2");
        System.out.println("-= trừ và gán, vd a -= 2 tương đương a = a - 2");
        System.out.println("*= nhân và gán, vd a *= 2 tương đương a = a * 2");
        System.out.println("/= chia và gán, vd a /= 2 tương đương a = a / 2");
        System.out.println("%= chia lấy dư và gán, vd a %= 2 tương đương a = a % 2");
        System.out.println("&= AND và gán, vd a &= 2 tương đương a = a & 2");
        System.out.println("|= OR và gán, vd a |= 2 tương đương a = a | 2");
        System.out.println("^= XOR và gán, vd a ^= 2 tương đương a = a ^ 2");
        System.out.println(">>= dịch phải và gán, vd a >>= 2 tương đương a = a >> 2");
        System.out.println("<<= dịch trái và gán, vd a <<= 2 tương đương a = a << 2");
        System.out.println(">>>= dịch phải không dấu và gán, vd a >>>= 2 tương đương a = a >>> 2");

        // 4. các toán tử tăng giảm trong java
        System.out.println("++ tăng 1, vd a = 2; a++; a = 3");
        System.out.println("-- giảm 1, vd a = 2; a--; a = 1");
        System.out.println("++a tăng 1 trước khi thực hiện phép toán khác, vd a = 2; b = ++a; a = 3, b = 3");
        System.out.println("a++ tăng 1 sau khi thực hiện phép toán khác, vd a = 2; b = a++; a = 3, b = 2");
        System.out.println("--a giảm 1 trước khi thực hiện phép toán khác, vd a = 2; b = --a; a = 1, b = 1");
        System.out.println("a-- giảm 1 sau khi thực hiện phép toán khác, vd a = 2; b = a--; a = 1, b = 2");

        // 5. các toán tử bit trong java
        System.out.println("& AND, vd 2 & 3 = 2");
        System.out.println("| OR, vd 2 | 3 = 3");
        System.out.println("^ XOR, vd 2 ^ 3 = 1");
        System.out.println("~ NOT, vd ~2 = -3");

        // 6. các toán tử dịch bit trong java
        System.out.println(">> dịch phải, vd 2 >> 1 = 1");
        System.out.println("<< dịch trái, vd 2 << 1 = 4");

    }
}
