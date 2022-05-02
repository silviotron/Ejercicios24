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
public class Ejercicios24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Par<String, Integer> a1 = new Par<>("Silvio", 9);
        Par<String, Boolean>  a2= new Par<>("Silvio", true);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(StaticGeneric.max("A","E","I","O","U"));
        System.out.println(StaticGeneric.max(10,65,32,1,0));
    }
    
}
