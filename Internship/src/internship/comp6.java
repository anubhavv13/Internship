package internship;
import java.util.Scanner;
public class comp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter First String for comparision");
        s1 = sc.nextLine();
        System.out.println("Enter Second String for comparision");
        s2 = sc.nextLine();
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
