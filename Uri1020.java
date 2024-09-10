package beecrowd2;

import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idadeEmDias = teclado.nextInt();
        int ano = 365;
        int dia = 30;
        int calculo = idadeEmDias / ano;
        int calculo2 = (idadeEmDias % ano) / dia;
        int calculo3 = (idadeEmDias % ano) % dia;
        
        System.out.println(calculo +" ano(s)");
        System.out.println(calculo2 +" mes(es)");
        System.out.println(calculo3  +" dia(s)");
        teclado.close();

    }
}
