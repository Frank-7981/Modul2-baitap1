package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập điểm Toán: ");
        int T = sc.nextInt();
        System.out.println("Hãy nhập điểm Lý: ");
        int L = sc.nextInt();
        System.out.println("Hãy nhập điểm Hoá: ");
        int H = sc.nextInt();
        System.out.println("Hãy nhập điểm Văn: ");
        int V = sc.nextInt();
        System.out.println("Hãy nhập điểm Anh: ");
        int A = sc.nextInt();

        double diemTB = (double) (T + L + H + V + A) / 5;
        if (diemTB > 10 || diemTB < 0) {
            System.out.println("Điểm không hợp lệ");
        } else if (9 <= diemTB && diemTB <= 10) {
            System.out.printf("Điểm trung bình của bạn là %f và xếp loại Xuất sắc", diemTB);
        } else if (diemTB >= 8) {
            System.out.printf("Điểm trung bình của bạn là %f và xếp loại Giỏi", diemTB);
        } else if (diemTB >= 6.5) {
            System.out.printf("Điểm trung bình của bạn là %f và xếp loại Khá", diemTB);
        } else if (diemTB >= 5) {
            System.out.printf("Điểm trung bình của bạn là %f và xếp loại Trung bình", diemTB);
        } else {
            System.out.printf("Điểm trung bình của bạn là %f và xếp loại Yếu", diemTB);
        }
    }
}
