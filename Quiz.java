import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Question {
    private String question;
    private String[] choices;
    private int answer;

    public Question(String question, String[] choices, int answer) {
        this.question = question;
        this.choices = choices;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getChoices() {
        return choices;
    }

    public int getAnswer() {
        return answer;
    }
}


public class Quiz {
    private List<Question> questions;
    private Scanner scan;

    public Quiz() {
        questions = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void addQuestion(String question, String[] choices, int answer) {
        Question newQuestion = new Question(question, choices, answer);
        questions.add(newQuestion);
    }

    public void startQuiz() {
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);

            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestion());
            String[] choices = currentQuestion.getChoices();
            for (int j = 0; j < choices.length; j++) {
                System.out.println((j + 1) + ": " + choices[j]);
            }

            System.out.print("Enter your answer : ");
            int userAnswer = scan.nextInt()-1 ;

            if (userAnswer == currentQuestion.getAnswer()){
                System.out.println("Correct :)");
                score++;
            } else {
                System.out.println("Incorrect :( . The correct answer is "+ choices[currentQuestion.getAnswer()]);
            }
        }
        if ( score ==questions.size()){
            System.out.println("Congratulations ! You got "+score+"/"+questions.size());
        } else if (score== questions.size() -1){
            System.out.println("You were so close! Your score is "+score+"/"+questions.size());
        } else {
            System.out.println("Need to improve . You got "+score+"/"+questions.size());
        }
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

      
        quiz.addQuestion("Which is the largest ocean in the world?", new String[]{"Atlantic", "Pacific", "Arctic", "Indian"}, 1);
        quiz.addQuestion("Which country won T20 World Cup in 2024?", new String[]{"India", "Austraila", "South Africa", "England"}, 0);
        quiz.addQuestion("How many continents are there in the world?", new String[]{"10", "5", "7", "6"}, 2);
        quiz.addQuestion("Which country won the FIFA World Cup in 2018?", new String[]{"France", "Brazil", "Germany", "Argentina"}, 0);

      
        quiz.startQuiz();
    }
}

