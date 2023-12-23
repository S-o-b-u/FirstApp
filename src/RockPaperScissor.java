import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        // 0 --> Rock
        // 1 --> Paper
        // 2 --> Scissor
        System.out.println("         ==> STAR <==         ");
        System.out.println("--> Type <0> to choose ROCK");
        System.out.println("--> Type <1> to choose PAPER");
        System.out.println("--> Type <2> to choose SCISSOR");
        System.out.println("======================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your element => ");
        int mychoice = sc.nextInt();
        System.out.println("======================");
        if (mychoice==0){
            System.out.println("You Choosed <ROCK>");
        }
        else  if (mychoice==1){
            System.out.println("You Choosed <PAPER>");
        }
        else  if (mychoice==2){
            System.out.println("You Choosed <SCISSOR>");
        } else {
            System.out.println("INVALID INPUT!! // PLEASE TRY AGAIN...");
        }
        System.out.println("======================");
        System.out.println("           &          ");
        Random random = new Random();
        int compchoice = random.nextInt(3);
        System.out.println("======================");
        if (compchoice==0){
            System.out.println("Computer Choosed <ROCK>");
        }
        else  if (compchoice==1){
            System.out.println("Computer Choosed <PAPER>");
        }
        else  if (compchoice==2){
            System.out.println("Computer Choosed <SCISSOR>");
        }
        System.out.println("======================");
        if (compchoice==mychoice){
            System.out.println("GAME RESULT : <Hooooo>--Draw");
        }
        else if (compchoice==0 && mychoice==1){
            System.out.println("GAME RESULT : <Yeeee>--You Win");
        }
        else if (compchoice==1 && mychoice==2){
            System.out.println("GAME RESULT : <Yeeee>--You Win");
        }
        else if (compchoice==2 && mychoice==0){
            System.out.println("GAME RESULT : You Win");
        }
        else {
            System.out.println("GAME RESULT : <Booo>--Computer Wins.");
            System.out.println("Better Luck Next Time!!");
        }
    }
}
