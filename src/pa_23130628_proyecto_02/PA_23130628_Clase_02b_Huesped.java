/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_02;

/**
 *
 * @author Fer Landa Santi
 */
class Huesped {
    //agregamos las variables que tendra nuestro objeto
    private String hoteles;
    private Vino iniciales;
    private Vino finales;
// despues su constructor
    public Huesped(String hoteles, Vino iniciales, Vino finales) {
        this.hoteles = hoteles;
        this.iniciales = iniciales;
        this.finales = finales;
    }
// agregamos los metodos get y set
    public String getHoteles() {
        return hoteles;
    }

    public void setHoteles(String hoteles) {
        this.hoteles = hoteles;
    }

    public Vino getIniciales() {
        return iniciales;
    }

    public void setIniciales(Vino iniciales) {
        this.iniciales = iniciales;
    }

    public Vino getFinales() {
        return finales;
    }

    public void setFinales(Vino finales) {
        this.finales = finales;
    }

// Agregamos un metodo que sera la venta total de las variables utilizando un metodo de otra clase
   
    public Vino ventaTotal(){
        return iniciales.resta(finales);
            
            
    }
    
    
}
