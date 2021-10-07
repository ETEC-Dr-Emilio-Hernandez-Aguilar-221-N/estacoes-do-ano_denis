/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Qual_Estacao {
    public static void main(String[] args) {
        //variaveis
        int dia, mes;
        //entrada
        Scanner entrada = new Scanner(System.in);
        //Exibição inicial
        System.out.println("\n\t Bem-vindo! Siga as orientações abaixo.");
        System.out.printf("\n\t\t Insira o dia em que estamos: ");
        dia = entrada.nextInt();
        System.out.printf("\n\t\t Insira o mês em que estamos: ");
        mes = entrada.nextInt();
        
        //condições de validação de entradas
        if((dia>31)||(dia<0)||(mes>12)||(mes<1)){
            System.out.println("Valores inválidos, encerrando...");
        }
        
        //condiçao para verão
        else if((mes<=3)||(mes==12)){
            if ((mes==3)&&(dia<20)||(mes==12)&&(dia>21))
                System.out.println("\t\tEstamos no verão!!!!");
            else if ((mes==2)||(mes==1))
                System.out.printf("\t\tEstamos no verão!!!!");
            else
                System.out.printf("\t\tEstamos no outono!!!!");
            
        //condiçao para outono   
        }else if ((mes==3)||(mes==4)||(mes==5)||(mes==6)){
            if ((mes==3)&&(dia>20)||(mes==6)&&(dia<21))
                System.out.printf("\t\tEstamos no outono!!!!");
            else if ((mes==4)||(mes==5))
                System.out.printf("\t\tEstamos no outono!!!!");
            else
                System.out.println("\t\tEstamos no inverno!!!!");
            
        //condiçao para inverno
        }else if((mes==6)||(mes==7)||(mes==8)||(mes==9)){
            if ((mes==6)&&(dia>20)||(mes==9)&&(dia<23))
                System.out.printf("\t\tEstamos no inverno!!!!");
            else if ((mes==7)||(mes==8))
                System.out.printf("\t\tEstamos no inverno!!!!");
            else
                System.out.printf("\t\tEstamos no primavera!!!!");
            
        //condiçao para primavera 
        }else if(mes>=9){
            if ((mes==9)&&(dia>22)||(mes==12)&&(dia<22))
                System.out.printf("\t\tEstamos na primavera!!!!");
            else if ((mes==10)||(mes==11))
                System.out.printf("\t\tEstamos no primavera!!!!");
            else
                System.out.printf("\t\tEstamos no verão!!!!");
        }
    }    
}
