
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        //Questions
        String[] questions = {"Who is the father of atomic bomb?\n",
            "How many continents are there?\n","Which is the largest ocean?\n","What is the capital of India?\n"};

        //Options
        String[] options = {"1.Issac Newton\t 2.Albert Einstein\t 3.Robert Hooke\t 4.Robert Oppenheimer\t",
            "1.10\t 2.7\t 3.6\t 4.6\t", "1.Pacific Ocean\t 2.Indian Ocean\t 3.Atlantic Ocean\t 4.Arctic Ocean\t",
            "1.Madrid\t 2.Rome\t 3.New Delhi\t 4.Kavarati\t"};

        //Answers
        String[] answers = {"4","2","1","3"};
        System.out.println("Greetings Everyone , Welcome to the Quiz!");
        System.out.println("Here are your questions...");
        
        for (int i = 0 ; i < questions.length ; i++){
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.println("Enter your answer: ");
            String answer = scan.nextLine();
            if (answer.equals(answers[i])){
                System.out.println("Correct !");
                score++;
            } else {
                System.out.println("Incorrect !");
            }

        }
        System.out.println("Quiz ended . You got "+score+"/"+questions.length);
    }
}

