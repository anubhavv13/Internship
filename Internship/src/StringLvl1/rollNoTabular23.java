package StringLvl1;
import java.util.Scanner;
class rollNoTabular23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        //System.out.println("Enter The Total Numbers of Students");
        //int l = sc.nextInt();
        int l = 5;
        String s1[] = new String[l];
        int roll[] = new int[l];
        System.out.println("Enter The Names of Students");
        for(i=0;i<l;i++)
        {
            s1[i] = sc.nextLine();
        }
        System.out.println("Enter The Roll No. Of Student according to names entered in series");
        for(i=0;i<l;i++)
        {
            roll[i] = sc.nextInt();
        }
        System.out.println("The List of Students Name with Roll No. as follows");
        System.out.println("Roll No. \tStudent Name");
        for(i=0;i<l;i++)
        {
            System.out.println(roll[i] + "\t\t" +s1[i]);
        }
    }
}
