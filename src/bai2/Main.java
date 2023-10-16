package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int rate = 23000;
Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số USD bạn muốn quy đổi:");
int number = sc.nextInt();
// int i = rate*number;
        System.out.println("Giá trị VND là: "+ (rate*number));
    }
}
