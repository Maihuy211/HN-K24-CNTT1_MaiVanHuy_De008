import java.util.Scanner;
import java.util.Stack;

public class Bai3 {
    public static void main(String[] args) {
        Stack<Integer> numberList = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Lỗi: Số không hợp lệ");
            return;
        }
        while (number > 0) {
            numberList.push(number % 2);
            number = number / 2;
        }
        while (!numberList.isEmpty()) {
            System.out.print(numberList.pop());
        }
    }
}