package bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int check = sc.nextInt();
        String ketQua = "";
        if (check % 3 == 0 && check % 5 == 0) {
            ketQua = "Chia hết cho cả 3 và 5";
        } else if (check % 3 == 0 && check % 5 != 0) {
            ketQua = "Chỉ chia hết cho 3";
        } else if (check % 3 != 0 && check % 5 == 0) {
            ketQua = "Chỉ chia hết cho 5";
        } else {
            ketQua = "Không chia hết cho 3 , cũng không chia hết cho 5";
        }
        System.out.println("Số cần so sánh :" + ketQua);
    }
}
