import java.util.*;
public class challenge {
    public static void main(String[] args) {
        System.out.println("welcome to guess game");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = scanner.next();
        System.out.println("1 to start game \n 2 to not start game ");
        System.out.println("shall we start the game MR/MS"+name);
        int desc = scanner.nextInt();
        Random random = new Random();
            int a = random.nextInt(10);
            int Guess;
            if (desc==1) {
                for(Guess=1;Guess<=5;Guess++){
                    System.out.println("enter your Guess");
                    int num = scanner.nextInt();
                    if (num==a) {
                        System.out.println("congratulation you have guessed it correct");
                        break;
                    }
                    else if (num<a) {
                        System.out.println("You are a fool!\n enter a little higher value");
                    }
                    else if (num>a) {
                        System.out.println("You are foolesh!\n enter a little lower value");
                    }
                    if (Guess==5) {
                        System.out.println("your chances are finished\ndo visit again");
                    }
                }
            }
            else{
                System.out.println("thanks for visiting , do visit again");
            }
    scanner.close();
        }
    }
    

    
