import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorGame {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int i=1,count=0;
        System.out.println("ROCK,PAPER & SCISSORS");
        System.out.println("Rock : 0\tPaper : 1\tScissor : 2");
        int a=rand.nextInt(3);
        System.out.print("Enter your Choice : ");
        int b=sc.nextInt();
        System.out.println("Computer Choice : "+a);
        if(a==b)
        {
            System.out.println("Match Draw!");
        }
        else if(a==0 && b==1 || a==1 && b==2 || a==2 && b==0)
        {
            System.out.println("User Wins!");
        }
        else if(a==0 && b==2 || a==1 && b==0 || a==2 && b==1)
        {
            System.out.println("Computer Wins!");
        }
        else
        {
            System.out.println("Invalid Option!");
        }
    }
}
