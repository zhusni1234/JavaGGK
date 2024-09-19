public class PetrolCarUsage {

      private String CarType;
    private double PetrolUsage;

    public String getCarType(){
        return CarType;
    }
    public void setCarType(String CarType){
        this.CarType= CarType;
    }
    public double getPetrolUsage(){
        return PetrolUsage;
    }

    public void setPetrolUsage(double PetrolUsage){
        this.PetrolUsage=PetrolUsage;
    }

    
        
        
        

public static void  main (String[] args){ 
        PetrolCarUsage car = new PetrolCarUsage();
        String [][] CarType = new String[3][2];

        CarType[0][0]="Toyota"; CarType[0][1]="Perodua"; 
        CarType[1][0]="Proton"; CarType[1][1]="Nissan";
        CarType[2][0]="Mitsubishi"; CarType[2][1]="BMW"; 
        
        double [][] petrolUsage = new double[3][2];

        petrolUsage[0][0]=15.1; petrolUsage[0][1]=16.2; 
        petrolUsage[1][0]=14.8; petrolUsage[1][1]=14.0;
        petrolUsage[2][0]=17.2; petrolUsage[2][1]=22.4;

        for (int row=0;row<CarType.length;row++){
            for (int col =0;col<CarType[row].length;col++){
                car.setCarType(CarType[row][col] );
                car.setPetrolUsage(petrolUsage[row][col]);

                System.out.println("The Car is"+ " " + car.getCarType()+" "+" Petrol usage is"+ " "+ car.getPetrolUsage()+ "Litre every 100 KM");
            }
         
        }
    }
}    
    


