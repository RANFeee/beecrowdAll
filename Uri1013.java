package beecrowd2;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nmr1 = teclado.nextInt();
        int nmr2 = teclado.nextInt();
        int nmr3 = teclado.nextInt();
        int maioAB = (nmr1+nmr2+Math.abs(nmr1-nmr2))/2;
        int maiorAB = (maioAB + nmr3 + Math.abs(maioAB - nmr3))/2;
        System.out.println(maiorAB + " eh o maior");
        teclado.close();
    }
}
