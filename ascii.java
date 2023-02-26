package org.example;

import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
            Scanner teclado=new Scanner (System.in);
            System.out.print("anota ");
            //entrada de dato en string
            String input=teclado.nextLine();
            System.out.println("anotaste "+ input);
            //conversion del string para codigo ascii
            int guardadoA=0,guardadoB=0;
            for(int i=0 ; i<=input.length();i++){
                System.out.println((int)input.charAt(i));

                if(guardadoA==0 && guardadoB==0){

                    guardadoA=(int)input.charAt(i);
                    guardadoB=(int)input.charAt(i);
                }
                if(i>0){
                    guardadoB=guardadoA;
                    guardadoA=(int)input.charAt(i);
                    if (guardadoA-guardadoB!=1)
                    {
                        System.out.println("MMM aqui ya hubo un error (false)");
                        break;}
                }
                if(input.length()-i==1){
                    System.out.print("Todo en orden (True)");
                }
            }
        }
    }


