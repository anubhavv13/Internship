package StringLvl1;
import java.util.Scanner;
class table12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter Your Name");
        s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        if(s1.startsWith("mr "))
            System.out.println("Male");
        else if(s1.startsWith("miss "))
            System.out.println("Female");
        else if(s1.startsWith("mrs "))
            System.out.println("Married Female");
        else if(s1.endsWith("kumari"))
            System.out.println("Unmarried Female");
        else
            System.out.println("Cannot Determined");
    }
            
}
