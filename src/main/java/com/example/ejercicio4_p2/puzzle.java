package com.example.ejercicio4_p2;

import java.util.ArrayList;
import java.util.Collections;

public class puzzle {
    private int fila;
    private int columna;
    private int[][] bid;

    public puzzle(int fila, int columna) {
        bid=new int[fila][columna];
    }

    public int[][] getBid() {
        return bid;
    }

    public void setBid(int[][] bid) {
        this.bid = bid;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public ArrayList Desordenar(){
        ArrayList<Integer> desordenada=new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            desordenada.add(i+1);
        }
        Collections.shuffle(desordenada);
        for (int i = 0; i < 16; i++) {
            bid[i/4][i%4]=desordenada.get(i);
            if (bid[i/4][i%4]==16){
                fila=i/4;
                columna=i%4;
            }
        }
        return desordenada;
    }
}
