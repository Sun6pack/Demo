import java.util.Scanner;
import java.util.Arrays;
public class Ex8 {
        private int[] arr;
        private int n;
        private int x;
    public void input(Scanner sc){
        System.out.print("Nhap so luong phan tu n: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.print("Nhap cac phan tu mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhap so x can dem: ");
        x = sc.nextInt();
    }

    public int countNum(){
        int count = 0;
        for (int i : arr ){
            if (i == x ) count++;
        }
        return count;
    }
    public void sort(){
        Arrays.sort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex8 q8 = new Ex8();
        q8.input(sc);
        int result = q8.countNum();
        System.out.println("So " + q8.x + " xuat hien " + result + " lan trong mang.");
        System.out.println ("Danh sach sau khi sap xep: ");
        q8.sort();
        
        sc.close();
    }
}
