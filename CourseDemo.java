import java.util.Scanner;

/**
 * Created by Mohamed_Alkurwi on 2/22/2016.
 */
public class CourseDemo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the grade for Lab: ");
        int lab = key.nextInt();
        System.out.println("Enter the number of questions missed of 10: ");
        int passFail = key.nextInt();
        System.out.println("Enter the number of questions missed of 50: ");
        int finalExam = key.nextInt();
        System.out.println("Enter the grade for essay: ");
        int essay = key.nextInt();
        CourseGrade course = new CourseGrade(lab, passFail, finalExam, essay);
        course.setLab(new GradeActivity());
        course.setPassFail(new PassFailExam());
        course.setEssay(new Essay());
        course.setFinalExam(new FinalExam());
        System.out.println(course);
    }
}
