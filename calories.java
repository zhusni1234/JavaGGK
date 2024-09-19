public class calories {
    public static void main (String[]args){
        int dayofweek = 1;
        int Calo = 2700;
        String day;

        
        while(dayofweek <=7){
            if(dayofweek<=2){
            switch(dayofweek){
            case 1:
                day="Monday,total calories need to take"+" "+(Calo);
                break;
            case 2:
                day="Tuesday,total calories need to take"+" "+(Calo);
                break;
                
            
            default:
            day ="Not Valid value";
                break;
            }
            System.out.println(day);
            dayofweek++;
        }
        else{
            Calo = Calo + 100;
            switch(dayofweek){
                case 1:
                    day="Monday,total calories need to take"+" "+(Calo);
                    break;
                case 2:
                    day="Tuesday,total calories need to take"+" "+(Calo);
                    break;
                    
                case 3:
                    day="Wednesday,total calories need to take"+" "+(Calo);
                    break;
                
                case 4:
                    day="Thursday,total calories need to take"+" "+(Calo);
                    break;
                
                case 5:
                    day="Friday,total calories need to take"+" "+(Calo);
                    break;
    
                case 6:
                    day="Saturday,total calories need to take"+" "+ (Calo);
                    break;
    
                case 7:
                    day="Sunday,total calories need to take" +" "+(Calo);
                    break;
                
                default:
                day ="Not Valid value";
                    break;
                }
                System.out.println(day);
                dayofweek++;
        }
    } 
    }
            
}

