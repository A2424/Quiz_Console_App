public class Main {
    
    public static void main(String[] args) {
        QuestionService qs = new QuestionService();
        qs.displayQuestion();
        System.out.println("Your score is: " + qs.printScore());
        System.out.println("Your selections are: " + java.util.Arrays.toString(qs.getUserselections()));
    }
}
