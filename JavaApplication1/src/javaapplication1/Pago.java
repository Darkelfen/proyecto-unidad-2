/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author usuario
 */
public enum Pago {
    EFECTIVO("Efectivo"),
    CHEQUE("Cheque"), 
    CREDITO_BANCARIO("Tarjeta de Credito Bancaria"),
    CREDITO_TIENDA("Tarjeta de Credito de la Tienda");
    
    private String nombre;
    
    private Pago(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
}
