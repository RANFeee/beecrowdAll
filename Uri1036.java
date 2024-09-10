package beecrowd2;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1036 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00000");
        if (a == 0){
            System.out.println("Impossivel calcular");
        }else{
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Impossivel calcular");
            }else{
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);

                System.out.println("R1 = " + df.format(x1));
                System.out.println("R2 = " + df.format(x2));
            }
        }
        teclado.close();
        
    }
}
