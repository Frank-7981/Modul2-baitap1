package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập tên của bạn:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}