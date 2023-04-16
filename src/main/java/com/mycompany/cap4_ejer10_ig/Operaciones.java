
package com.mycompany.cap4_ejer10_ig;

public class Operaciones {
    float pagoMatri= 50000;
    public Operaciones(){
    }
    public float setValorAPagar(int patrimonio, byte estraSocial){
        if((patrimonio > 2000000) && (estraSocial > 3) ){
            pagoMatri = (float) (pagoMatri +(patrimonio*0.3));
        }
        return pagoMatri;
    }
    
}
