import java.util.Scanner;

 class employeeData {

    private String name;
    private double Salaries[] = new double[3];
    private double  SalarySum;
    private double bonus;
    private double SaBos;
   

    public String getName() {
        return name;
    }
    public double[] getSalaries() {
        return Salaries;
    }
    public double getSalarySum() {
        return SalarySum;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSaBos() {
        return SaBos;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalaries(double[] Salaries) {
        this.Salaries = Salaries;
    }
    public void setSalarySum(double SalarySum) {
        this.SalarySum = SalarySum;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSaBos(double SaBos) {
        this.SaBos = SaBos;
    }


    public employeeData(String Name, double baseSalary, double healthAllowance, double transportAllowance){

        this.name = Name;
        this.Salaries[0] = baseSalary;
        this.Salaries[1] = healthAllowance;
        this.Salaries[2] = transportAllowance;
        this.SalarySum = TotalSalary();
        this.bonus = assignBonus();
        this.SaBos = assignSaBos();
    
    }

public double  TotalSalary(){

        double TotalSalary = 0;
        for(int i=0; i<Salaries.length;i++){

            TotalSalary = TotalSalary + Salaries[i];

        }

       

    return(TotalSalary);
}

public double assignBonus(){

        double bonus = 0;

        if(SalarySum>=50000){
            bonus = SalarySum*0.1;
        }

        else if (SalarySum>=30000){
            bonus = SalarySum*0.05;
        }

        else {
            bonus = 0;
        }

        return (bonus);
    
}

public double  assignSaBos(){

    double SaBos = SalarySum+bonus;
    

   

return(SaBos);
}

public void Display(){
    System.out.println("Employee name:"+ " "+ name);
    System.out.println("Employee total salary:"+ " "+ SalarySum);
    System.out.println("Employee bonus :" + " " + bonus); 
    System.out.println("Employee bonus + Salary :" + " " + SaBos);    


}

}
public class EmployeeHR {
    public static void main (String[] args){
        employeeData employee = new employeeData(null,0,0,0);
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<2;i++) {

            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Base Salary: ");
            double baseSalary = scanner.nextInt();
            System.out.print("Health Allowance: ");
            double healthAllowance = scanner.nextInt();
            System.out.print("Transport Allowance: ");
            double transportAllowance = scanner.nextInt();
        

             employee = new employeeData(name,baseSalary,healthAllowance,transportAllowance);
            employee.assignBonus();
            employee.Display();
            

        }

    }
}
