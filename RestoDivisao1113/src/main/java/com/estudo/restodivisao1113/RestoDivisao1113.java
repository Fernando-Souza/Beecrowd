
package com.estudo.restodivisao1113;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author fernando
 */
public class RestoDivisao1113 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int numero1 = input.nextInt();
        input.nextLine();
        int numero2 = input.nextInt();
        input.nextLine();

        if (numero1 < 0) {
            numero1 = input.nextInt();
            input.nextLine();
        }

        if (numero2 < 0) {
            numero2 = input.nextInt();
            input.nextLine();
        }
        
        if(numero1<numero2){
            
            IntStream.rangeClosed(numero1+1, numero2-1).filter(x->x%5==2 || x%5==3).forEach(System.out::println);
            
        }else{
             IntStream.rangeClosed(numero2+1, numero1-1).filter(x->x%5==2 || x%5==3).forEach(System.out::println);
        }

    }
}
