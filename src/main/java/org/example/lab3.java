package org.example;

public class lab3 {
    public static void main(String[] args) {
        // 1. if-else
        int x = 10;
        if (x < 20) {
            System.out.println("luôn vào đây :D");
        } else {
            System.out.println(":)");
        }

        // 2. switch-case
        int y = 30;
        switch (y) {
            case 20:
                System.out.println("y = 20");
                break;
            case 30:
                System.out.println("y = 30");
                break;
            default:
                System.out.println("để đây và không nói gì :D");
                break;
        }

        // 3. for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("for i = " + i);
        }

        // 4. while loop
        int j = 0;
        while (j < 5) {
            System.out.println("while j = " + j);
            j++;
        }

        // 5. do-while loop
        int k = 0;
        do {
            System.out.println("do-while k = " + k);
            k++;
        } while (k < 5);
    }
}
