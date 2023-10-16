package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số cần đọc: ");
        int numb = sc.nextInt();
        String result = "";

        // xét điều kiện nhỏ hơn 0 và lớn hơn 999 sẽ báo "out of ability"
        if (numb < 0 || numb > 999) {
            System.out.println("out of ability");
        } else if (numb == 0) {
            System.out.println("zero");
        } else {                          // khi thoả mãn điều kiện, chia numb thành 3 phần
            int hundreds = numb / 100;    // hàng trăm
            int tens = (numb % 100) / 10; // hàng chục
            int ones = numb % 10;         // hàng đơn vị

            if (hundreds > 0) {           // có nghĩa là : numb/100 > 0 , để xét số hàng trăm
                switch (hundreds) {
                    case 1:
                        result = "one hundred";
                        break;
                    case 2:
                        result = "two hundred";
                        break;
                    case 3:
                        result = "three hundred";
                        break;
                    case 4:
                        result = "four hundred";
                        break;
                    case 5:
                        result = "five hundred";
                        break;
                    case 6:
                        result = "six hundred";
                        break;
                    case 7:
                        result = "seven hundred";
                        break;
                    case 8:
                        result = "eight hundred";
                        break;
                    case 9:
                        result = "nine hundred";
                        break;
                    default:
                        break;
                }
                if (tens != 0 || ones != 0) {     // lấy numb % cho 100 và lấy kết quả / 10 để tính ra số hàng chục, đơn vị
                    result += " ";                // nếu k chia hết thì thêm phần dấu cách để phân biệt giữa hàng trăm với hàng chục và đơn vị
                }
            }

            if (tens == 1) {                     // numb % cho 100 và lấy kết quả / 10 = 1 ==> là hàng 1x ( 10-19 )
                switch (numb % 100) {
                    case 11:
                        result += "eleven";
                        break;
                    case 12:
                        result += "twelve";
                        break;
                    case 13:
                        result += "thirteen";
                        break;
                    case 14:
                        result += "fourteen";
                        break;
                    case 15:
                        result += "fifteen";
                        break;
                    case 16:
                        result += "sixteen";
                        break;
                    case 17:
                        result += "seventeen";
                        break;
                    case 18:
                        result += "eighteen";
                        break;
                    case 19:
                        result += "nineteen";
                        break;
                    default:
                        break;
                }
            } else if (tens > 1) {                // numb % cho 100 và lấy kết quả / 10 > 1 ==> là từ hàng 2x ( 20-90 )
                switch (tens) {
                    case 2:
                        result += "twenty";
                        break;
                    case 3:
                        result += "thirty";
                        break;
                    case 4:
                        result += "forty";
                        break;
                    case 5:
                        result += "fifty";
                        break;
                    case 6:
                        result += "sixty";
                        break;
                    case 7:
                        result += "seventy";
                        break;
                    case 8:
                        result += "eighty";
                        break;
                    case 9:
                        result += "ninety";
                        break;
                    default:
                        break;
                }
                if (ones > 0) {
                    result += " ";
                }
            }

            if (ones > 0 && tens != 1) {
                switch (ones) {
                    case 1:
                        result += "one";
                        break;
                    case 2:
                        result += "two";
                        break;
                    case 3:
                        result += "three";
                        break;
                    case 4:
                        result += "four";
                        break;
                    case 5:
                        result += "five";
                        break;
                    case 6:
                        result += "six";
                        break;
                    case 7:
                        result += "seven";
                        break;
                    case 8:
                        result += "eight";
                        break;
                    case 9:
                        result += "nine";
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.printf("Cách đọc số %d đã nhập là: %s", numb, result);
    }
}
