package list.Ordenacao;

public class Numero implements Comparable<Numero>{
    //atributo
    private int num;

    public Numero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "num=" + num;
    }

    @Override
    public int compareTo(Numero n) {        
        return Integer.compare(num, n.getNum());
    }

    
}
