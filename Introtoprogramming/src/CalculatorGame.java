import java.util.Arrays;
import java.util.Scanner;

public class CalculatorGame {
    public static void main(String[] args) {

        HighScore[] scoreList = new HighScore[5];
        Player newPlayer;
        String answer = "";
        int score;
        do {
            newPlayer = createPlayer();
            score = 0;
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Would you like to take the: \n A. Addition Quiz \n B. Modulo Quiz \n C. Subtraction Quiz \n D. True or False Quiz \n or EXIT");
            answer = myScanner.nextLine().toLowerCase();

            if (answer.equals("a")) {
                System.out.println("The current score to beat is: "+ scoreToBeat(scoreList));
                score = addQuiz(5);
                HighScore newHighScore = new HighScore(newPlayer, score);
                scoreList = addHighScore(newHighScore, scoreList);
                System.out.println(newPlayer.name() + " scored: " + score);
                System.out.println(Arrays.toString(scoreList));
            }
            if (answer.equals("b")) {
                System.out.println("The current score to beat is: "+scoreToBeat(scoreList));
                score = moduloQuiz(5);
                HighScore newHighScore = new HighScore(newPlayer, score);
                scoreList = addHighScore(newHighScore, scoreList);
                System.out.println(newPlayer.name() + " scored: " + score);
                System.out.println(Arrays.toString(scoreList));
            }
            if (answer.equals("c")) {
                System.out.println("The current score to beat is: "+scoreToBeat(scoreList));
                score = subtractionQuiz(5);
                HighScore newHighScore = new HighScore(newPlayer, score);
                scoreList = addHighScore(newHighScore, scoreList);
                System.out.println(newPlayer.name() + " scored: " + score);
                System.out.println(Arrays.toString(scoreList));
            }
            if (answer.equals("d")) {
                System.out.println("The current score to beat is: "+scoreToBeat(scoreList));
                score = andQuiz(5);
                HighScore newHighScore = new HighScore(newPlayer, score);
                scoreList = addHighScore(newHighScore, scoreList);
                System.out.println(newPlayer.name() + " scored: " + score);
                System.out.println(Arrays.toString(scoreList));
            }//as long as there is an user input, run loop.
        }while (answer!=null && !answer.equals("exit"));
        HighScore newScore = new HighScore(newPlayer, score);
        scoreList = addHighScore(newScore,scoreList);
    }

    static int index = 0;


    public static HighScore[] addHighScore(HighScore myHigh,HighScore[] myArray ){
        myArray[index] = myHigh;
        index++;
        return myArray;
    }


    public static Player createPlayer(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide your name: ");
        String myName = myScanner.nextLine();
        System.out.println("Please provide your age: ");
        int age = myScanner.nextInt();
        Player myTeam = new Player(myName, age);
        return myTeam;
    }


    public static int scoreToBeat(HighScore score[]){
        if(score[0]==null)
        {
            return 0;
        }
        HighScore max = score[0];
        while(score.equals(null)){
            for (int i = 0; i < score.length; i++){

                if (score[i].score() > max.score()){
                    max = score[i];
                }
            }

        }
        return max.score();
    }


    public static int generateRandom(){
        int a = (int)Math.floor(Math.random()* 100) + 1;
        return a;
    }
//


    public static boolean addQuestion(int a,int b){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please add " + a + " and " + b + ": ");
        int userAnswer = myScanner.nextInt();
        int Answer = a + b;
        if(Answer == userAnswer){
            System.out.println("Correct!");
            return true;
        }else
            System.out.println("Wrong!");
            return false;

    }

    public static int addQuiz(int length){
        int score = 0;
        for(int i = 1; i <= length; i++){
            if(addQuestion(generateRandom(),generateRandom()) == true){
                score++;
            }

        }

        return score;
    }
    public static boolean moduloQuestion(int a, int b){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please find the remainder after dividing " + a + " and " + b + ": ");
        int userAnswer = myScanner.nextInt();
        int Answer = a % b;
        if(Answer == userAnswer){
            System.out.println("Correct");
            return true;
        }
        System.out.println("Wrong!");
        return false;
    }
    public static int moduloQuiz(int length){
        int score = 0;
        HighScore newHighScore = new HighScore( createPlayer(), score);
        for(int i = 1; i <= length; i++){
            if(moduloQuestion(generateRandom(),generateRandom()) == true){
                score++;
            }
        }
        return score;
    }

    public static boolean andQuestion(boolean a, boolean b){
        // we create a boolean that has both a&&b
        boolean and = a&&b;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is " + a + " AND " + b + "?");
        //we make the answer into lowercase
        String userAnswer = myScanner.nextLine().toLowerCase();
        // while not and the userAnswer is not equal to true OR userAnswer is not equal to false we print out the following
        while(!(userAnswer.equals("true") || userAnswer.equals("false"))){
            System.out.println("Your answer " + userAnswer);
            System.out.println("Answer not recognised. Please try again.");
            // we ask the user to try again and we take in that answer within this variable
            userAnswer = myScanner.nextLine();
        }
        // because our answer is a string we must make it into a boolean
        // so we create a variable that changes the string to a boolean
        boolean ans = Boolean.parseBoolean(userAnswer);
        // we use a ternary to get a response out we check to see if ans equals and if it does Thats correct
        // else we say that's not correct
        String msg = (ans == and)? "That's correct." : "That's incorrect";
        // we print out a message
//        System.out.println(msg);
        // we return if ans equals and
        System.out.println(msg);
        return ans == and;

    }




    public static int andQuiz(int length){
        // we initialize score at 0
        int score = 0;
        // we want to loop through the length and add 1
        for(int x = 1; x <= length; x++){
            // we create two random true or false statements down below
            boolean a = Math.random() < 0.5;
            boolean b = Math.random() < 0.5;
            // we call the addQuestion with a and b which are random true or false
            // if they answer right we add 1
            if(andQuestion(a,b)){
                score++;
            }
        }

        return score;
    }



    public static boolean subtractionQuestion(int a,int b){
        // using the user inputs to see if the sum is correct


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please find the difference after subtracting " + a + " and " + b + ": ");
        int userAnswer = myScanner.nextInt();
        int Answer = a - b;
        if(Answer == userAnswer){
            System.out.println("Correct!");
            return true;
        }else
            System.out.println("Wrong!");
            return false;

    }

    public static int subtractionQuiz(int length){
        int score = 0;
        for(int i = 1; i <= length; i++){
            if(subtractionQuestion(generateRandom(),generateRandom()) == true){
                score++;
            }
        }
        return score;
    }
}
record Player(String name, int age ){

}
record HighScore(Player player, int score){

}