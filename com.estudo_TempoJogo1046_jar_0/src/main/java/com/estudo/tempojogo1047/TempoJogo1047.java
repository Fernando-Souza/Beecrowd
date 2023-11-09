/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.estudo.tempojogo1047;

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
public class TempoJogo1047 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        String[] leitura = input.nextLine().split(" ");
        int[] valores = Arrays.stream(leitura).mapToInt(x -> Integer.parseInt(x)).toArray();
        
        LocalTime inicio = LocalTime.of(valores[0], valores[1]);
        LocalTime fim = LocalTime.of(valores[2], valores[3]);

        System.out.println(calculaTempo(inicio, fim));

    }

    static String calculaTempo(LocalTime inicio, LocalTime fim) {

        LocalDateTime horaInicial = LocalDateTime.of(LocalDate.now(), inicio);
        LocalDateTime horaFinal = LocalDateTime.of(LocalDate.now(), fim);

        long duracao= 24*60 - ((horaInicial.getHour()*60 + horaInicial.getMinute()) - (horaFinal.getHour()*60 + horaFinal.getMinute()));
        long horas;
        long minutos;

        if (duracao>1 & duracao<=1440) {           

            horas = duracao / 60;
            minutos = duracao % 60;

        }else {

            duracao = Math.abs((horaInicial.getHour()*60 + horaInicial.getMinute()) - (horaFinal.getHour()*60 + horaFinal.getMinute()));
            horas = duracao / 60;
            minutos = duracao % 60;

        }

        return "O JOGO DUROU " + horas +" HORA(S) E "+ minutos+ " MINUTO(S)";
    }
}
