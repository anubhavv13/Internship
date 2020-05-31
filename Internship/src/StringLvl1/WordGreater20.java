package StringLvl1;
import java.util.Scanner;
class WordGreater20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        String s1,s2="";
        int i;
        char ch;
        s1 = sc.nextLine();
        s1 = s1 + " ";
        System.out.println("The Words having length greater than or equal to 5 are as follows : ");
        for(i=0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            if(ch != ' ')
            {
                s2 = s2 + ch;
            }
            else
            {
                if(s2.length()>=5)
                    System.out.println(s2 + " ");
            s2 = "";
            }
        }
    }
}
