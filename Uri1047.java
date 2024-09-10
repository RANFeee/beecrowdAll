package beecrowd2;

import java.util.Scanner;

public class Uri1047 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horaI = teclado.nextInt();
        int minI = teclado.nextInt();
        int horaF = teclado.nextInt();
        int minF = teclado.nextInt();
        int minutosIniciais = horaI * 60 + minI;
        int minutosFinais = horaF * 60 + minF;
        int duracaoMinuto;
        if (horaI == horaF && minI == minF) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            if (minutosFinais >= minutosIniciais) {
                duracaoMinuto = minutosFinais - minutosIniciais;
            } else {
                duracaoMinuto = (1440 - minutosIniciais) + minutosFinais;
            }
            int horas = duracaoMinuto / 60;
            int minutos = duracaoMinuto % 60;
    
            System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

        }

        teclado.close();
    }
}
