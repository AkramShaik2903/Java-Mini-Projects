import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorGame {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int i=1,count=0;
        System.out.println("ROCK,PAPER & SCISSORS");
        System.out.println("Rock : 0\tPaper : 1\tScissor : 2");
        while(i<=5)
        {
            int a=rand.nextInt(3);
            System.out.print("Enter your Choice : ");
            int b=sc.nextInt();
            System.out.println("Computer Choice : "+a);
            if(a==b)
            {
                System.out.println("Match Draw!");
            }
            else if(a==0 && b==1)
            {
                System.out.println("User Wins!");
                count++;
            }
            else if(a==0 && b==2)
            {
                System.out.println("Computer Wins!");
            }
            else if(a==1 && b==0)
            {
                System.out.println("Computer Wins!");
            }
            else if(a==1 && b==2)
            {
                System.out.println("User Wins!");
                count++;
            }
            else if(a==2 && b==0)
            {
                System.out.println("User Wins!");
                count++;
            }
            else if(a==2 && b==1) {
                System.out.println("Computer Wins!");
            }
            else {
                System.out.println("Invalid Option!");
            }
            i++;
        }
        if(count>2)
        {
            System.out.println("User won the match!");
        }
        else
        {
            System.out.println("User lost the match,try again...!");
        }
    }
}