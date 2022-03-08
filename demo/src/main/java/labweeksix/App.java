package labweeksix;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        // student names 
        String nameString[] = new String[5];
        nameString[0] = "Danh Pham";
        nameString[1] = "kunal Kheeva";
        nameString[2] = "Joshua Paas";
        nameString[3] = "Steven Woodson";
        nameString[4] = "Sunny Vinay";

        System.out.println("student name = " + nameString[0]);
        System.out.println("student name = " + nameString[1]);
        System.out.println("student name = " + nameString[2]);
        System.out.println("student name = " + nameString[3]);
        System.out.println("student name = " + nameString[4]);
        
    }

    static class array{
        public static void main(String[] args){
        
        Integer[] numbers = {1,3,-4,7,5};
        System.out.println("\n array of integers");
        for(int i = 0; i < numbers.length; i++){
            System.out.printf("%d", numbers[i]);
        }
        
        Integer [] new_numbers = new Integer[numbers.length + 1];
        for (int i = 0; 1 < numbers.length; i++  ){
            new_numbers[i] = numbers[i];
        }

        System.out.println("\n new more array of strings");
        numbers[4] = numbers[1] + numbers[2];
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("%d", numbers[i]);
        }
                
    
      }
    }
        
             
    
    
}
