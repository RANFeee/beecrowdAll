package beecrowd2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double distancia = teclado.nextDouble();
        double tempo = teclado.nextDouble();
        double velocidadeMedia = distancia * tempo;
        double eficienciaAutomovel = 12.0;
        double combustivelGasto = velocidadeMedia / eficienciaAutomovel ;
        DecimalFormat df = new DecimalFormat("###.000");
        System.out.printf(df.format(combustivelGasto));
        teclado.close();
    }
}
