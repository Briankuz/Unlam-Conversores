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
public class PesosEuroConversor extends Conversor {

    private static final double VALOR_PESO_EURO = 96.5;

    @Override
    public String getLabelValor1() {
        return "Pesos";
    }

    @Override
    public String toString() {
        return "Pesos a Euro ";
    }

    @Override
    public String getLabelValor2() {
        return "Euro";
    }

    @Override
    public Double convertirValor(Double CantidadDePesos) {
        return CantidadDePesos / VALOR_PESO_EURO;
    }

}
