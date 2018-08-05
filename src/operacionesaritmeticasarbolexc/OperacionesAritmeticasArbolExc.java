/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesaritmeticasarbolexc;

import java.io.FileInputStream;

/**
 *
 * @author charly
 */
public class OperacionesAritmeticasArbolExc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      interpretar("prueba.txt");
    }
    
        private static void interpretar(String path) {
             Sintactico pars;
            NodoE raiz;
            try {
                pars = new Sintactico(new escaner(new FileInputStream(path)));
                pars.parse();
                raiz = pars.raiz;
                System.out.println(raiz.ejecutar());
               // raiz.ejecutar_al_reves();
            } catch (Exception ex) {
                System.out.println("Error fatal en compilación de entrada.");
            }
        }
}
