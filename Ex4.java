import java.util.Scanner;

public class Ex4 {
    public int inputInt(String n) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(n);
            String input = sc.nextLine();
            try {
                num = Integer.parseInt(input);
                valid = true;
            } catch (Exception e) {
                System.out.println("Nhập lại số khác đi!!!");
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Ex4 q4 = new Ex4();
        int a = q4.inputInt("Nhập a: ");
        int b = q4.inputInt("Nhập b: ");
        int s = a + b;
        System.out.println("a + b = " + s);
    }
}