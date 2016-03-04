import java.util.Arrays;

/**
 * Created by Mohamed_Alkurwi on 2/22/2016.
 */
public class CourseGrade extends GradeActivity {
    private GradeActivity [] grades;
    private int lab, passFailMissed, finalExamMissed, essay;

    public CourseGrade(int lab, int passFailMissed, int finalExamMissed, int essay) {
        this.lab = lab;
        this.passFailMissed = passFailMissed;
        this.finalExamMissed = finalExamMissed;
        this.essay = essay;
        grades = new GradeActivity[4];
    }

    public void setLab(GradeActivity labGrade) {
        labGrade.setScore(lab);
        grades[0] = labGrade;
    }

    public void setPassFail(PassFailExam passFailExam) {
        passFailExam = new PassFailExam(10,passFailMissed,70);
        grades[1] = passFailExam;
    }

    public void setFinalExam(FinalExam finalExam) {
        finalExam = new FinalExam(50,this.finalExamMissed);
        grades[2] = finalExam;
    }

    public void setEssay(Essay essay) {
        essay.setScore(this.essay);
        grades[3] = essay;
    }
    @Override
    public String toString() {
        return "Course Grade:" +
                "\n, Lab= " + grades[0].getScore() +"," + grades[0].getGrade() +
                "\n, Pass Fail Exam= " + grades[1].getScore() + ", " + grades[1].getGrade() +
                "\n, Final Exam= " + grades[2].getScore() + ", " + grades[2].getGrade() +
                "\n, Essay= " + grades[3].getScore() + ", " + grades[3].getGrade();
    }
}
