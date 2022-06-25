import java.util.Scanner;

public class typecasting {

    public static void main(String[] args) {
        System.out.println();

        Scanner x= new Scanner(System.in);

         // *******TYPECASTING****** //

         // int num = 34.54f; // this will through error because we cannot declare flaot no as integer.
         //we can do this by using typecasting.

         int num= (int) (34.54F); // compressing the bigger no into smaller no explicitly.
        System.out.println(num); // only integer will be printed.

        int y= 3444;
        char k= 'r';
        double s= 4454.3443;
        byte t = 32;
        float f= 45.6755f;

        double result= (f+t)+(s/y)-(t+f);
        System.out.println(result);
    }
}
