
package Plano;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pagamento {
    private Date data;
    private float valor_total;
    private boolean incidencia_juros ;
    private float multa;
    
    public Pagamento(){
        Date dataAtual = new Date();
        this.data = dataAtual;
        this.incidencia_juros = false;
        this.valor_total = 0;
        this.multa = multa;
    }

    public boolean getIncidencia_juros() {
        return incidencia_juros;
    }

    public void setIncidencia_juros(boolean incidencia_juros) {
        this.incidencia_juros = incidencia_juros;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public Date getData() {
        return data;
    }

    public float getValor_total() {
        return valor_total;
    }
    
    public double calcularValorTotal(){
        
        return 0;
    }
    String formato = "dd/mm/yyyy HH:MM";
    DateFormat df = new SimpleDateFormat(formato);
    @Override
    public String toString() {
        return "Boleto: \n\n"+
               "Data: "+df.format(this.data)+"\n"+
               "Incidência de juros: "+this.incidencia_juros+"\n"+
                "Multa: "+this.multa+"\n"+
                "Valor total: R$"+this.valor_total;
    }

  
    
    
    
}
