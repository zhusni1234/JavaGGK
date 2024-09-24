import java.util.Scanner;

class Student{
    private String name;
    private int[] scores;
    private double avgScores ;

    public Student(String name, int[] scores, double avgScores){
        this.name = name;
        this.scores = scores;
        this.avgScores = avgScores;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int[] getScores(){
        return scores;
    }

    public void setScores(int[] scores){
        this.scores = scores;
    }

    public double getAvgScores(){
        return avgScores;
    }

    public void setAvgScores(double avgScores){
        this.avgScores = avgScores;
    }

    public void calculateAverage(){
        double Scores = 0;
        for(int i=0; i<scores.length; i++){
            Scores = Scores + scores[i];
        }
        avgScores = Scores / 3;
        System.out.println(avgScores);
    }

    public void assignGrade(){
        String grade = " ";

        if(avgScores>=80){
            grade = "A";
        }else if(avgScores>=60 ){
            grade = "B";
        }else if(avgScores>=50){
            grade = "C";
        }else if(avgScores>=40 ){
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println(grade);
    }

}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner Student = new Scanner(System.in);
        String pupil [] = new String[5];
        




        /*int[][] scores= {
            {80, 85, 81},
            {77, 74, 67},
            {59, 51, 53},
            {49, 49 , 49},
            {15, 20, 27},
        ;
        */



       /*  Student student = new Student(null, null, 0);

        for(int row=0; row<scores.length; row++){
            student.setScores(scores[row]);
            student.setName(studName[row]);
            String subject = " ";

            System.out.println("Name " + student.getName());

            for(int col=0; col<scores[row].length; col++){
                int[] s = student.getScores();

                if(col == 0){
                    subject = "Math ";
                }else if(col == 1){
                    subject = "Science ";
                }
                else if(col == 2){
                    subject = "English ";
                }

                System.out.println(subject + s[col]);
            }
                */
           // System.out.print("Average Score: ");
            //student.calculateAverage();
            //System.out.print("Grade: ");
            //student.assignGrade();
            
        }
    }
    

    
