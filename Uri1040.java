package beecrowd2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1040 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner teclado = new Scanner(System.in);
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double n3 = teclado.nextDouble();
        double n4 = teclado.nextDouble();
        final int pesoA = 2;
        final int pesoB = 3;
        final int pesoC = 4;
        final int pesoD = 1;
        double media = (n1 * pesoA + n2 * pesoB + n3 * pesoC + n4 * pesoD) / (pesoA + pesoB + pesoC + pesoD);
        
        if (media >= 7.0) {
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno aprovado.");
        } else {
            if (media < 5.0) {
                System.out.println("Media: " + df.format(media));
                System.out.println("Aluno reprovado.");
            } else {
                if (media >= 5.0 && media <= 6.9) {
                    double notaExame = teclado.nextDouble();
                    System.out.println("Media: " + df.format(media));
                    System.out.println("Aluno em exame.");
                    System.out.println("Nota do exame: " + notaExame);
                    notaExame = (notaExame + media)/2;
                    if (notaExame >= 5.0) {
                        System.out.println("Aluno aprovado.");
                        System.out.println("Media final: " + df.format(notaExame));
                    } else {
                        System.out.println("Aluno reprovado" + df.format(notaExame));
                    }
                }
            }
        }

        teclado.close();
    }
}
