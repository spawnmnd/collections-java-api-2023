package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra){        
        if(!palavraSet.isEmpty()){            
            if(palavraSet.contains(palavra)){
                palavraSet.remove(palavra);
            } else{
                System.out.println("Palavra " + palavra + " não encontrada.");
            }
    } else{
        System.out.println("Conjunto vazio.");
    }
}

    public Boolean verificaPalavra(String palavra){        
        return palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavraSet.isEmpty()){
            System.out.println(palavraSet);
        } else {
            System.out.println("Conjunto vazio.");
        }
        
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();                
        System.out.println("-------------------------------------"); 
        System.out.println("Exibindo conjunto:\n");     
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();   
        System.out.println("-------------------------------------"); 
        System.out.println("Adicionando palavras ao conjunto.\n");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavr1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavr2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavr3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavr4");
        System.out.println("-------------------------------------");
        System.out.println("Exibindo conjunto:\n");  
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println("-------------------------------------");    
        System.out.println("Verificando palavra.\n");
        System.out.println("Esta palavra está presente no conjunto? " + conjuntoPalavrasUnicas.verificaPalavra("Palavr5")); 
        System.out.println("-------------------------------------");    
        System.out.println("Verificando palavra.\n");
        System.out.println("Esta palavra está presente no conjunto? " + conjuntoPalavrasUnicas.verificaPalavra("Palavr3"));  
        System.out.println("-------------------------------------");    
        System.out.println("Removendo palavra.\n");
        conjuntoPalavrasUnicas.removerPalavra("Palavr3");
        System.out.println("-------------------------------------");
        System.out.println("Exibindo conjunto:\n");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();  
        System.out.println("-------------------------------------");
    }
}
