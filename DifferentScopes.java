public class DifferentScopes {

    int instanceVariable = 10;
    double instanceDouble = 1.8;
    String instanceVariableString = "This is a string";

// add static is just for this once meaning cant be used by another instance anymore
    static int instantVariableStatic = 20;

    public void showLocalVariable(){
        String localStringVariables = "Finish" ;
        int localVariable = 30;
        System.out.println("My local variable is :" + localVariable + " " + localStringVariables );
    }

public static void main(String[] args){
    DifferentScopes example = new DifferentScopes();
    example.showLocalVariable();
    System.out.println ("My local variable is :" + example.instanceVariable + " " + example.instanceVariableString);
}
}