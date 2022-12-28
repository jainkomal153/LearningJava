package Introduction;

public class gradefinderforloop {

    public static void gradefinder(int score) 
    {

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
        
        System.out.println("Grade: " + grade);
        System.out.println(" ");
    }   
    public static void main(String[] args) {
        
        String[] studentName = {"stud1", "stud2", "stud3"};
        int[] score = {100, 80, 60};

        for (int i=0; i< studentName.length; i++){

            for(int scores: score){

                System.out.println("Name of the student: " + studentName[i]);
                System.out.println("Score of the Student: " + scores);
                gradefinder(scores);

            }
        }
        
    }
        
    
}
