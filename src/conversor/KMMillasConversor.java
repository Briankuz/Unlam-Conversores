/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author matias
 */
public class KMMillasConversor extends Conversor {
    private static final Double EQUIVALENTE=0.62137;
    
    @Override
    public String getLabelValor1() {
        return "Kilometros";
    }

    @Override
    public String getLabelValor2() {
        return "Millas";
    }
    @Override
    public String toString(){
        return "KM a Millas";
    }

    @Override
    public Double convertirValor(Double valor) {
        return valor*EQUIVALENTE;
    }
    
}
