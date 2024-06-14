package main.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadatroProdutos {
    //atributos

    private Set<Produto> produtoSet;

    public CadatroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadatroProdutos cadatroProdutos = new CadatroProdutos();
        cadatroProdutos.adicionarProduto(1L, "Produto 1", 15d, 5);
        cadatroProdutos.adicionarProduto(2L, "Produto 2", 20d, 10);
        cadatroProdutos.adicionarProduto(1L, "Produto 7", 18d, 2);
        cadatroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadatroProdutos.produtoSet);

        System.out.println(cadatroProdutos.exibirProdutosPorNome());

        System.out.println(cadatroProdutos.exibirProdutosPorPreco());
    }
}


