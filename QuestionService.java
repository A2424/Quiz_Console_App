import java.util.Scanner;

public class QuestionService {

 Question question[]=new Question[5];
 String userselections[]=new String[5];

    public QuestionService() {
            question[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
            question[1] = new Question(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars");
            question[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
            question[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Pacific Ocean");
            question[4] = new Question(5, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Pb", "Au");
        }

    public void displayQuestion() {
        System.out.println("Welcome to the Quiz!");
        System.out.println("Here is your question:");
        int i=0;
        for(Question q : question) {
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestions());
            System.out.println("A. " + q.getOption1());
            System.out.println("B. " + q.getOption2());
            System.out.println("C. " + q.getOption3());
            System.out.println("D. " + q.getOption4());
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your answer (A, B, C, D): ");
            String userAnswer = scanner.nextLine().trim().toUpperCase();
            String correctAnswer = q.getAnswer();   
            String selectedOption = "";
            switch(userAnswer) {
                case "A":
                    selectedOption = q.getOption1();
                    break;
                case "B":
                    selectedOption = q.getOption2();
                    break;
                case "C":
                    selectedOption = q.getOption3();
                    break;
                case "D":
                    selectedOption = q.getOption4();
                    break;
                default:
                    System.out.println("Invalid option selected.");
                    selectedOption = "Invalid";
                    break;
                
            }
            if(selectedOption.equals(correctAnswer)) {
                System.out.println("Correct answer!");

            } else {
                System.out.println("Wrong answer! The correct answer is: " + correctAnswer);
            }
            userselections[i]=selectedOption;
            i++;
            System.out.println();
        }
    }
    public int printScore(){
        int score=0;
        for(int i=0;i<5;i++){
            if(userselections[i].equals(question[i].getAnswer())){
                score++;
            }
        }
        return score;
    }
    public String[] getUserselections() {
        return userselections;
    }
}
