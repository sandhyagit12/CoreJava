package Single_Inheritance;

public class Lab165_instanceVar_LocalVar {
int e=45;
//instance variable is created, Instance variable is inside the class
    //instance variable!= Global variable
    //Global variables are not available in JAva


void f1()
{
    int e = 10; // Local Variable
    //Local variable is inside the method
    //local variable is accessed inside the method.
    System.out.println(e);
}

    void f2(){
        e = 50;
        System.out.println(e);
    }

}
