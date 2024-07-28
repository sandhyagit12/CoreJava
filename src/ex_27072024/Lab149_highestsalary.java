package ex_27072024;

public class Lab149_highestsalary {
    public static void main(String[] args) {
        int[] salary = {7, 10, 4, 13, 225, 18, 9, 8, 17};
        int max = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
        }
        System.out.println("max salary =" + max);

        int min= salary[0];
        for(int i=0;i< salary.length ;i++){
            if (salary[i]<min)
            {
                min = salary[i];
                }

        }
        System.out.println("min salary is" + min);
    }
}
