package internship;
import java.util.Scanner;

public class count4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int vowel=0,consonant=0,i;
        System.out.println("Enter a Sentence to count Vowels and Consonant");
        s = sc.nextLine().toLowerCase();
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a'|| ch == 'e' || ch =='i' || ch == 'o' || ch == 'u')
                vowel++;
            else
                consonant++;
        }
        System.out.println("Vowels = " + vowel);
        System.out.println("Consonant = " + consonant);
    }
    
}
