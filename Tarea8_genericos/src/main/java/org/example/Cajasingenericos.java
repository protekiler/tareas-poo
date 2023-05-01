package org.example;

import java.util.Arrays;

public class Cajasingenericos {
    Object[] content;

    public Cajasingenericos() {
    }

    public Cajasingenericos(Object[] content) {
        this.content = content;
    }

    public void add(int posicion, Object objeto) {
        content[posicion] = objeto;
    }

    public Object get(int posicion) {
        return content[posicion];
    }

    @Override
    public String toString() {
        return "Cajasingenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
