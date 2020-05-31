package StringLvl1;
import java.util.Scanner;
class lexico13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        int r;
        System.out.println("Enter First String");
        s1 = sc.nextLine();
        System.out.println("Enter Second String");
        s2 = sc.nextLine();
        r = s1.compareToIgnoreCase(s2);
        if(r == 0)
            System.out.println("Same String ");
        else if(r>0)
            System.out.println(s1 + " ...Comes later");
        else
            System.out.println(s2 + " ...Comes");
            
        }
}
