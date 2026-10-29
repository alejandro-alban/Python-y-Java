import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int k = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(k + " x " + i + " = " + (k * i));
        }
    }
}