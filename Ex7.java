import java.util.Scanner;

public class Ex7{
    public static String name(String c){
        String [] parts = c.trim().split("\\s+");
        String firstName = parts[parts.length - 1];
        return firstName;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ho va ten: ");
        String c = sc.nextLine();
        String firstName = name(c);
        System.out.println(firstName);
    }
}