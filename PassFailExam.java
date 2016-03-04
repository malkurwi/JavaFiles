

public class PassFailExam extends PassFailActivity
{
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    private int numericScore;

    public PassFailExam(int questions, int missed,
                        double minPassing)
    {

        super(minPassing);
        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / numQuestions;
        this.numericScore = (int) (100.0 - (numMissed * pointsEach));
        setScore(numericScore);
    }
    public PassFailExam()
    {

    }
    public int getNumericScore() {
        return numericScore;
    }
}