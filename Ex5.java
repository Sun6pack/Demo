import java.util.Scanner;

public class Ex5 {

    public static String sol1(Scanner sc) {
        System.out.print("Nhap a, b cho PT bac 1 (ax + b = 0): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a != 0) {
            double x = - (double) b / a;
            return "PT co nghiem duy nhat x = " + x;
        } else {
            if (b == 0) {
                return "PT vo so nghiem";
            } else {
                return "PT vo nghiem";
            }
        }
    }

    public static String sol2(Scanner sc) {
        System.out.print("Nhap a, b, c cho PT bac 2 (ax^2 + bx + c = 0): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 0) {
            return "Day khong phai phuong trinh bac 2.";
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2.0 * a);
            double x2 = (-b - sqrtDelta) / (2.0 * a);
            return "PT co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2;
        } else if (delta == 0) {
            double x = -b / (2.0 * a);
            return "PT co nghiem kep: x = " + x;
        } else {
            return "PT vo nghiem trong tap so thuc.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result1 = sol1(sc);
        System.out.println("PT bac 1: " + result1);

        String result2 = sol2(sc);
        System.out.println("PT bac 2: " + result2);

        sc.close();
    }
}