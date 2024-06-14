package main.map.Ordenacao;

import java.util.Collection;

public class Evento {
    //atributos
    private String name;

    private String atracao;

    public Evento(String name, String atracao) {
        this.name = name;
        this.atracao = atracao;
    }

    public String getName() {
        return name;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "name='" + name + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
