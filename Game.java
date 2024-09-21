//Stone paper scissor
import java.util.*;
public class Game{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      Random rd = new Random();
      int userScore=0;
      int compScore=0;
      boolean start = true;
     while(start){
     System.out.println("Enter your move : 1. ROCK\t 2.PAPER\t 3. SCISSOR\t");
     int a = sc.nextInt();
     Ask(a);
     System.out.println("Computer entered");
     int rand = rd.nextInt(1,4);
     Ask(rand);
     if(a==1 && rand==1){
           System.out.print("It's a tie!!");
           System.out.format("Score of User :%d\t Score of comp : %d",userScore,compScore);
     }
     else if(a==2 && rand==2){
           System.out.print("It's a tie!!");
           System.out.format("Score of User :%d\t Score of comp : %d",userScore,compScore);
     }
     else if(a==3 && rand==3){
           System.out.print("It's a tie!!");
           System.out.format("Score of User :%d\t Score of comp : %d",userScore,compScore);
     }
     else if(a==1 && rand==2){
           System.out.println("Comp wins this move !");
           System.out.format("Score of User :%d\t Score of comp : %d",userScore,++compScore);
     }
     else if(a==2 && rand==1){
      System.out.println("User wins this move !");
      System.out.format("Score of User :%d\t Score of comp : %d",++userScore,compScore);
     }
     else if(a==2 && rand==3){
      System.out.println("Comp wins this move !");
      System.out.format("Score of User :%d\t Score of comp : %d",userScore,++compScore);
     }
      else if(a==3 && rand==2){
       System.out.println("User wins this move !");
       System.out.format("Score of User :%d\t Score of comp : %d",++userScore,compScore);
      }
      else if(a==3 && rand==1){
        System.out.println("Comp wins this move !");
        System.out.format("Score of User :%d\t Score of comp : %d",userScore,++compScore);
       }
        else if(a==1 && rand==3){
         System.out.println("User wins this move !");
         System.out.format("Score of User :%d\t Score of comp : %d",++userScore,compScore);
        }
        System.out.println();
    }
  }
    static void Ask(int a){ 

      char c1 = 'r';
      char c2 = 'p';
      char c3 = 's';
      switch(a){
        case 1 : System.out.println(c1);
                 break;
        case 2 : System.out.println(c2);
                  break;
        case 3 : System.out.println(c3);
                  break;
        default : System.out.print("Enter a valid number");
    
       }
    }
}