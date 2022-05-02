/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios24;

public class ParComparable <T extends Comparable, U> implements Comparable<ParComparable>{
    private T primero;
    private U segundo;

    public ParComparable(T primero, U segundo) {
        java.util.Objects.requireNonNull(primero);
        java.util.Objects.requireNonNull(segundo);
        this.primero = primero;
        this.segundo = segundo;
    }

    public T getPrimero() {
        return primero;
    }

    public U getSegundo() {
        return segundo;
    }

    public void setPrimero(T primero) {
        java.util.Objects.requireNonNull(primero);
        this.primero = primero;
        
    }

    public void setSegundo(U segundo) {
        java.util.Objects.requireNonNull(segundo);
        this.segundo = segundo;
    }

//    @Override
//    public String toString() {
//        return primero + " - " + segundo;
//    }

    @Override
    public String toString() {
        return "Par{" + "primero=" + primero + "[" + primero.getClass() + "]" +  ", segundo=" + segundo + "[" + segundo.getClass() + "]" + '}';
    }

    @Override
    public int compareTo(ParComparable t) {
        return this.primero.compareTo(t.segundo);
    }
    
    

  
    
    
    
    

    
    


}
