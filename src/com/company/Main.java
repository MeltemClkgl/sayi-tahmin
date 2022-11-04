package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int sayi = random.nextInt(10);
        Scanner scan = new Scanner(System.in);
        int tahmin;
        System.out.println("Aklimda bir sayi tuttum, hadi tahmin et :P");
        System.out.print("Tahmin: ");
        tahmin = scan.nextInt();

        while(true){
            if(tahmin < sayi){
                System.out.print("Yanlis tahmin, az daha yukselt: ");
                tahmin = scan.nextInt();
            }
            else if(tahmin > sayi){
                System.out.print("Hop nereye cok uctun bilader, az dusur tahmini: ");
                tahmin = scan.nextInt();
            }
            else{
                System.out.println("Dogru tahmin, 100 puan kazandin");
                break;
            }
        }


    }
}
