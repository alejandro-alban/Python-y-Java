import java.util.Scanner;

public class PrestamoConAbonoExtraordinario {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Entrada de datos
System.out.print("Ingrese el monto del préstamo: ");
double monto = sc.nextDouble();
System.out.print("Ingrese la tasa de interés trimestral (en decimal, ej. 0.05): ");
double tasa = sc.nextDouble();
System.out.print("Ingrese el número de trimestres: ");
int trimestres = sc.nextInt();
System.out.print("Ingrese el porcentaje de abono extraordinario (ej. 10 para 10%): ");
double abonoPorcentaje = sc.nextDouble();
// Cálculos
double montoTotal = monto * Math.pow(1 + tasa, trimestres);
// Interés compuesto
double abono = montoTotal * (abonoPorcentaje / 100);
// Abono extraordinario
double montoFinal = montoTotal - abono;
// Monto final
// Salida de resultados
System.out.printf("Monto total antes del abono: %.2f%n", montoTotal);
System.out.printf("Valor del abono extraordinario: %.2f%n", abono);
System.out.printf("Monto final a pagar: %.2f%n", montoFinal);
sc.close();
}
}