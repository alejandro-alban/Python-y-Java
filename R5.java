import java.util.Scanner;
public class R5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de notas: ");
        int n = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese una nota: ");
            double nota = sc.nextDouble();
            suma = suma + nota;
        }

        double promedio = suma / n;

        System.out.println("Promedio: " + promedio);
    }
}
