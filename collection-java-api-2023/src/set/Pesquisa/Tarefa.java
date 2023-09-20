package set.Pesquisa;

public class Tarefa {
    //atributos
    private String descricao;
    private boolean feito;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.feito = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFeito() {
        return feito;
    }

    public void setFeito(boolean feito) {
        this.feito = feito;
    }

    @Override
    public String toString() {
        return "" + descricao + "";
    } 

    
}
