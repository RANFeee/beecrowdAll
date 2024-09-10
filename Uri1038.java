package beecrowd2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        int codigo = teclado.nextInt();
        int quantidade = teclado.nextInt();
        double item1 = 4.00;
        double item2 = 4.50;
        double item3 = 5.00;
        double item4 = 2.00;
        double item5 = 1.50;
        double valorPagar;
        if (codigo == 1) {
            valorPagar = item1 * quantidade;
            System.out.println("Total: R$ " + df.format(valorPagar));
        } else {
            if (codigo == 2) {
                valorPagar = item2 * quantidade;
                System.out.println("Total: R$ " + df.format(valorPagar));
            } else {
                if (codigo == 3) {
                    valorPagar = item3 * quantidade;
                    System.out.println("Total: R$ " + df.format(valorPagar));
                } else {
                    if (codigo == 4) {
                        valorPagar = item4 * quantidade;
                        System.out.println("Total: R$ " + df.format(valorPagar));
                    } else {
                        if (codigo == 5) {
                            valorPagar = item5 * quantidade;
                            System.out.println("Total: R$ " + df.format(valorPagar));
                        }
                    }
                }
            }
        }
        
        teclado.close();
    }
}
