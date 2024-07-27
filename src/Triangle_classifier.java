
import java.util.Scanner;
public class Triangle_classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter side1");
        int side1 = sc.nextInt();
        System.out.println("enter side2");
        int side2 = sc.nextInt();
        ;
        System.out.println("enter side3");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3)
        {
            System.out.println( "form equilateral triangle");
        }

            else if (side1 == side2 || side1 == side3)
            {
                System.out.println("form isoscles triangle");
            }
           else
           {
               System.out.println("scalene triangle");
        }
           // }
        }
    }

