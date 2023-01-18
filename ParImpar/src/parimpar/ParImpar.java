/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parimpar;

import java.util.Scanner;

/**
Crie um projeto com uma classe que faça a leitura de um número, identifique se é par ou ímpar, e mostre na classe principal:
 */
public class ParImpar {
    int num1;//Declaração das variáveis
    int resto;
    
    public void verificaNum(){//Declaração do Método
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite um número inteiro:");
    num1 = ler.nextInt();
    resto = num1%2;
    
    if (resto==0){
        System.out.println("O número informado é par");
    }else{
        System.out.println("O número informado é ímpar");
    }
    ler.close();//objeto.close() = fecha o a função scanner
    }
   
            
}
