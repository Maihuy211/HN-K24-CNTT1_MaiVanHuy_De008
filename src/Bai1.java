import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int studentNumber = sc.nextInt();
        sc.nextLine();
        if(studentNumber <= 0){
            System.out.println("Lỗi: Số lượng sinh viên không hợp lệ");
            return;
        }
        // nhập tên
        String studentName = "";
        for (int i = 0; i < studentNumber; i++) {
            studentName = sc.nextLine();
            students.add(studentName);
        }
        // tìm tên dài nhất
        int countMax = 0;
        for (int i = 0; i < studentNumber; i++) {
            if (students.get(i).length() > countMax ){
                countMax = students.get(i).length();
                studentName = students.get(i);
            }
        }
        System.out.println("Longest name: " + studentName);
        // Hiện thị danh sách theo thứ tự alphabet
        Collections.sort(students);
        System.out.print("Sorted list: ");
        for (int i = 0; i < studentNumber; i++) {
            System.out.print(students.get(i) + " ");
        }
        // Điếm số lượng sinh viên có tên bắt đầu bằng 'A'
        int countNumber = 0;
        for (int i = 0; i < studentNumber; i++) {
            if(students.get(i).toUpperCase().trim().charAt(0) == 'A'){
                countNumber++;
            }
        }
        System.out.println("\nNumber of names starting with A: " + countNumber);
    }
}
