/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Laura
 */
public class OnzaLitroConversor extends Conversor {

    private static final Double CONVERSOR = 33.814;

    @Override
    public String getLabelValor1() {
        return "Onzas";
    }

    @Override
    public String getLabelValor2() {
        return "Litros";
    }

    @Override
    public String toString() {
        return "Onzas a Litros";
    }

    @Override
    public Double convertirValor(Double onzas) {
        return onzas / CONVERSOR;
    }

}
