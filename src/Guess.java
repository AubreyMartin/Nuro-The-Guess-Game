import java.util.Scanner;

public class Guess {

    public static void main(String[] args){
                                   // Alpha Project //
        System.out.println(" Welcome Guess you Lucky Number ");



         int myNumber = (int)  (Math.random() * 100);
         int userNumber = 0 ;
        Scanner dc = new Scanner(System.in);

         do{
             System.out.println(" Pick a number  ( 1-100 ): ");
             userNumber = dc.nextInt();

             if (userNumber == myNumber){
                 System.out.println(" Boom Boom ..  HERE IS YOUR LUCKY NUMBER");  // iF the number is
                 break;

             } else if ( userNumber > myNumber ) {
                 System.out.println(" The number you have entered is too large");
             }
             else {
                 System.out.println("The number you have entered is too small");
             }
         }  while (userNumber >= 0);

        System.out.println("Your Lucky Number was : " + myNumber  );


    }

}
