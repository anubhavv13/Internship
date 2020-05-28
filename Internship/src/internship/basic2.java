package internship;
import java.util.Scanner;

class basic2 {

    public static void main(String[] args) {
        
        String first, middle ,last;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        first = sc.next();
        System.out.println("Enter Middle Name : ");
        middle = sc.next();
        System.out.println("Enter Last Name : ");
        last = sc.next();
        System.out.println("Full Name : "+ first +" "+ middle +" " + last);
        System.out.println("Initials : "+ first.charAt(0)+ "."+ middle.charAt(0) + "." + last.charAt(0) );
    }
    
}
