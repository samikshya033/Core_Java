//Division one:
//Based on type of value represented by the available all variable are
// divide into two type==>

//1.Primitive variables can be used to represent primitive value
//eg:int x =10;

//2. Reference variables can be used to refer objects
//eg:Student S=new Student();
//s is pointing to object

//Division two:
//Based on the position of declaration under behavior all variables are
// divided into three types==>
//1. Instance variables
//2.Static     "
//3.Local Variables

//1.------------------Instance Variables:------------------------
//a)if the value of variable is varied from object to object
//such type of variables are called instance variables.
//b)for every object separate copy of instance variables will be created

// Instance variable within the class directly but outside of
// any method block or constructor

//Instance variable will be created at the time of object creation on to
//destroy at the time of object destruction hence the scope instance variable
//is exactly same as the scope of object.

//Instance variable should be store in the heap memory at the part of object

 //we can't access instance variable directly from static area, but we can
//access by using object reference, but we can access instance variable directly from
//instance area.

//Example:

//public class Variable{
//    int x=10;
//
//    public static void main(String[] args){
//        //System.out.println(x); //CE:non-static variable x cannot be reference
//        //from static context
//        Variable t=new Variable();
//        System.out.println(t.x);
//    }
//    public void m1(){
//        System.out.println(x);
//    }
//}

//For instance a variable JVM will always provide default values and
// we aren't required to perform initialization explicitly

//public class Variable {
//    int x;
//    double d;
//    boolean b;
//    String s;
//
//    public static void main(String[] args){
//        Variable v1=new Variable();
//        System.out.println(v1.x);  //0
//        System.out.println(v1.d);  //0.0
//        System.out.println(v1.b); //false
//        System.out.println(v1.s); //null
//    }
//}

//Instance variable also Known as object levels variables or Attributes.

//2.--------------------STATIC VARIABLES-------------------------------

//If the value of the variable is not varied from object to object then
//it's not recommended declare variable as instance variable
//we have to declare such type of variable class level by using static modifier.

//In the case of instance variable for every object separate copy will
//be created but in the case of static variable a single copy will be
//created at class level and shared by every object of the class.

//Static variable should be declared within the class directly  but outside
//any method block or constructor.

//Static variable will be created at the time of class loading
//on the destroyed at the time of class unloading and hence scope of
//static variable is exactly same as scope of .classFile.

//