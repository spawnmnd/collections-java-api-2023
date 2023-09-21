package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo

    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
        
    }

    public void adicionarProdutos(Long cod, String nome, double preco, int quantidade){
        this.produtoSet.add(new Produto(cod, nome, preco, quantidade));

    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtoPorPreco.addAll(produtoSet);
            return produtoPorPreco;
        
    }
    
    @Override
    public String toString() {
        return "CadastroProdutos [produtoSet=" + produtoSet + "]";
    }

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println(cadastroProdutos);

        cadastroProdutos.adicionarProdutos(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProdutos(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProdutos(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProdutos(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
