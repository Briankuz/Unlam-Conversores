/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Administrador
 */
public class DolarPesosConversor extends Conversor {
     private static final double UN_PESO = 85.0;
    private static final double UN_DOLAR = 85.0;

    @Override
    public String getLabelValor1() {
        return "Dolar";
    }

     @Override
    public String toString() {
        return "Dolar a Pesos ";
    }
    
    
    @Override
    public Double convertirValor1Valor2(Double dolar) {
       return UN_PESO * dolar;
    }

    @Override
    public String getLabelValor2() {
        return "Pesos";
    }

    @Override
    public Double convertirValor2Valor1(Double pesos) {
        return pesos/UN_DOLAR;
    }
    
}
