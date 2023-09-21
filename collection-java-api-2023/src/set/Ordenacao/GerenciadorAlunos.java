package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos(){
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if(!alunoSet.isEmpty()){
            for(Aluno a : alunoSet){
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            System.out.println("Conjunto vazio.");
        }

        if(alunoParaRemover == null){
            System.out.println("Não existe aluno com este número de matrícula.");
        }
        
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorMedia());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public Set<Aluno> exibirAlunos(){        
        return alunoSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        System.out.println("\n");
        System.out.println("Exibindo conjunto vazio:");
        System.out.println(gerenciadorAlunos.exibirAlunos());
        System.out.println("\n");
        System.out.println("Adicionando alunos:");
        gerenciadorAlunos.adicionarAluno("Marcelo", 10001L, 10d);
        gerenciadorAlunos.adicionarAluno("Marcelo2", 10001L, 3d);
        gerenciadorAlunos.adicionarAluno("Larissa", 10055L, 9.5d);
        gerenciadorAlunos.adicionarAluno("Jonas", 9991L, 4d);
        System.out.println(gerenciadorAlunos.exibirAlunos());
        System.out.println("\n");
        System.out.println("Exibindo alunos em ordem Alfabética:");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("\n");
        System.out.println("Exibindo alunos por ordem crescente de notas:");   
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());     
        System.out.println("\n");
        System.out.println("Excluindo um aluno do conjunto:");
        gerenciadorAlunos.removerAluno(9991L);
        System.out.println(gerenciadorAlunos.exibirAlunos());
    }
}
