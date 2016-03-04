import java.util.Scanner;

/**
 * Created by Mohamed_Alkurwi on 1/31/2016.
 */
public class BudgetAnalysis {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter the budget amount: ");
        double budget = key.nextDouble();
        double expenses =0, total = 0, left;
        int finish = -999;
        while (expenses != finish) {
            System.out.print("Enter the amount of your expenses: ");
            expenses = key.nextDouble();
            if(expenses != -999)
            total += expenses;
        }
        if(total > budget)
        {
            left = budget - total;
            System.out.printf("You have $%,.2f owed under budget!" , left);
        }
        else if(budget > total)
        {
            left = budget - total;
            System.out.printf("You have $%,.2f left over budget!" , left);
        }
        else
        {
            System.out.println("You have $0 left!");
        }
    }
}
