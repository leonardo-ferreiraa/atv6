/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.horario;

/**
 *
 * @author  Leonardo Ferreira da Silva Vieira 11211100857@alunos.umc.br
 */
public class Relogio {
     private int hora;
    private int minuto;
    private int segundo;

    //construtor #1
    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    //construtor #2
    public Relogio(int h) {
        hora = h;
        if (h < 0) {
            hora = 0;
        }
        if (h > 24) {
            hora = 24;
        } else {
            hora = h;
        }
        minuto = 0;
        segundo = 0;
    }

    //construtor #3
    public Relogio(int h, int m) {
        hora = h;
        if (h < 0) {
            hora = 0;
        }
        if (h > 24) {
            hora = 24;
        } else {
            hora = h;
        }
        minuto = m;
        if (m < 0) {
            minuto = 0;
        }
        if (m > 59) {
            minuto = minuto - 60;
            hora = hora + 1;
        } else {
            minuto = m;
        }

        segundo = 0;
    }

    //construtor #4
    public Relogio(int h, int m, int s) {
        hora = h;
        if (h < 0) {
            hora = 0;
        }
        if (h > 24) {
            hora = 24;
        } else {
            hora = h;
        }
        minuto = m;
        if (m < 0) {
            minuto = 0;
        }
        if (m > 59) {
            minuto = minuto - 60;
            hora = hora + 1;
        } else {
            minuto = m;
        }

        segundo = s;
        if (s < 0) {
            segundo = 0;
        }
        if (s > 59) {
            segundo = segundo - 60;
            minuto = minuto + 1;
        } else {
            segundo = s;
        }
    }

    //metodos de acesso
    public void setHora(int x) {
        if (x < 0) {
            hora = 0;
        }
        if (x > 24) {
            hora = 24;
        } else {
            hora = x;
        }

    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int x) {
        minuto = x;
        if (x < 0) {
            minuto = 0;
        }
        if (x > 59) {
            minuto = minuto - 60;
            hora = hora + 1;
        } else {
            minuto = x;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int x) {
        segundo = x;
        if (x < 0) {
            segundo = 0;
        }
        if (x > 59) {
            segundo = segundo - 60;
            minuto = minuto + 1;
        } else {
            segundo = x;
        }
    }

    public int getSegundo() {
        return segundo;
    }

}
