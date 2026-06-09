/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_23130628_proyecto_02;

import java.util.Random;

/**
 *
 * @author Fer Landa Santi
 */
class Hostales {
    // Aqui ponemos los nombres que tendra nuestro objeto en 2 arreglos diferentes
    private static String [] nom = {"Sunset", "Ocean", "City", "Hotel", "Breeze", "Lodge", "Olimpos", "Edén", "Atenea", "Isis", "Hera", "Artemisa", "Méridienne",
    "Oasis", "Univers", "Ave", "Fenix", "Resort", "Royal", "Holyday", "Heritage", "Royale", "American", "Eco", "Sterak", "Eclipse", "Alpine", "Seaside", "Historic",
    "Enchanted", "Whispering", "Celestial", "Red", "Silver", "Golden", "Great", "Lune", "Maison", "Etoile de", "La Loge", "Heure", "Luxury", "Premier", "Divine" ,
    "Reves", "Cottage", "Dorata", "Le Jardin", "Altamar", "Palacio", "Vin", "Queen", "White", "Angelic", "Wine", "Ecoluxury" , "Taffeit", "Maple"};
    
    private static String [] nom2 = {"Inn", "Hotel", "Loto", "Flor", "Paraíso", "Fontana", "Spa", "Boutique", "Retreat", "Luxury", "Suites", "Pinnacle", "Trebol", 
    "Larkin", "Haven", "Xavier", "Graceful", "Wharfe", "Lodge", "Nathaniel", "Natures", "Nashor", "Liandry", "Goddess" , "Tear", "Chalet", "Serenity", "Downtown",
    "Dreamland", "Urban", "Horizon", "Garden", "Crown", "Orchid", "Star", "Sapphire", "Platinum", "Bleue", "de Corail", "La Liberte", "Lunaire", "Urbaine", "Palm",
    "Romance", "Stellar", "Detoiles", "Savanna", "D Eden", "Pearl", "Decale", "Vita", "Blanco", "Dor", "Oz", "Parassi", "Shanti", "Kristal", };
    // agregamos una libreria random
    private static Random azar = new Random();
    
    // hacemos que se elija un nombre de forma al azar del arreglo 
    public static String nombre()
    {
        return nom[azar.nextInt(nom.length)];
    }
    
    // hacemos que se elija un nombre de forma al azar del arreglo 
    public static String nombre2()
    {
        return nom2[azar.nextInt(nom2.length)];
    }
    // elejimos los nombres al azar y los juntamos para formar un nombre unico
    public static String nombreHostal()
    {
        return nombre() + " " + nombre2();
    }

}
