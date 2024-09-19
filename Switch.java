public class Switch {
    public static void main (String []args){
        int dayOfWeek = 9;
        String dayname;

        switch (dayOfWeek) {
            case 1:
                dayname="Monday";
                break;
            case 2:
                dayname="Tuesday";
                break;
                
            case 3:
                dayname="Wednesday";
                break;
            
            case 4:
                dayname="Thursday";
                break;
            
            case 5:
                dayname="Friday";
                break;

            case 6:
                dayname="Saturday";
                break;

            case 7:
                dayname="Sunday";
                break;
            
            default:
            dayname ="Not Valid value";
                break;
        }
        System.out.println(dayname);
    }
}
