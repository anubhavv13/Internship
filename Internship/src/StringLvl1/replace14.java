package StringLvl1;
import java.util.Scanner;
class replace14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        
        System.out.println("Enter A String");
        s1 = sc.nextLine();
        s1 = s1.replaceAll("15 august", "26 january");
        s1 = s1.replaceAll("independence", "republic");
        System.out.println("Output String after replacement : " + s1);
    }
    
}
