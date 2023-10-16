package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chiều dài: ");
        int L = sc.nextInt();
        System.out.println("Hãy nhập chiều rộng: ");
        int W = sc.nextInt();
        System.out.printf("Chu vi hình chủ nhật có chiều dài =%d, chiều rộng =%d là : %d",L,W,(L+W)*2);
        System.out.printf("\n Diện tích hình chủ nhật có chiều dài =%d, chiều rộng =%d là : %d",L,W,(L*W));
    }
}
