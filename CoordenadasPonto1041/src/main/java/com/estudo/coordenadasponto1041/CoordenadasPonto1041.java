/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.coordenadasponto1041;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class CoordenadasPonto1041 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        String[] leitura = input.nextLine().split(" ");
        
        String resultado = identificador(converter(leitura));
        
        System.out.printf("%s%n",resultado);
    }
    
     public static double[] converter(String[] x) {

        double[] valores = new double[x.length];

        for (int i = 0; i < x.length; i++) {

            valores[i] = Double.parseDouble(x[i]);
        }
        return valores;
    }
     
     public static String identificador(double[] coordenadas){
         
         String posicao="";
         
         if(coordenadas[0]>0 & coordenadas[1]>0){
             
             posicao = "Q1";
             
         }else if(coordenadas[0]<0 & coordenadas[1]<0){
             
             posicao = "Q3";
         }else if(coordenadas[0]>0 & coordenadas[1]<0){
             
             posicao ="Q4";
         }else if(coordenadas[0]<0 & coordenadas[1]>0){
             
             posicao = "Q2";
         }else if(coordenadas[0]==0 & coordenadas[1]!=0){
             
             posicao = "Eixo Y";
         }
         else if(coordenadas[0]!=0 & coordenadas[1]==0){
             
             posicao = "Eixo X";
         }else if(coordenadas[0]==0 & coordenadas[1]==0){
             
             posicao = "Origem";
         }
         
         return posicao;
     } 
}
