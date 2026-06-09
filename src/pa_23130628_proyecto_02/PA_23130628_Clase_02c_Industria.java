/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_02;

import java.util.Random;
import javax.swing.JTable;

/**
 *
 * @author Fer Landa Santi
 */
class Industria {
    // hacemos que nuestro objeto tenga un arreglo como variable para que funcione como encapsulamiento de los ciclos
    private Huesped [] lista;

  
    public Industria(int n){
        lista = new Huesped[n];
    }
    // agregamos el metodo get y set de esta manera para que no afecte a los ciclos y pueda generar bien el arreglo
    public void setHuesped(Huesped h, int posicion)
    {
        if(posicion >= 0 && posicion < lista.length)
            lista[posicion] = h;
    }
    
    public Huesped getHuesped(int posicion){
        if(posicion >= 0 && posicion < lista.length)
            return lista[posicion];
        else
            return null;
    }
    // agreganis el metodo ordenar utilizando el metodo de burbuja para hacer un ordenamiento alfabetico y por valor maximo
    public void ordenar()
            
            
    {        
        for(int i=0; i < lista.length - 1 ; i++)
            for(int j=i+1; j < lista.length; j++)
                if(lista[i].ventaTotal().TotalCuartillos() < lista[j].ventaTotal().TotalCuartillos())
                {
                    Huesped aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }        
    }
    
    public void alfabetico(){
        
        for(int i=0; i < lista.length - 1; i++)
            for(int j= i+1; j < lista.length; j++)
                if(lista[i].getHoteles().compareTo(lista[j].getHoteles()) > 0){ // < = descendente   
                    Huesped hue = lista[i];
                    lista[i] = lista[j];
                    lista[j] = hue;
    }
        
    }
    // Agrego un metodo que me mostrara los valores generados al jtable haciendo objetos y ciclos con los mismos
    public void mostrar(JTable modelo, JTable jTableTotales){
         Vino iniciales, finales, ventaVino;
        
        Vino total = new Vino(0, 0, 0, 0);
        Vino total2 = new Vino(0, 0, 0, 0);
        Vino total3 = new Vino(0, 0, 0, 0);


        
        for(int r = 0; r < modelo.getRowCount(); r++){
            iniciales = new Vino();
            iniciales.setMoyo(Integer.parseInt(modelo.getValueAt(r, 1) + ""));
            iniciales.setCantara(Integer.parseInt(modelo.getValueAt(r, 2) + ""));
            iniciales.setAzumbre(Integer.parseInt(modelo.getValueAt(r, 3) + ""));
            iniciales.setCuartillo(Integer.parseInt(modelo.getValueAt(r, 4) + ""));
            
            finales = new Vino();
            finales.setMoyo(Integer.parseInt(modelo.getValueAt(r, 5) + ""));
            finales.setCantara(Integer.parseInt(modelo.getValueAt(r, 6) + ""));
            finales.setAzumbre(Integer.parseInt(modelo.getValueAt(r, 7) + ""));
            finales.setCuartillo(Integer.parseInt(modelo.getValueAt(r, 8) + ""));
            
            ventaVino = iniciales.resta(finales);             
            
            
            
            modelo.setValueAt(ventaVino.getMoyo(), r, 9);
            modelo.setValueAt(ventaVino.getCantara(), r, 10);
            modelo.setValueAt(ventaVino.getAzumbre(), r, 11);
            modelo.setValueAt(ventaVino.getCuartillo(), r, 12);
            
            total = total.suma(ventaVino);
            total2 = total2.suma(iniciales);
            total3 = total3.suma(finales);
            
           
            
        jTableTotales.setValueAt(total3.getMoyo(), 0, 1);
        jTableTotales.setValueAt(total3.getCantara(), 0, 2);
        jTableTotales.setValueAt(total3.getAzumbre(), 0, 3);
        jTableTotales.setValueAt(total3.getCuartillo(), 0, 4);
        jTableTotales.setValueAt(total2.getMoyo(), 0, 5);
        jTableTotales.setValueAt(total2.getCantara(), 0, 6);
        jTableTotales.setValueAt(total2.getAzumbre(), 0, 7);
        jTableTotales.setValueAt(total2.getCuartillo(), 0, 8);
        jTableTotales.setValueAt(total.getMoyo(), 0, 9);
        jTableTotales.setValueAt(total.getCantara(), 0, 10);
        jTableTotales.setValueAt(total.getAzumbre(), 0, 11);
        jTableTotales.setValueAt(total.getCuartillo(), 0, 12);
            
        
        }
    }
    
    // metodo aleatorios utilizando la base del anterior pero este generara los datos aleatorios
    public void aleatorios(JTable modelo){
                Random azar = new Random();
      
        for(int r = 0; r < modelo.getRowCount(); r++)
        {
            
            modelo.setValueAt(Hostales.nombreHostal(), r, 0);
            
            
            
            // Inventario Inicial
            modelo.setValueAt(azar.nextInt(50,100), r, 1); // Moyos
            modelo.setValueAt(azar.nextInt(16), r, 2); // Cántaras
            modelo.setValueAt(azar.nextInt(8), r, 3); // Azumbres
            modelo.setValueAt(azar.nextInt(4), r, 4); // Cuartillos
            
            // Inventario Final
            modelo.setValueAt(azar.nextInt(50), r, 5); // Moyos
            modelo.setValueAt(azar.nextInt(16), r, 6); // Cántaras
            modelo.setValueAt(azar.nextInt(8), r, 7); // Azumbres
            modelo.setValueAt(azar.nextInt(4), r, 8); // Cuartillos

        }
    }
    
    // este metodo ingresa valores al jtable
    public void ejemplo(JTable modelo){
        modelo.setValueAt("San Fermin", 0, 0);
        modelo.setValueAt("Quijote", 1, 0);
        modelo.setValueAt("Don Venancio", 2, 0);
        modelo.setValueAt("Sancho Panza", 3, 0);
        
        
        modelo.setValueAt(7, 0, 5);
        modelo.setValueAt(17, 1, 5);
        modelo.setValueAt(24, 2, 5);
        modelo.setValueAt(3, 3, 5);
        
        
        modelo.setValueAt(15, 0, 6);
        modelo.setValueAt(7, 1, 6);
        modelo.setValueAt(5, 2, 6);
        modelo.setValueAt(5, 3, 6);
        
        
        modelo.setValueAt(4, 0, 7);
        modelo.setValueAt(2, 1, 7);
        modelo.setValueAt(5, 2, 7);
        modelo.setValueAt(1, 3, 7);
        
        modelo.setValueAt(3, 0, 8);
        modelo.setValueAt(2, 1, 8);
        modelo.setValueAt(1, 2, 8);
        modelo.setValueAt(0, 3, 8);
        
        modelo.setValueAt(9, 0, 1);
        modelo.setValueAt(22, 1, 1);
        modelo.setValueAt(25, 2, 1);
        modelo.setValueAt(8, 3, 1);
        
        
        modelo.setValueAt(8, 0, 2);
        modelo.setValueAt(12, 1, 2);
        modelo.setValueAt(14, 2, 2);
        modelo.setValueAt(3, 3, 2);
        
        
        modelo.setValueAt(7, 0, 3);
        modelo.setValueAt(3, 1, 3);
        modelo.setValueAt(2, 2, 3);
        modelo.setValueAt(5, 3, 3);
        
        modelo.setValueAt(2, 0, 4);
        modelo.setValueAt(0, 1, 4);
        modelo.setValueAt(3, 2, 4);
        modelo.setValueAt(1, 3, 4);
        
    }
    
}
