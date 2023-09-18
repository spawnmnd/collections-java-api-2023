package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    private List<Integer> numerosList;
    

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public int calcularSoma(){
        int resultado = 0; 
        if(!numerosList.isEmpty()){            
            for(Integer i : numerosList){
                resultado += i;
            }
        }        
        return resultado;
    }

    public int encontrarMaiorNumero(){
        int maior=0;
        if(!numerosList.isEmpty()){
            for(Integer i : numerosList){                
                if(i>maior){
                    maior = i;
                } 
            }            
        }
        return maior;
    }

    
    public int encontrarMenorNumero(){
        int menor=0;        
        if(!numerosList.isEmpty()){
            for(Integer i : numerosList){
                if(i<=menor){
                    menor = i;
                }
            }
        }
        return menor;
    } 

    public List<Integer> exibirNumeros(){
        List<Integer> listaNumeros = new ArrayList<>();
        if(!numerosList.isEmpty()){
            for(Integer i : numerosList){
                listaNumeros.add(i);
            }
        }
        return listaNumeros;
    }

    

    @Override
    public String toString() {
        return "[" + numerosList + "]";
    }

    public static void main(String[] args) {
        SomaNumeros listaDeNumeros = new SomaNumeros();

        listaDeNumeros.adicionarNumero(1);
        listaDeNumeros.adicionarNumero(-2);
        listaDeNumeros.adicionarNumero(4);
        listaDeNumeros.adicionarNumero(0);
        listaDeNumeros.adicionarNumero(5);
        listaDeNumeros.adicionarNumero(3);

        System.out.println("-----------------");
        System.out.println(listaDeNumeros.exibirNumeros());
        System.out.println("-----------------");
        System.out.println(listaDeNumeros.calcularSoma());
        System.out.println("-----------------");
        System.out.println(listaDeNumeros.encontrarMaiorNumero());
        System.out.println("-----------------");
        System.out.println(listaDeNumeros.encontrarMenorNumero());
    }
    
}
