import java.text.DecimalFormat;

/**
 * Created by Mohamed_Alkurwi on 2/17/2016.
 */
public class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private double hoursRequiered;
    private double hoursAttended;
    DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

    public TeamLeader(Employee employee, ProductionWorker worker, double monthlyBonus,
                      double hoursAttended, double hoursRequiered) {
        super(employee,worker);
        this.monthlyBonus = monthlyBonus;
        this.hoursAttended = hoursAttended;
        this.hoursRequiered = hoursRequiered;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public double getHoursRequiered() {
        return hoursRequiered;
    }

    public double getHoursAttended() {
        return hoursAttended;
    }

    public String toString() {
        return "Leader Info:\n" +
                super.toString()+
                "\nMonthly Bonus: $" + decimalFormat.format(monthlyBonus) +
                "\nHours Required: " + hoursRequiered +
                "\nHours Attended: " + hoursAttended;
    }
}
