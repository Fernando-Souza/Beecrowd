package com.estudo.crescimentopopulacional_1160;

import java.util.Locale;
import java.util.Scanner;

public class CrescimentoPopulacional_1160 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int T = input.nextInt();
        String[] teste;
        StringBuilder output = new StringBuilder();
        input.nextLine();
        int pa, pb;
        int contador = 0;
        double g1, g2;

        for (int i = 0; i < T; i++) {
            teste = input.nextLine().split(" ");
            pa = Integer.parseInt(teste[0]);
            pb = Integer.parseInt(teste[1]);
            g1 = Double.parseDouble(teste[2]);
            g2 = Double.parseDouble(teste[3]);

            while (true) {
                pa += Math.floor(pa * (g1 / 100));
                pb += Math.floor(pb * (g2 / 100));
                contador++;
                if (contador > 100) {
                    output.append("Mais de 1 seculo.").append("\n");
                    break;
                }
                if (pa > pb) {
                    output.append(contador).append(" anos.\n");
                    break;
                }

            }

            contador = 0;
        }
        System.out.print(output.toString());
    }
}
