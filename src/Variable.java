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

// Instance variable within the class directly but outside
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

//For instance a variable JVM will always provide default values, and
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

//Java Test.
//1.Start JVM
//2.Create and start main thread
//3.Locate Test.Class file
//4.Load Test.Class  ==>Static variables creation
//5.Execute main() method
//6.Unload Test.Class  ==>Static variable destruction
//7.Terminate main Thread
//8.Shutdown JVM

//Static variable should be store in Method Area and Local Variable store in stack.

//We can access static variables either by object reference class name but recommended to use class name
//with in the same class it's not required to use class name and we can access directly


//class Variable{
//    static int x=10;
//    public static void main (String[] args){
//        Variable t=new Variable();
//        System.out.println(t.x);
//        System.out.println(Variable.x);
//        System.out.println(x);
//    }
//}

//We can access static variable directly from
// both instance and static area

//class Variable{
//    static int x=50;
//    public static void main (String[] args){
//        System.out.println(x);
//    }
//
//    public void m1() {
//        System.out.println(x);
//    }
//}

//For static variable JVM will provide default values, and
// we are not required to perform initialization explicitly

// public class Variable{
//    static int x;
//    static  double d;
//    static  String s;
//
//    public static void main (){
//        System.out.println(x);//0
//        System.out.println(d);//0.0
//        System.out.println(s);//null
//    }
//}

//Static variable also knows as class level variables or fields.

//class Variable{
//    static int x=20;
//    int y=30;
//
//    public static void main (String[] args) {
//        Variable v=new Variable();
//        v.x=888;
//        v.y=999;
//
//        Variable v1=new Variable();
//        System.out.println(v1.x+"..."+v1.y);
//    }
//}

//3.------------------Local Variable------------------------------------

//1.Sometimes to meet temporary requirements of the programmer we can declare
//variables inside the methods or block or constructor  such type of variables
//are called Local variables orTEMPORARY OR STACK OR AUTOMATIC Variables.

//2.Local variables will be store inside stack.

//3.Local variables will be created while executing the block in which
// we declared it .once a block execution completes then automatically
//local variables will be destroyed hence the scope of local variables
//is block in which we declared it.

//class Variable{
//    public static void main (String[] args) {
//        inti = 0;
//        int j;
//        for (j = 0; j < 3; j++) {
//            i = i + j;
//        }
//        System.out.println(i + "....." + j);//cannot find symbol variable j  and location class variable so we have given int j;
//    }
//}

//class Variable{
//    public static void main (String[] args) {
//        try{
//            int j=Integer.parseInt("ten");
//        }catch (NumberFormatException e){
//            j=10;
//        }
//        System.out.println(j);//compile error:cannot found symbol variable j and
//                            //location class variables
//    }
//}

//For local variables JVM won't provide default values compulsory we should perform initialization explicitly.
//Before using that variable that is if we are not using then it's not required to perform initialization

// class Variable{
//    public static void main(String[] args){
//        int x;
//        System.out.println("Hello");
//    }
//}

//class Variable{
//    public static void main(String[] args){
//        int x;
//        System.out.println(x);//CE: variable x might not have been initialized
//    }
//}



//class Variable{
//    public static void main(String[] args){
//        int x;
//        if(args.length>0){
//            x=10;
//        }
//        System.out.println(x);//CE: variable x might not have been initialized
//    }
//}

//class Variable{
//    public static void main(String[] args){
//        int x;
//        if(args.length>0){
//            x=10;
//        }else{
//            x=20;
//        }
//        System.out.println(x);//20
//    }
//}
//NOTE------------------------------
// 1)It's not recommended to perform initialization for local variables
// inside logical block because there is no guarantee for the execution
//of these blocks always at run time

//2)It's highly recommended to perform initialization for local variables
//at the time of declaration at least with the default values

//The only applicable modifier for local variables is final by mistake if you are
//trying to apply any other modifier then we will get compile time error

//class Variable{
//      public static void main(String[] args) {
//        public int x=10;
//        private int x=10;
//        protected int x=10;//This all is illegal start of expression
//        static int x=10;
//        transient int x=10;
//        volatile int x=10;

//        final int x = 10;//valid
//        System.out.println(x);
//    }
// }

//NOTE:If we are not declaring with any modifier then by default it
//is the default but this rule is applicable only for instance and
//static variables but not for local variables.

//CONCLUSION:1)For instance and static variables JVM will provide default
//values, and we are not required initialization explicitly but for local
//variables JVM going to provide the default value compulsory we should
// perform initialization explicitly before using that variables.

//2)For instance and static variables can be part accessed by multiple threads
//simultaneously and hence these are not thread safe but in the case of local
//variables for every thread separate copy will be created and hence
// local variables of thread safe.

//Types of variables =============>IS THREAD SAFE
//1)Instance "        =============>not
//2)static    "       ==============>not
//3)Local    "        ==============>yes

//Every variable in java should be either instance or static or local variables.
// every variable in java can be either primitive or reference.Hence,various possible combination of variables in java are ;
//combination like instance is both primitive and reference like other also.

//class Variable{
//    int x=10;//Instance-primitive
//    static  String s="samikshya";//Static-reference
//    public static void main(String[] args){
//        int[] y=new int[3];//local-reference
//
//    }
//}

//Uninitialized array:
//class Variable{
//    int[] x;
//    public static void main(String[] args){
//        Variable v=new Variable();
//        System.out.println(v.x);//null
//        System.out.println(v.x[0]);//Exception==>NullPointerException
//    }
//}

//I) Instance Level

//1>int[] x;
//sopln(obj.x);//null
//sopln(obj.x[0]);//NPE

//2>
//int[] x=new int[2];
//sopln(obj.x);//[I@3e2sas
//sopln(obj.x[0]);//0

//II) Static Level
//1>static int[] x;
//sopln(x);//null
//sopln(x[0]);//ce:NullPointerException

//2>
//static int[] x=new int[3];
//sopln(x);//[I@3e2sas
//sopln(x[0]);//0

//III)Local Level
//1>int[] x;
//sopln(x);
//sopln(x[0]);compile time error:variable x might not have been initialization

//2>int[] x= new ini[3];
//sopln(x);//[I@---------
//sopln(x[0]);//0

//Note:once we create an array every array element by default initializer with
//default values irrespective whether it is instance or static or local array.