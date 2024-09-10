package beecrowd2;

import java.util.Scanner;

public class Uri1044 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();
        if (valor2 % valor1 == 0 || valor1 % valor2 == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        teclado.close();

    }
}
