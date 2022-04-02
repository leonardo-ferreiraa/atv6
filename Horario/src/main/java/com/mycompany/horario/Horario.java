/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.horario;

/**
 *
 * @author Leonardo Ferreira da Silva Vieira 11211100857@alunos.umc.br
 */
public class Horario {

    public static void main(String[] args) {

        //instancia objeto da classe Relogio
        //utilizando construtor vazio
        Relogio r1 = new Relogio();
        System.out.println("utilizando construtor vazio");
        System.out.println("horario :" + r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
        System.out.println("\n\n");//pula duas linhas
        
        //instancia objeto da classe Relogio
        //utilizando construtor que requer hora, minuto e segundo
        Relogio r2 = new Relogio(115, 70, 98);
        System.out.println("utilizando construtor que requer hora, minuto e segundo");
        System.out.println("horario :" + r2.getHora() + ":" + r2.getMinuto() + ":" + r2.getSegundo());
        System.out.println("\n\n");//pula duas linhas

        Relogio r3 = new Relogio(20);
        System.out.println("utilizando construtor que requer apenas a hora");
        System.out.println("horario :" + r3.getHora() + ":" + r3.getMinuto() + ":" + r3.getSegundo());
        System.out.println("\n\n");//pula duas linhas
        
        //instancia objeto da classe Relogio
        //utilizando construtor que requer hora e minuto
        Relogio r4 = new Relogio(10, 30);
        System.out.println("utilizando construtor que requer hora e minuto");
        System.out.println("horario :" + r4.getHora() + ":" + r4.getMinuto() + ":" + r4.getSegundo());
        System.out.println("\n\n");//pula duas linhas
        
        //instancia objeto da classe Relogio
        //utilizando construtor vazio,
        Relogio r5 = new Relogio();
        System.out.println("utilizando construtor vazio,");
        System.out.println("mas atribuindo valores atraves dos metodos de acesso");
        r5.setHora(13);
        r5.setMinuto(40);
        r5.setSegundo(10);
        System.out.println("horario :" + r5.getHora() + ":" + r5.getMinuto() + ":" + r5.getSegundo());
        System.out.println("\n\n");//pula duas linhas
        
        Relogio r6 = new Relogio();
        System.out.println("ATIVIDADE");
        System.out.println("Declarando apenas uma vez");
        System.out.println(" atribuindo valores atraves dos metodos");
        r6.setHora(12);
        r6.setMinuto(49);
        r6.setSegundo(60);
        System.out.println("horario :" + r6.getHora() + ":" + r6.getMinuto() + ":" + r6.getSegundo());
        System.out.println("\n\n");//pula duas linhas

    }
}
