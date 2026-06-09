/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pa_23130628_proyecto_02;

/**
 *
 * @author Fer Landa Santi
 */
public class PA_23130628_Proyecto_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//       Vino uno = new Vino(12, 14, 7, 2);
//       Vino dos = new Vino();
//       dos.setMoyo(1);
//       dos.setCantara(10);
//       dos.setAzumbre(3);
//       dos.setCuartillo(3);

       Vino uno = new Vino(63, 12, 0, 0);
       Vino dos = new Vino();
       dos.setMoyo(20);
       dos.setCantara(3);
       dos.setAzumbre(3);
       dos.setCuartillo(1);
        

        
        Vino tres = uno.suma(dos);
        
        System.out.println("   " + uno);
        
        System.out.println(" + " + dos);
        System.out.println("  -----------------------------------------------");
        System.out.println("   " + tres);
        
        Vino cuatro = tres.resta(dos);
        
        System.out.println("\n" + cuatro);
        
        
        Vino cinco = uno.resta(dos);
        
        System.out.println("\n" + cinco);
        
        
        
        
        
    }
    
}
