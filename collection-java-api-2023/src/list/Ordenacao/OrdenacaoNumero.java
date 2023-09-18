package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    //atributo
    private List<Numero> numeroList;

    public OrdenacaoNumero(){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente(){
        List<Numero> ordenarAscendente = new ArrayList<>(numeroList);
        Collections.sort(ordenarAscendente);
        return ordenarAscendente;
    }

    public List<Numero> ordenarDescendente(){
        List<Numero> ordenarDescendente = new ArrayList<>(numeroList);
        ordenarDescendente.sort(Collections.reverseOrder());
        return ordenarDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(5);
        ordenacaoNumero.adicionarNumero(2);
        ordenacaoNumero.adicionarNumero(4);
        ordenacaoNumero.adicionarNumero(3);

        System.out.println("------------");
        System.out.println("Imprimindo lista:\n");
        System.out.println(ordenacaoNumero.numeroList);
        System.out.println("\n------------");
        System.out.println("Ordenando na ordem crescente:\n");
        System.out.println(ordenacaoNumero.ordenarAscendente());
        System.out.println("\n------------");
        System.out.println("Ordenando na ordem decrescente:\n");
        System.out.println(ordenacaoNumero.ordenarDescendente());
        System.out.println("\n------------");
    }
}
