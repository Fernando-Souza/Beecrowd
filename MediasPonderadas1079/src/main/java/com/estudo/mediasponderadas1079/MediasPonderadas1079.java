/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.mediasponderadas1079;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class MediasPonderadas1079 {

    public static Scanner input= new Scanner(System.in).useLocale(Locale.US);

    public static class CalculaMedias {

       
        public double[][] valores;
        public int[] pesos;

        public CalculaMedias(double[][] valores, int[] pesos) {

            
            this.valores = valores;
            this.pesos = pesos;

        }

        public Map<Double, Integer> mediaPonderada(int casos) {

            return IntStream.range(0,valores[casos].length).boxed()
                    .collect(Collectors.toMap(i -> valores[casos][i], i -> pesos[i]));

        }
        
       

        public double calculaMediaPonderada(Map<Double,Integer> valores) {
            
            /*
            DecimalFormat formatador = new DecimalFormat("#.#");
            formatador.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
*/
            double numerador = 0;
            double denominador = 0;
            
            for (Map.Entry<Double, Integer> entrada : valores.entrySet()) {
                numerador += entrada.getKey() * entrada.getValue();
                denominador += entrada.getValue();
            }
            
            return (numerador / denominador);

        }
        
         }

    public static void main(String[] args) {
        
        int nLinha = input.nextInt();
        double[][]valores= new double[nLinha][3];
        int[] pesos = new int[]{2,3,5};
        double[] medias = new double[nLinha];        
        
      
        for(int i=0;i<nLinha;++i){            
            for(int j=0;j<3;j++){
                
                valores[i][j]=input.nextDouble();
                
            }

        
        }
        
        CalculaMedias calculaMedia = new CalculaMedias(valores,pesos);
        
             
        
        for(int j=0;j<nLinha;j++){           
            
        medias[j]=calculaMedia.calculaMediaPonderada(calculaMedia.mediaPonderada(j));
        
        }
        
        
       
        
        for(int t=0;t<nLinha;t++){
            
            System.out.printf("%.1f\n",medias[t]);
            
        }

    }

}
