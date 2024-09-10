package beecrowd2;

import java.util.Scanner;

public class Uri1043 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor1 = teclado.nextDouble();
        double valor2 = teclado.nextDouble();
        double valor3 = teclado.nextDouble();
        if ((valor1 + valor2) > valor3 && (valor1 + valor3) > valor2 && (valor2 + valor3) > valor1) {
            double perimetro = valor1 + valor2 + valor3;
            System.out.println("Perimetro = " + perimetro);
        } else {
            double area = ((valor1 + valor2) * valor3) / 2;
            System.out.println("Area = " + area);
        }
        teclado.close();
    }
}
