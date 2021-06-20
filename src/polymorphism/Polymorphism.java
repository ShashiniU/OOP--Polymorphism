
package polymorphism;


public class Polymorphism {

    
    public static void main(String[] args) {
        
        Uwanshika uwanshika = new Uwanshika();
        Navod navod = new Navod();
       
      Enemy[] enemies = {uwanshika, navod
    };
      enemies[0].Talk();
      enemies[1].Talk();
    }}
        
    
                
       
    

