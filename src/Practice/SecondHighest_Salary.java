package Practice;

import java.util.Arrays;
public class SecondHighest_Salary {
    public static void main(String[] args) {
        int[] salary = {88,56,27,45,89,20,95,65};
        int  max= salary[0];
       /* for (int i=0;i<(salary.length);i++)
        {
            if(salary[i]>max){
                max=salary[i];

            }
        }

        System.out.println("second max salary is "+max);*/
        Arrays.sort(salary);
        for (int i=0;i< salary.length;i++) {
            System.out.print(salary[i]);
            System.out.print("\t");
        }
        System.out.println();
      System.out.println(salary[(salary.length)-1]);
    }

}
