/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesaritmeticasarbolexc;

/**
 *
 * @author charly
 */
public class NodoSum extends NodoE {
    NodoE izq, der;
    public NodoSum(NodoE izq, NodoE der) {
        this.izq = izq;
        this.der = der;
    }
    
    public int ejecutar(){
        return izq.ejecutar() + der.ejecutar();
    }
    
}
