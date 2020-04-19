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
public class KMMetrosConversor extends Conversor {

    private static final Double metros = 1000.0;
    private static final Double UN_KM = 1000.0;

    @Override
    public String getLabelValor1() {
        return "Kilometros";
    }

    @Override
    public String getLabelValor2() {
        return "Metros";
    }

    @Override
    public String toString() {
        return "KM a Metros";
    }

    @Override
    public Double convertirValor(Double km) {
        return km * metros;
    }

}
