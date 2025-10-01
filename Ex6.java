import java.util.Scanner;

public class Ex6 {
    public static String convert(String n){
        int num = Integer.parseInt(n); //string to int
        String bin = Integer.toBinaryString(num); // int to binary number
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        String n = sc.nextLine();
        String bin = convert(n);
        System.out.println("Binary of " + n + " is "+ bin);
    }
}
