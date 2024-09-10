package beecrowd2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X = teclado.nextInt();
        double Y = teclado.nextDouble();
        double consumoMedio = X / Y;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(consumoMedio) + " km/l");
        teclado.close();
    }
}
