package ex_27072024;

public class MaxMin_2Darray {
    public static <Int> void main(String[] args) {
        int [][] array_2D= { {42,35,24},{11,75,12},{0,-2,-154}};
        int max = array_2D[0][0];
        int min= array_2D [0][0];

        for (int i = 0; i < array_2D.length; i++) {
            for (int j = 0; j < array_2D[i].length; j++) {
                System.out.print(array_2D[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("***********************");
        for(int i=0;i<array_2D.length;i++){
            for(int j=0;j<array_2D[i].length;j++){

                if(array_2D[i][j]>max){
                    max=array_2D[i][j];
                }
            }
        }
        System.out.println("max is" +max);

for(int i=0;i<array_2D.length;i++)
{
    for(int j=0;j<array_2D[i].length; j++)
    {
        if(array_2D[i][j]<min){
            min=array_2D[i][j];

        }
    }

}
        System.out.println("min is" +min);
    }
}
