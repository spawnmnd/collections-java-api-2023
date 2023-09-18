package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList; 

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("nome2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("nome3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("nome4", 17, 1.56);

        System.out.println("--------------------------------");
        System.out.println("Ordenando por idade");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("--------------------------------");
        System.out.println("Ordenando por altura");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println("\nEncerrando programa.");
    }
}
