import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public void input(double[] arr) {
        // Bỏ if (arr.length == 0) vì main đã kiểm tra, tránh in "Nhap: " không cần thiết
        double max = Double.NEGATIVE_INFINITY;
        double sum = 0.0;
        for (double num : arr) {
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Sum of: " + sum%.2f);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("KValid.");
            return;
        }

        Ex3 obj = new Ex3();

        List<Double> validNumbers = new ArrayList<>();
        int invalidCount = 0;

        for (String arg : args) {
            try {
                double num = Double.parseDouble(arg);
                validNumbers.add(num); 
            } catch (NumberFormatException e) {
                invalidCount++;  
            }
        }

        int validCount = validNumbers.size();
        if (validCount == 0) {
            System.out.println("valid real num.");
            if (invalidCount > 0) {
                System.out.println("count invalid " + invalidCount);
            }
            return;
        }

        double[] arr = new double[validCount];
        for (int i = 0; i < validCount; i++) {
            arr[i] = validNumbers.get(i);
        }

        System.out.println("countvalid " + validCount);
        if (invalidCount > 0) {
            System.out.println("count invalid (đã loại trừ): " + invalidCount);
        }

        obj.input(arr);
    }
}