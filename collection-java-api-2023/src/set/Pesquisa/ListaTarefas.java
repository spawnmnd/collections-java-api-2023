package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaSet.remove(t);
                    break;
                } 
            }
        } else {
            System.out.println("Conjunto vazio.");
        }    
    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        } else {
            System.out.println("Conjunto Vazio.");
            System.out.println(tarefaSet);
        }
        
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa f : tarefaSet){
                if(f.isFeito()){
                    tarefasConcluidas.add(f);
                }
            }
        } else {
            System.out.println("Conjunto vazio.");   
        }         
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()){
            for(Tarefa f : tarefaSet){
                if(!f.isFeito()){
                    tarefasPendentes.add(f);                    
                }
            }
        } else {
            System.out.println("Conjunto vazio.");
        }
    return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa f : tarefaSet){
                if(f.getDescricao().equalsIgnoreCase(descricao)){
                    f.setFeito(true);
                    break;
                }
            }
        } else {
            System.out.println("Conjunto vazio.");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa f : tarefaSet){
                if(f.getDescricao().equalsIgnoreCase(descricao)){
                    f.setFeito(false);
                }
            }
        } else {
            System.out.println("Conjunto vazio.");
        }
    }

    public void limparListaTarefas(){
        if(tarefaSet.isEmpty()){
            System.out.println("Conjunto já está vazio.");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaDeCompras = new ListaTarefas();

        System.out.println("\n\n");
        System.out.println("Exibindo lista vazia:");
        listaDeCompras.exibirTarefas();
        System.out.println("\n\n");
        System.out.println("Adicionando itens à lista de compras:");
        System.out.println("O que preciso comprar?\n");
        listaDeCompras.adicionarTarefa("Feijão");
        listaDeCompras.adicionarTarefa("Macarrão");
        listaDeCompras.adicionarTarefa("Legumes");
        listaDeCompras.adicionarTarefa("Carne");
        listaDeCompras.exibirTarefas();
        System.out.println("\n\n");
        System.out.println("Total de itens que preciso comprar: " + listaDeCompras.contarTarefas());
        System.out.println("\n\n");
        System.out.println("Itens que ainda não comprei:\n" + listaDeCompras.obterTarefasPendentes());
        System.out.println("\n");
        System.out.println("Marcando itens que acabei de colocar no carrinho:\n");
        listaDeCompras.marcarTarefaConcluida("macarrão");
        listaDeCompras.marcarTarefaConcluida("feijão");
        listaDeCompras.obterTarefasConcluidas();     
        System.out.println("Atualizando a lista e mostrando itens que ainda faltam ser pegos: \n" + listaDeCompras.obterTarefasPendentes());   
        System.out.println("\n");
        listaDeCompras.marcarTarefaPendente("Feijão");
        System.out.println("Devolvendo um item para pegar depois.\n");
        System.out.println("Atualizando a lista e mostrando itens que ainda faltam ser pegos: \n" + listaDeCompras.obterTarefasPendentes());
        System.out.println("\n");
        System.out.println("Acabei de pegar todos meus itens e estou no caixa pagando.");
        System.out.println("Estou indo pra casa e joguei minha lista no lixo.");
        listaDeCompras.limparListaTarefas();
        listaDeCompras.exibirTarefas();
        
    }
}

