package org.example;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. hello word
        System.out.println("Một con cá mặn");

        // 2. lambda expression
        List<String> names = Arrays.asList("John", "Doe", "Jane", "Doe");
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);

        // 3. cấu lệnh print
        int age = 10;
        String name = "John";
        System.out.print("Name: " + name + ", age: " + age + " %n");
        System.out.printf("%nName: %s, age: %d %n", name, age);

        // 4. nối chuổi
        String str1 = "Hello";
        String str2 = " World";
        String str3 = " My";
        String str4 = " Name";
        String str5 = " Is";
        String str6 = " Mun";
        System.out.println("+ truyền thống: " + str1 + str2 + str3 + str4 + str5 + str6);


        // 5. StringBuffer hiệu quả đa luồng, StringBuilder hiệu quả đơn luồng
        StringBuffer sb = new StringBuffer();
        sb.append(str1).append(str2).append(str3).append(str4).append(str5).append(str6);
        System.out.println("StringBuffer: " + sb);

        // 6. Join string
        String joinString = String.join("", str1, str2, str3, str4, str5, str6);
        System.out.println("String.join(): " + joinString);

        // 7. Stream string
        List<String> strings = Arrays.asList(str1, str2, str3, str4, str5, str6);
        String steamString = strings.stream().collect(Collectors.joining());
        System.out.println("Stream: " + steamString);
    }
}
