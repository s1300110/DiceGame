import java.util.Random;
import java.util.Scanner;
public class DiceGame {

  public static void main(String[] args) {
System.out.println("What is your name?");
	Scanner name = new Scanner(System.in);
	String name1= name.next();
	System.out.println("Hello, "+name1+"!");
      int[] dice = { 1,2,3,4,5,6};
    Random r = new Random();
      int dice1 = dice[r.nextInt(6)];
       int dice2 = dice[r.nextInt(6)];
       int dice3=dice1+dice2;
       System.out.println("Rolling the dice...");
       System.out.println("Die 1: "+dice1);
       System.out.println("Die 2: "+dice2);
       System.out.println("Total value: "+dice3);
       if(dice3>7){
	   System.out.println("You won");
       }else {
	   System.out.println("You lost");}

 }

}

 
