/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudo.tempodeumevento1061;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class TempoDeUmEvento1061 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        String diaInit = input.nextLine();
        String horaInit = input.nextLine();
        String diaFim = input.nextLine();
        String horaFim = input.nextLine();
        
        String resposta = calculaDuracao(diaInit,horaInit,diaFim,horaFim);
        
        System.out.print(resposta);
    }
    
    public static String calculaDuracao(String diaInit, String horaInit,String diaFim, String horaFim) {
        
        String[] horaAuxInit = horaInit.split(" : ");
        String[] horaAuxFim = horaFim.split(" : ");
        
        LocalDate dataInicio = LocalDate.of(2023, Month.APRIL, Integer.parseInt(diaInit.split(" ")[1]));
        LocalDate dataFim = LocalDate.of(2023, Month.APRIL, Integer.parseInt(diaFim.split(" ")[1]));
        LocalTime horarioInicio = LocalTime.of(Integer.valueOf(horaAuxInit[0]),Integer.parseInt(horaAuxInit[1]), Integer.parseInt(horaAuxInit[2]));
        LocalTime horarioFim = LocalTime.of(Integer.parseInt(horaAuxFim[0]),Integer.parseInt(horaAuxFim[1]), Integer.parseInt(horaAuxFim[2]));
        
        LocalDateTime inicio = LocalDateTime.of(dataInicio,horarioInicio);
        LocalDateTime fim = LocalDateTime.of(dataFim,horarioFim);
        
     long numberDays = Duration.between(inicio, fim).toDaysPart();
     long numberHours = Duration.between(inicio, fim).toHoursPart();
     long numberMinutes = Duration.between(inicio, fim).toMinutesPart();
     long numberSeconds = Duration.between(inicio, fim).toSecondsPart();
        
        
        
        return numberDays + " dia(s)\n" + numberHours + " hora(s)\n" + numberMinutes + " minuto(s)\n" + numberSeconds + " segundo(s)\n";
    }
}
