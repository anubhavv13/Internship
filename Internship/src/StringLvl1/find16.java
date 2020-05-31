package StringLvl1;
import java.util.Scanner;
class find16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int i,count=0;
        String s1[] = new String[5];
        System.out.println("Enter 5 Names");
        for(i=0;i<5;i++)
        {
            s1[i] = sc.nextLine();
        }
        System.out.println("The names starting with vowels are as follows : ");
        for(i=0;i<5;i++)
        {
            ch = Character.toLowerCase(s1[i].charAt(0));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                System.out.println(s1[i]);
        }
        
    }    
}
