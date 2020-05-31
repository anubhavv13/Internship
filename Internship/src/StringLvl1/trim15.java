package StringLvl1;
import java.util.Scanner;
class trim15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String To Remove Extra Whitespace");
        String s1 = sc.nextLine();
        s1 = s1.trim();
        System.out.println("Output String : " + s1);
    }
}
