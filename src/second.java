import java.util.Scanner;  // Scanner class imported.

public class second {

    public static void main(String[] args) {

       /* Scanner input= new  Scanner(System.in);  // creating the object.
        System.out.println( " enter your mobile no "); // taking input.

        int mobile_no = input.nextInt(); // declaration.

        System.out.println( " your mobile no is  " + mobile_no); // printing output.

        System.out.println( "enter your marks");
        float marks= input.nextFloat();

        System.out.println("marks="+ marks);    ******/

        //********** Scanner class example ************//
        Scanner x= new Scanner (System.in);    // creating object of Scanner class.

        System.out.println("enter your name ");  // taking input.
        String name = x.next();        // variable declaration.

        System.out.println("enter your rollno ");
        int rollno= x.nextInt();

        System.out.println("enter your nickname");
        String nickname = x.next();

        System.out.println("enter your marks ");
        double marks= x.nextDouble();

        System.out.println("enter your float");
        float f= x.nextFloat();

        // *** printing output***//

        System.out.println(" your name is " + name);
        System.out.println("your roll no is "+ rollno);
        System.out.println(" your nickname is " +nickname);
        System.out.println("your marks is "+ marks);
        System.out.println("your float is "+ f);


    }
}
