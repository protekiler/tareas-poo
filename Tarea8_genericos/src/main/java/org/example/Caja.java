package org.example;

import java.util.Arrays;

public class Caja<T> {
    public static final int CAPACIDAD = 10;

    private T[] content;

    public Caja() {
    }

    public Caja(T[] content) {

        this.content = content;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public void add(int posicion, T objeto) {
        content[posicion] = objeto;
    }

    public T get(int posicion) {
        return content[posicion];
    }


}
