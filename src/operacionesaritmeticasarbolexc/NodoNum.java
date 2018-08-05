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
public class NodoNum extends NodoE{
    int numero;
    
    public NodoNum(String numero) {
        this.numero = Integer.parseInt(numero);
        System.out.println("");
    }
    
    @Override
    public int ejecutar(){
        return this.numero;
    }
    
}


