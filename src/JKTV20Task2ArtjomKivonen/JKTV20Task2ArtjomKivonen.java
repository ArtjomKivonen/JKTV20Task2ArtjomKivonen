/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKTV20Task2ArtjomKivonen;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20Task2ArtjomKivonen {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
                        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int number=scanner.nextInt();
        int units=number%10;
        int dozens=(number/10)%10;
        int hundreds=number/100;
        int summ=units+dozens+hundreds;
        System.out.println("Сумма цифр введенного числа="+summ);

    }
    
}
