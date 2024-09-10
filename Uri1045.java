package beecrowd2;

import java.util.Scanner;

public class Uri1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Ordenar os valores para garantir que A é o maior lado
        double temp;
        if (B > A) {
            temp = A;
            A = B;
            B = temp;
        }
        if (C > A) {
            temp = A;
            A = C;
            C = temp;
        }
        if (C > B) {
            temp = B;
            B = C;
            C = temp;
        }

        // Verificar se os valores formam um triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Verificar o tipo de triângulo
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            
            // Verificar se é equilátero ou isósceles
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
