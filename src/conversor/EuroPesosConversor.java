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
public class EuroPesosConversor extends Conversor {

    private static final double VALOR_PESO_EURO = 96.5;

    @Override
    public String getLabelValor1() {
        return "Euro";
    }

    @Override
    public String toString() {
        return "Euro a Pesos ";
    }

    @Override
    public String getLabelValor2() {
        return "Pesos";
    }

    @Override
    public Double convertirValor(Double CantidadDeEuros) {
        return CantidadDeEuros * VALOR_PESO_EURO;
    }

}
