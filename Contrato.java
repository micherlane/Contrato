
package Plano;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Contrato {
    private Date data;
    private float valor_mensal;
    private float coparticipacao;
    private Date data_virgencia;
    
    public Contrato(Date data,float coparticipacao,Date data_vigencia){
        this.data = data;
        this.valor_mensal = 0;
        this.coparticipacao = coparticipacao;
        this.data_virgencia = data_vigencia;
    }
    
    public Date getData() {
        return data;
    }
    
    public float getValor_mensal() {
        return valor_mensal;
    }
    
    public float getCoparticipacao() {
        return coparticipacao;
    }

    public void setCoparticipacao(float coparticipacao) {
        this.coparticipacao = coparticipacao;
    }

    public Date getData_virgencia() {
        return data_virgencia;
    }

    public void setData_virgencia(Date data_virgencia) {
        this.data_virgencia = data_virgencia;
    }
    
    void calcularValorMensal(){
        
    }
    void encerrarContrato(){
        
    }
    void renovarContrato(){
        
    }
    String formato = "dd/mm/yyyy";
    DateFormat df = new SimpleDateFormat(formato);
    @Override
    public String toString() {
        return "Contrato:\n\n"+
               "Data: "+df.format(this.data)+
               "\nValor mensal: R$"  +this.valor_mensal+
                "\nCoparticipação: R$"+this.coparticipacao+
                "Data de virgência: "+this.data_virgencia;
    }
    
}
