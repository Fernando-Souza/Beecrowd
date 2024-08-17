/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.mediasponderadas1079_2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class MediasPonderadas1079{
    
     public static Scanner input= new Scanner(System.in).useLocale(Locale.US);
    
    public static double mediaPonderada(double[]valores,int[]pesos) {
            
            double numerador=0;
            int denominador=0;
            
            for(int i=0;i<valores.length;++i){
                
                numerador += valores[i]*pesos[i];
                denominador += pesos[i];
                
            }

            
            return  numerador/denominador;

        }
    
    public static String formataMedia(double media) {           
            

            DecimalFormat formatador = new DecimalFormat("#.#");
            formatador.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            
            return formatador.format(media);

        }

    public static void main(String[] args) {
        
        int nLinha = input.nextInt();
        double[][]valores= new double[nLinha][3];
        int[] pesos = new int[]{2,3,5};
        String[]medias = new String[nLinha];
        
      
        for(int i=0;i<nLinha;++i){            
            for(int j=0;j<3;j++){
                
                valores[i][j]=input.nextDouble();
                
            }

        
        }
        
        for(int j=0;j<nLinha;j++){
            
        medias[j] = formataMedia(mediaPonderada(valores[j],pesos));
        
        }
        
        for(int t=0;t<nLinha;t++){
            
            System.out.printf("%.1f\n",mediaPonderada(valores[t],pesos));
            
        }
        
        
    }
}
