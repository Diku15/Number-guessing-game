import java.util.*;
public class code {
    public static void main(String args[]){
        Random rand = new Random();
        int randomnumber = rand.nextInt(100) + 1 ;
        // generate a number between 1 to 100
        int trycount = 1;
        while(true) {
            System.out.println("Enter your Guess(1-100):");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            trycount++;
            if (number == randomnumber) {
                System.out.println("correct! you won");
                System.out.println("you took"+ " " + trycount +" " + "rounds");
                break;
            } else if (randomnumber > number) {
                System.out.println("Nope! number is  higher , Play again");
            }else {
                System.out.println("Nope! number is  lower , Play again");
            }
        }
    }
}
