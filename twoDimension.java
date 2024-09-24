public class twoDimension {
    public static void main(String[] args){

        int [][] matrix = new int[3][4];

       matrix[0][0]=1; matrix[0][1]=2;  matrix[0][2]=3; matrix[0][3]=4;
       matrix[1][0]=6; matrix[1][1]=7;  matrix[1][2]=8; matrix[1][3]=8;
       matrix[2][0]=12; matrix[2][1]=14; matrix[2][2]=18; matrix[2][3]=20;
        
         
         

        int[][]numbers ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}};
        
         for (int row=0;row<matrix.length;row++){
            for (int col =0;col<matrix[row].length;col++){
                System.out.println("Another way"+" "+matrix[row][col]);
            }
         }
         
        
         //------------------------------------------------------------------------//
            // method no 2 
         for (int[]number:numbers){
            for(int value:number){
                System.out.println(value);
            }
        }
        for (int[] array:numbers){
            for(int number:array){
                System.out.println(number);
           }
        }
    }
    
}
