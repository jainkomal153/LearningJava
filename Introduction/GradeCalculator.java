package Introduction;

//import javax.swing.text.StyledEditorKit.ForegroundAction;

public class GradeCalculator {

    public static void gradefinder(String studentName, int score) {

        String grade;

        if (score >= 90 && score <= 100){

            grade = "A";
        }
        else if (score >= 80 && score < 90){

            grade = "B";
        }
        else if (score >= 70 && score < 80){

            grade = "C";
        }
        else if (score >= 60 && score < 70){

            grade = "D";
        }
        else{
            grade = "E";
        }
        
        System.out.println("Student Name: " + studentName);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println(" ");
    }
    public static void main(String[] args) {

        gradefinder("Student 1", 100);
        gradefinder("Student 2", 90);
        gradefinder("Student 3", 80);
        gradefinder("Student 4", 70);
        gradefinder("Student 5", 60);
        gradefinder("Student 6", 50);

    }
    
}
