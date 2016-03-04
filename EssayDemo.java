import java.util.Scanner;

/**
 * Created by Mohamed_Alkurwi on 2/22/2016.
 */
public class EssayDemo {
    public static void main(String[] args) {
        int grammar, spelling, correct, content;
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the grammar's grade between (0 - 30): ");
        grammar = key.nextInt();
        while (grammar > 30 || grammar < 0)
        {
            System.out.println("Invalid grade was entered." +
                    " Re-enter the grammar's grade between (0 - 30): ");
            grammar = key.nextInt();
        }
        System.out.println("Enter the spelling's grade between (0 - 20): ");
        spelling = key.nextInt();
        while (spelling > 20 || spelling < 0)
        {
            System.out.println("Invalid grade was entered." +
                    " Re-enter the spelling's grade between (0 - 20): ");
            spelling = key.nextInt();
        }
        System.out.println("Enter the correct's grade between (0 - 20): ");
        correct = key.nextInt();
        while (correct > 30 || correct < 0)
        {
            System.out.println("Invalid grade was entered." +
                    " Re-enter the correct's grade between (0 - 20): ");
            correct = key.nextInt();
        }
        System.out.println("Enter the content's grade between (0 - 30): ");
        content = key.nextInt();
        while (content > 30 || content < 0)
        {
            System.out.println("Invalid grade was entered." +
                    " Re-enter the content's grade between (0 - 30): ");
            content = key.nextInt();
        }
        Essay essay = new Essay(grammar,spelling,correct,content);
        System.out.println("Your essay grade is: " +essay.getGrade());
    }

}
