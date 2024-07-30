package ex_28072024_OOPS;

public class Lab154 {
    public static void main(String[] args) {

    //An object has a state, behavior and identity
    //provides security
   // Attributes / properties -> 2 hand, eye color, node, mouth, height, weight, body color, hair color
    // Behaviour / methods -> walk(), eat(), talk(), read(), sleep(), hear().
    //class- a blueprint; object is a real entity
//this is a runner class where the class person is used/ copy of person is used with the real entities

    person person = new person();
    person.name = "Amit";
    person.rollno = 1;

    person person2= new person();
    person2.name= "sharwan";
    person2.rollno = 2;

        System.out.println( person.name );
        System.out.println(person.rollno);
    }

}
