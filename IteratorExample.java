import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class IteratorExample{

     public static void main(String []args){
       ArrayList names = new ArrayList<String>( Arrays.asList("F1", "F2", "F3","F4","F5","F6","F7","F8","F9","F10") );
       
        
     
        Iterator it = names.iterator();
        String previous = null;
        if (it.hasNext()) {
            previous =  (String)it.next();
            while (it.hasNext()) {
              String next = (String)it.next();
              System.out.println("***");
              System.out.println(previous);
              System.out.println(next);
              System.out.println("***");
             
              previous = next;
            }
             System.out.println(previous);
        }
    }
}
