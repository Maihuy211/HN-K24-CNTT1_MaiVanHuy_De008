import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Lỗi: Số lượng phần tử không hợp lệ");
            return;
        }
        // Nhập số
        for (int i = 0; i < n; i++) {
            numbers.put(i, sc.nextInt());
        }
        // Xắp xếp
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {

                    int temp = numbers.get(j);
                    numbers.put(j, numbers.get(j + 1));
                    numbers.put(j + 1, temp);

                }
            }
        }
        // Đếm số lần lăpj
        int maxNumber = 0;
        int maxCount = 0;
        int found = -1;
        for (int i = 0; i < n; i++) {
            found = -1;
            for (int j = 0; j < i; j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    found = 0;
                    break;
                }
            }
            if (found == -1){
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (numbers.get(i).equals(numbers.get(j))) {
                        count++;
                    }
                }
                System.out.println(numbers.get(i) + " xuất hiện: " + count + " lần");
                if (count > maxCount) {
                    maxCount = count;
                    maxNumber = numbers.get(i);
                }
            }
        }
        System.out.println("Số xuất hiện nhiều nhất: " + maxNumber + " (" + maxCount + " lần)");
    }
}