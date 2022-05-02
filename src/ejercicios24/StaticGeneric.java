/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios24;

/**
 *
 * @author alumno
 */
public class StaticGeneric {
    public static <T extends Comparable> T max(T... array){
        T maximo;
        if (array.length == 0) {
            return null;
        }
        else {
            maximo = array[0];
        }
        for (T element : array) {
            if (maximo.compareTo(element) < 0) {
                maximo = element;
            }
        }
        return maximo;
        
        
    }
    
}
