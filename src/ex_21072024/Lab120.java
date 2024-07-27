package ex_21072024;

public class Lab120 {
    public static void main(String[] args) {
        {
            //loop with condition
            //break;
            for(int i=0;i<=9;i++)
            {
                System.out.println(i);
                if(i==8)
                {
                    System.out.println("condition true i==8: break");
                    break;
                }
            }
        }
    }
}
