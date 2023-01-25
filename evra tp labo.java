package ht.bac3;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Map;
public class Hashtable0 {

	public static void main(String[] args) {
		
        Hashtable<String, String> stock = new Hashtable <String, String>();
        Scanner lect = new Scanner (System.in) ;	
        stock.put("001", "AMBASSADE");  
        stock.put("002", "RESERVE7");  
        stock.put("003", "COCA");  
        stock.put("004", "BLACKSTALLOION");  
        stock.put("005", "DASANI");  
        stock.put("006", "FRUTICANA");  
        stock.put("007", "BUSINESSRORAL");  
        stock.put("008", "BRIQUET");  
        stock.put("009", "SAVANA");  
        stock.put("010", "NIDO");  
        stock.put("011", "JACKM");  
        stock.put("012", "SANDWICH");  
        stock.put("013", "ORANGE");  
        stock.put("014", "MONTRE");  
        stock.put("015", "DELL");  
        stock.put("016", "DISC");  
        stock.put("017", "POMME");  
        stock.put("018", "MEMOIRE");  
        stock.put("019", "SAC");  
        stock.put("020", "TELE");  
         System.out.println("entre soit un article ou le nom de l'article: "); 
         String rech = lect.next();
         for (Map.Entry mapentry : stock.entrySet()) {
        	 if(mapentry.getValue().equals(rech) || mapentry.getKey().equals(rech))
        	 System.out.println("cle: " + mapentry.getKey() +"| valeur : " + mapentry.getValue() );
        	 
         }
	}

}
