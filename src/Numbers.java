import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Numbers {

    public static final int LOWER = 5;
    public static final int UPPER = 200;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<Integer>> map = getMap(LOWER,UPPER);
        int number = 0;

        while( number != -1){
            try{
            System.out.println("Please enter a number between 5 and 200(-1 to exit)");
            number = scanner.nextInt();
            if (number != -1){

           /*  if (number < LOWER || number > UPPER){
                 throw new InputMismatchException();
             }  */
             List<Integer> list = map.get(number);
             if (list == null){
                 throw new InputMismatchException();
             }
             System.out.println(map.get(number));
            }
        }catch(InputMismatchException ex){
                System.out.println("Please enter a number between 5 and 200");
    }
        }

        }

        public static Map<Integer,>

    //Me falta algo aqui xd

}
