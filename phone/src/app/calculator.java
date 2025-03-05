package app;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a , b ,  c = 0  , e , q = 0 , s = 0 ;

        while (q == 0) {

            if ( s == 0 ) {
                System.out.printf("First number : ");
                a = scanner.nextInt();
            } else {
                a = c;
            }
//        for first number

        System.out.printf("Second number : ");
        b = scanner.nextInt() ;
//        for second number

        System.out.printf("What actions do you want to take ( 0.+ , 1.- , 2.* , 3./ ) : ");
        e = scanner.nextInt() ;
//        for action


                if (e == 0) {
                    c = a + b;
                }
//        number addition
            
                if (e == 1) {
                    c = a - b;
                }
//        number subtraction
            
                if (e == 2) {
                    c = a * b;
                }
//        number multiplication
            
                if (e == 3) {
                    c = a / b;
                }
//        number division


                System.out.println("Total : "+ c );
                System.out.println("Something to add ( 0.Yes or 1.No ) ");
                q = scanner.nextInt();

                s++;

        }

        System.out.println("Calculator turn off ! ");

    }
}
