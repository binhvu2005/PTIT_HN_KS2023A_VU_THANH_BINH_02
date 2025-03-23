import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("nhập số lượng phần tử trong mảng:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ " +(i+1));
            numbers.add(sc.nextInt());
        }
        System.out.println("số lần suất hiện:");
        int count = 0;
        int target = sc.nextInt();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
        
    }
}
