
import java.util.ArrayList;
import java.util.Collections;


public class Lista {
    public static void main(String[]args){
        String banana = "Banana";
        String maca = "Maça";
        String uva = "Uva";
        
        ArrayList<String> fruta = new ArrayList<>();
        fruta.add(uva);
        fruta.add(maca);
        fruta.add(banana);
        //fruta.remove(0);
        System.out.println(fruta);
        Collections.sort(fruta);
        
        
        for( int i = 0; i < fruta.size(); i++){
            System.out.println(fruta.get(i));
            
            
            
        }
    }
}
