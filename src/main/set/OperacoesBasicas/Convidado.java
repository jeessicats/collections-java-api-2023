package main.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int codigoconvidado;

    public Convidado(String nome, int codigoconvidado) {
        this.nome = nome;
        this.codigoconvidado = codigoconvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoconvidado() {
        return codigoconvidado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoconvidado() == convidado.getCodigoconvidado();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoconvidado());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoconvidado=" + codigoconvidado +
                '}';
    }
}
