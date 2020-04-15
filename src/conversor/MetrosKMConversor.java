/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * 
 */
public class MetrosKMConversor extends Conversor {
  private static final Double metros = 1000.0;
  private static final Double UN_KM = 1000.0;

    @Override
    public String getLabelValor1() {
        
        return "Metros";
    }

    @Override
    public String toString() {
        return "Metros a KM";
    }

   
    @Override
    public String getLabelValor2() {
        return "Kilometros";
    }
    
   @Override
     public Double convertirValor1Valor2(Double metros) {
         return metros / UN_KM;
     }
 
     @Override
     public Double convertirValor2Valor1(Double km) {
        return km * metros ;
    }
    
    
}
