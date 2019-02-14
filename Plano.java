
package Plano;

public class Plano {
    private String descricao;
    private double valor;
    
    public Plano(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;//
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Plano:\n\n"+
                "Descrição: "+this.descricao+"\n"+
                "Valor: R$ "+this.valor;
    }
    
}
