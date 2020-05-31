package StringLvl1;
import java.util.Scanner;
class wonder24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country[] = {"India","Italy","Mexico","Peru","Brazil","Jordan","China"};
        String wonder[] = {"Taj Mahal","Colosseum","Chichen Itza","Machu Picchu","Christ the Redeemer","Petra","Great Wall of China"};
        String s1;
        int i;
        System.out.println("Enter any country name of 7 Wonder");
        s1 = sc.nextLine();
        for(i=0;i<7;i++)
        {
            if(country[i].equalsIgnoreCase(s1))
                System.out.println(wonder[i]);
            //else if(s1)
            //    System.out.println("Invalid Input");
        }
    }
    
}
