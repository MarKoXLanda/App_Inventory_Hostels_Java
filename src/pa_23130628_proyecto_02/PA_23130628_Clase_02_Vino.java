/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_02;
import java.text.DecimalFormat;
import javax.swing.JTable;

/**
 *
 * @author Fer Landa Santi
 */
    class Vino{
        // agregamos las variable que utilizara el objeto
    private int moyo;
    private int cantara;
    private int azumbre;
    private int cuartillo;
    // aqui damos a entender que todos los datos son los mismos
    public Vino()
    {
        moyo = cantara = azumbre = cuartillo = 0;
        
    }
    // despues los constructores
    public Vino(int moyo, int cantara, int azumbre, int cuartillo){
        this.moyo = moyo;
        this.cantara = cantara;
        this.azumbre = azumbre;
        this.cuartillo = cuartillo;
        
        
    }
    
    public Vino(Vino v){
        moyo = v.moyo;
        cantara = v.cantara;
        azumbre = v.azumbre;
        cuartillo = v.cuartillo;
        
    }
    // Agregamos los metodos get y set

    public int getMoyo() {
        return moyo;
    }

    public void setMoyo(int moyo) {
        this.moyo = moyo;
    }

    public int getCantara() {
        return cantara;
    }

    public void setCantara(int cantara) {
        this.cantara = cantara;
    }

    public int getAzumbre() {
        return azumbre;
    }

    public void setAzumbre(int azumbre) {
        this.azumbre = azumbre;
    }

    public int getCuartillo() {
        return cuartillo;
    }

    public void setCuartillo(int cuartillo) {
        this.cuartillo = cuartillo;
    }
    
    // Agregamos el tostring para que nos regrese algo y no el nombre de la clase
    public String toString(){
        return "Moyo: " + moyo + " Cantara: " + cantara + " Azumbre: " + azumbre + " Cuartillo: " + cuartillo;
    }
    // Hacemos la operacion que convierte todo a cuartillos
    public int TotalCuartillos(){
        return moyo * 512 + cantara * 32 + azumbre * 4 + cuartillo;
    }
    // Utilizamos los cuartillos totales para poder hacer una suma y despues convertimos en moyos, cantaras y azumbres
    
    public Vino suma(Vino v){
        int totalCuartillos = this.TotalCuartillos() + v.TotalCuartillos();
        int moy = totalCuartillos / 512;
        int residuomoy = totalCuartillos % 512;
        int can = residuomoy / 32;
        int residuocan = residuomoy % 32;
        int azum = residuocan / 4;
        int cuar = residuocan % 4;
        
        return new Vino(moy, can, azum, cuar);
    }
    // Utilizamos los cuartillos totales para poder hacer una resta y despues convertimos en moyos, cantaras y azumbres
    public Vino resta(Vino v){
        int totalCuartillos = this.TotalCuartillos() - v.TotalCuartillos();
        int moy = totalCuartillos / 512;
        int residuomoy = totalCuartillos % 512;
        int can = residuomoy / 32;
        int residuocan = residuomoy % 32;
        int azum = residuocan / 4;
        int cuar = residuocan % 4;
        
        return new Vino(moy, can, azum, cuar);
    }
    
   
    }
