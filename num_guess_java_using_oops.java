import java.lang.Math;
import java.util.*;

class Game{
    private int cnum;
    private int usernum;
    private int numOfGuesses=0;
    /* 
    methods

    1.constructor to generate a random number
    2.takeUserInput to take user input of a number
    3.isCorrectNum to detect whether a guess is correct
    4.getters and setters for numOfGuesses

    Properties  
    numOfGuesses 

    */
    public Game(){ //constructors have NO return type
        cnum = ((int)(100*Math.random()));
    }
    public int getcnum(){
        return cnum;
    }
    public void takeUserInput(int n){
        usernum=n;
    }
    public int getUserInput(){
        return usernum;
    }
    public boolean isCorrectNum(){
        // getUserInput();
        // getcnum();
        if(usernum==cnum){
            return true;
        }
        else if(usernum<cnum){
            System.out.println("Guess a bigger number !");
            return false;
        }else{
            System.out.println("Guess a smaller number !");
            return false;
        }
    }
    public int getnumguess() {
        return numOfGuesses;
    }
    public void setnumguess() {
        numOfGuesses = numOfGuesses +1;
    }
}

public class num_guess_java_using_oops {

    public static void main(String[] args) {

        Game obj = new Game();
        // System.out.println(obj.getcnum());
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of guesses you want Allowed : ");
        int allowed_guesses=sc.nextInt();
        boolean res;

        do{
            System.out.println("Enter your number :");

            int unum=sc.nextInt();
            obj.takeUserInput(unum);
            obj.setnumguess();
            System.out.println("You have guessed "+obj.getnumguess()+ " times.");
            res=obj.isCorrectNum();
            
        }while((res!=true) && ((obj.getnumguess())<allowed_guesses));

        if(res){
            System.out.println("** Correct Guess ! You Win !!**");
        }else{
            System.out.println("You Lost :/");
        }       
    }
    
}
