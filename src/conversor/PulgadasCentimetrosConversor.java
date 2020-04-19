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
public class PulgadasCentimetrosConversor extends Conversor {

    private static final double UNA_PULGADA = 2.54;
    private static final double UN_CENTIMETRO = 2.54;

    @Override
    public String getLabelValor1() {

        return "Pulgadas";
    }

    @Override
    public String toString() {
        return "Pulgadas a Centimetros ";
    }

    @Override
    public Double convertirValor(Double pulg) {
        return pulg / UN_CENTIMETRO;

    }

    @Override
    public String getLabelValor2() {
        return "Centímetros";
    }

}
