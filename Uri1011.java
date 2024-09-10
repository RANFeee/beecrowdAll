package beecrowd2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double pi = 3.14159;
        double raio = teclado.nextDouble();
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        DecimalFormat df = new DecimalFormat("###.000");
        System.out.println("VOLUME = " + df.format(volume));
        teclado.close();
    }
}
