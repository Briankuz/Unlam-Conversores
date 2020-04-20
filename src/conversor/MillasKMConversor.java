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
public class MillasKMConversor extends Conversor{
    private static final Double EQUIVALENTE=0.62137;
    @Override
    public String getLabelValor1() {
        return "Millas";
    }

    @Override
    public String getLabelValor2() {
        return "Kilometros";
    }

    @Override
    public Double convertirValor(Double valor) {
        return valor/EQUIVALENTE;
    }
      @Override
    public String toString(){
        return "Millas a KM";
    }
    
}
