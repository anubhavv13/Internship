package StringLvl1;
import java.util.Scanner;
class merit25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[5];
        int marks[] = new int[5];
        int i,j;
        System.out.println("Enter The Name of Students");
        for(i=0;i<5;i++)
        {
         name[i] = sc.nextLine();
        }
        System.out.println("Enter The Marks of Students");
        for(i=0;i<5;i++)
        {
            marks[i] = sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5-i-1;j++)
            {
                if(marks[j]<marks[j+1])
                {
                    int temp = marks[j];           //sorting of marks for merit
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                    
                    String tem = name[j];          //sorting of name alongwithly according to the marks position
                    name[j] = name[j+1];
                    name[j+1] = tem;
                }
            }
        }
        System.out.println("Merit List as follows : ");
        System.out.println("Marks \tStudent Names");
        for(i=0;i<5;i++)
        {
            System.out.println(marks[i] + "\t" + name[i]);
        }
    }
    
}
