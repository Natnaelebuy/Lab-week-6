package labweeksix;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        String nameString[] = new String[3];
        nameString[0] = "Geeks";
        nameString[1] = "for";
        nameString[2] = "Geeks";
        {
            System.out.print(nameString[0] + " ");
            System.out.println(nameString[1] + " ");
            System.out.println(nameString[2] + " ");

        }
    }
    public static void name(String[] args) {
        Integer[] anArray = new Integer[10];

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = new Integer(i);
            System.out.println(anArray[i]);
        }
        
    }
        
    
            
    
    
}
