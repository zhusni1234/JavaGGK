public class Student {

    private double GPA;
    private double GPA2;
    private double GPA3;
    
    private int age;
    private int yOs;

    public Student(int yOs ,double GPA, int age , double GPA2, double GPA3){
        this.yOs = yOs;
        this.GPA = GPA;
        this.age = age;
        this.GPA2 = GPA2;
        this.GPA3 = GPA3;
        
        
    }
    public void displayDetails(){
        System.out.println("The Year Of Study is :" +yOs);
        System.out.println("The age is :" +age);
        System.out.println("The GPA is : " +GPA);
        System.out.println("The GPA is : " +GPA2);
        System.out.println("The GPA is : " +GPA3);
        System.out.println("the CGPA is : "+ ((GPA+GPA2+GPA3)/3));
        
    }

    public static void main(String[] args){
        Student person = new Student( 2023, 3.5, 25, 3.0,3.1);
        person.displayDetails();
    }
}
