/**
 * Created by Mohamed_Alkurwi on 2/18/2016.
 */
public class Essay extends GradeActivity{
    private int grammar, spelling, correct, content, total;

    public Essay(int grammar, int spelling, int correct, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.correct = correct;
        this.content = content;
        total = (this.grammar + this.spelling + this.correct + this.content);
        setScore(total);
    }

    public Essay()
    {

    }
    @Override
    public void setScore(double s) {
        super.setScore(s);
    }
}
