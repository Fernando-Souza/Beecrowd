/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.tempojogo1046;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TempoJogo1046 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        String[] leitura = input.nextLine().split(" ");
        int[] valores = Arrays.stream(leitura).mapToInt(x -> Integer.parseInt(x)).toArray();
        
         System.out.printf("%S%n",calculaTempo(valores[0],valores[1]));
        
    }

    static String calculaTempo(int inicio, int fim) {

        LocalDateTime horaInicial = LocalDateTime.of(LocalDate.now(), LocalTime.of(inicio, 0));
        LocalDateTime horaFinal = LocalDateTime.of(LocalDate.now(), LocalTime.of(fim, 0));
        
        long duracao;
        
        if(horaInicial.getHour()< horaFinal.getHour()){

        duracao = Duration.between(horaInicial, horaFinal).toHours();
        
        }else{
            
            duracao = 24-horaInicial.getHour() + horaFinal.getHour();
            
        }        

        return "O JOGO DUROU " + duracao + " HORA(S)";
    }
}
