import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Mohamed_Alkurwi on 2/17/2016.
 */
public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;
    DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

    public ProductionWorker(Employee employee,ProductionWorker worker)
    {
        super(employee);
        this.shift = worker.getShift();
        this.hourlyPayRate = worker.getHourlyPayRate();
    }
    public ProductionWorker(int shift, double hourlyPayRate)
    {
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }


    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    @Override
    public String toString() {
        return "ProductionWorker:\n" +
                super.toString() +
                "\nShift: " + shift +
                "\nHourly PayRate: " + hourlyPayRate;
    }
}
