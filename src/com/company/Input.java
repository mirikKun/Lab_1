package com.company;

import java.util.Scanner;

public class Input {
    private static Propety ff;
    public static Propety newIn()
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите итоговый сепаратор:");
        String plus = Scan.nextLine();
        if (!plus.equals("")) {
            System.out.println("Введите путь к файлу:");
            String to = Scan.nextLine();
            if (!to.equals("")){
                System.out.println("Введите путь создания:");
                String from = Scan.nextLine();
                if (!from.equals("")){
                    System.out.println("Введите сепаратор:");
                    String sep = Scan.nextLine();
                    if (!sep.equals(""))
                        ff=new Propety(to,plus,from,sep.charAt(0));
                    else
                        ff=new Propety(to,plus,from);
                }
                else ff=new Propety(to,plus);
            }
            else
                ff=new Propety(plus);
        }
        else{
            ff= new Propety();
        }
        return ff;
    }
}
