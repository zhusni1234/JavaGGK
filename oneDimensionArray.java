public class oneDimensionArray {
    public static void main (String []args){
        int [] numbers = new int[5];

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;

        int [] values = {60,70,80,90,99};

        for (int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }

        for (int value: values){
           System.out.println(value);
        }

        for (int value:values){
            if (value== 70){
                System.out.println("The values is 70");
            }
        }
    }
}
