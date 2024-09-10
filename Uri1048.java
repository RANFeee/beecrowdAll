package beecrowd2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        double salario = teclado.nextDouble();
        double reajuste;
        if (salario >= 0 && salario <= 400.00) {
            reajuste = salario * 0.15;
            System.out.println("Novo salario: " + df.format(salario + reajuste));
            System.out.println("Reajuste ganho: " + df.format(reajuste));
            System.out.println("Em percentual: 15 %");
        } else {
            if (salario >= 400.01 && salario <= 800.00) {
                reajuste = salario * 0.12;
                System.out.println("Novo salario: " + df.format(salario + reajuste));
                System.out.println("Reajuste ganho: " + df.format(reajuste));
                System.out.println("Em percentual: 12 %");
            } else {
                if (salario >= 800.01 && salario <= 1200.00) {
                    reajuste = salario * 0.10;
                    System.out.println("Novo salario: " + df.format(salario + reajuste));
                    System.out.println("Reajuste ganho: " + df.format(reajuste));
                    System.out.println("Em percentual: 10 %");
                } else {
                    if (salario >= 1200.01 && salario <= 2000.00) {
                        reajuste = salario * 0.07;
                        System.out.println("Novo salario: " + df.format(salario + reajuste));
                        System.out.println("Reajuste ganho: " + df.format(reajuste));
                        System.out.println("Em percentual: 7 %");
                    } else {
                        if (salario > 2000.00) {
                            reajuste = salario * 0.04;
                            System.out.println("Novo salario: " + df.format(salario + reajuste));
                            System.out.println("Reajuste ganho: " + df.format(reajuste));
                            System.out.println("Em percentual: 4 %");
                        }
                    }
                }
            }
        }
        teclado.close();
    }
}
