package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập 1 số :");
        int input = sc.nextInt();
        String ketQua = "";
        switch (input) {
            case 0:
                ketQua = "Số Không";
                break;
            case 1:
                ketQua = "Số Một";
                break;
            case 2:
                ketQua = "Số Hai";
                break;
            case 3:
                ketQua = "Số Ba";
                break;
            case 4:
                ketQua = "Số Bốn";
                break;
            case 5:
                ketQua = "Số Năm";
                break;
            case 6:
                ketQua = "Số Sáu";
                break;
            case 7:
                ketQua = "Số Bảy";
                break;
            case 8:
                ketQua = "Số Tám";
                break;
            case 9:
                ketQua = "Số Chín";
                break;
            default:
                ketQua = "Số không hợp lệ";
        }
        System.out.printf("Số nhập vào %d có cách đọc là %s",input,ketQua);
    }
}
