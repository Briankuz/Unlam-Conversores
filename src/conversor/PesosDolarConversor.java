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
public class PesosDolarConversor extends Conversor {

    private static final double UN_PESO = 85.0;
    private static final double UN_DOLAR = 85.0;

    @Override
    public String getLabelValor1() {
        return "Pesos";
    }

    @Override
    public String toString() {
        return "Pesos a Dolar ";
    }

    @Override
    public String getLabelValor2() {
        return "Dolar";
    }

    @Override
    public Double convertirValor(Double pesos) {
        return pesos / UN_DOLAR;
    }

}
