//1.Introduction
//2.array declaration
//3.array creation
//4.array initialization
//5.array declaration,creation,initialization in a single line
//6.length and length()
//7.Anonymous arrays
//8.Array element assignments
//9.array variable assignment


//-------------------------------Arrays-------------------------
//int x=10;
//int y=20;
//int t=30;3 variable assign needed 3 value

//limitation-
//1)array are fixed in size
//2)array can hold only homogenous datatype elements

//1.------------------Arrays----------------------
//array is an indexed collection of fixed no of homogenous data elements.

// The main advantages of arrays is we can represented
//use number if values by using single variable so that readability
//of code will be improved

//The main disadvantage of array is fixed in size i.e. once we create an
//array there is no chance of increasing or decreasing the size based on our
//requirement hence to use array  concept compulsory we should know
// the size in advance,which may not possible always

//2.-------------------Array Declaration----------------------

//----------one-dimensional array declaration:- ----------
//int[] x;    valid  best practice recommended because the name is clearly separated from the type
//int []x;    valid
//int x[];    valid
//
//at the time of declaration, we can't specify the size otherwise we will get a compile-time error
//int[6] x;   invalid
//int[] x;    valid

//-----------two-dimensional array declaration------------------------
//int[][] x;  valid
//int [][]x;	valid
//int x[][];  valid
//int[] []x;  valid
//int[] x[];   valid
//int []x[];   valid

//which of the following is valid
//        int[] a,b;    valid  a= 1 b= 1 dimensional
//        int[] a[],b; 	valid a=2 b=1 dimensional
//        int[] a[],b[]; 	valid  a=2 b=2 dimensional
//        int[] []a,b;	valid  a=2,b=2 dimensional
//        int[] []a,b[]; 	valid  a=2,b=3 dimensional
//int[] []a,[]b;  invalid  if we want to specify dimensional before the variable that facility is applicable
// only for 1st variable in a declaration

//if we are trying to apply for the remaining variables we will get a compile-time error

//int[] []a,[]b,[]c;  a is valid b is invalid c is invalid

//---------------Three-dimensional array declaration ----------------------
//int [x][] a;  valid
//int [][][]a;  valid
//int[] a[][][];  valid
//int[] [][]a;   valid
//int[] a[][];   valid
//int[] []a[];   valid
//int[][] []a;   valid
//int[][] a[];  valid
//int [][]a[][];  valid
//int []a[][];   valid


//3.------------------- Array Creation-----------------------------
//int[] a=new int[3]; => every array in java is an object only
// hence we can create array by using new operator

//public class Arrays {
//    public static void main(String[] args){
//        int[][] x=new int[3][2];
//        System.out.println(x.getClass().getName()); //output=>[[I
//    }
//}


//for every array type corresponding classes are available and these
//classes are part of java language and not available to programmer level

//array, corresponding class name
//int[]         [I
//int[][]       [[I
//double[]       [D
//short[]        [S
//byte[]          [B
//boolean[]       [Z

//loopholes for creating arrays
//1)at the time of array creation compulsory we should specify the size
//otherwise compile time error
//eg:int[] x=new int[];  invalid
//int[] x=new int[6];

//public class Arrays {
//    public static void main(String[] args){
//        System.out.println(args.length);//output=0
//    }
//}


//2)it is legal have an array with size zero in java
//int[] x=new int[0];

//3)if we are trying to specify with some -ve int value then we will
//get runtime exception saying -ve array size exception

//int[] x=new int[-3]  invalid run time exception =>-ve array size exception

//4)to specify array size allowed datatypes are ==>byte,short,char if we're
//trying to specify with another type then we will get compile time error

//int[] x=new int[10];  valid
//int[] x=new int['a'];     [output=>97]

//byte b=20;
//int[] x=new int[b]; valid

//short s=30;    valid
//int[] x=new int[s];

//int[] x=new int[10l];invalid ce:PLP found:long  required:int

//NOTE:the maximum allowed array size in java is 2147483647
// which is the maximum value of the int data type

//int[] x=new int [2147483647];  valid but RE: even in this case we may
// get a run time exception if sufficient heap memory is not available
//int[] x=new int[2147483648];   invalid CE ; integer number is
// too large


//TWO DIMENSIONAL ARRAY CREATION IS ALSO KNOWN AS [MATRIX=group of rows and column]
//In java two-dimensional not implemented by using matrix style some people
//followed array of array approach for multidimensional array creation
//The main advantage of this approach is memory utilization will be improved

//example-1
//        int[][] x=new int[2][];
//        x[0]=new int[2];
//        x[1]=new int[3];

//example-2
//   int [][][] x=new int[2][][];
//x[0]=new int[][];
//x[0][0]=new int[1];
//x[0][1]=new int[2];
//x[0][2]=new int[3];

//x[1]=new int[2][2];


//which of the following array declarations are valid?

//int[] a=new int[];  invalid
//int[] a=new int[3];  valid
//int[][] a=new int[][];  invalid
//int[][] a=new int[3][];  valid
//int[][] a=new int[][4]; invalid
//int[][] a=new int[3][4]; valid
//int[][][] a=new int[3][4][5]; valid
//int[][][] a=new int[3][4][];  valid
//int [][][] a=new int[3][][5];  invalid
//int[][][] a=new int[][4][5];  invalid

//4.----------------------Array Initialization--------------------------
//once we create an array every element by default initializer
//with default value

//class Array {
//    public static void main(String[] args){
//        int[] x=new int[3];
//        System.out.println(x);//[I@27716f4
//        System.out.println(x[0]);//0
//    }
//}

// =>whenever we are trying to print any reference
//variable internally two string method will be call which
// is implement by default to return the sting in the following form
//Classname@hascode-in-hexadecimalform

//class Array {
//    public static void main(String[] args){
//        int[][] x=new int[3][2];
//        System.out.println(x);//[[I@27716f4
//        System.out.println(x[0]);//[I@8efb846
//        System.out.println(x[0][0]);//0
//    }
//}

//class Array {
//    public static void main(String[] args){
//        int[][] x=new int[2][];
//        System.out.println(x);//[[I@27716f4
//        System.out.println(x[0]);//0
//        System.out.println(x[0][0]);//NullPointerException
//    }
//}
//note:if we are trying to perform any operation on null then we
//will get null time exception saying null point exception


//once we create an array every array elements by default
// initializer with default values if we are not satisfied with default
//value then we can override these value with customized values
//example
//---------------------
//int[] x=new int[6];
//x[0]=10;
//x[1]=20;
//x[2]=30;
//x[3]=40;
//x[4]=50;
//x[5]=60;
//x[6]=70;invalid RE:ArrayIndexOutOfBoundsException
//x[2.5]=80; compile exception:plp found:double required:int

//NOTE:if we are trying to access array elements without of
// range index(either +ve or -ve int value)then we will get runtime
// exception saying index out of bounds exception

//5.----------------------Array Declaration,Creation,Initialization in a single line-----------------------

//we can declare create and initialize an array in a single line (shortcut
//representation
//example
//int[] x;
//x=new int[3];
//x[0]=10;
//x[1]=20;
//x[2]=30;
//int[] x={10,20,30};

//char[] ch={'a','e','i','o','u'};
//string[] s={"A","AA","AAA"}; string laterals

//we can extend this shortcut for multidimensional arrays also
//eg:int [][] x={{10,20},{30,40,50}};

//public class Array{
//    public static void main(String[] args){
//        int [][][] x={{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
//        System.out.println(x[0][1][2]);//60
//        System.out.println(x[1][0][1]);//80
//        System.out.println(x[2][0][0]); invalid=>C.E=array index out of bounds exception
//        System.out.println(x[1][2][0]); invalid=>same
//        System.out.println(x[1][1][1]);//100
//        System.out.println(x[2][1][0]);//invalid runtime exception:>AIOOBE
//    }
//}

//if we want to use this shortcut compulsory we should perform all activities in a single line
//if we are trying to divide into multiple then we will get compile time error
//int[] x={10,20,30};
//int[] x;
//x={10,20,30}; compile error:illegal start of expression

//6.-------------------------LENGTH VS LENGTH()----------------------

//Length is a final variable applicable for array
//length variable represent the size of the array
//example:int [] x=new int[6];
//sop ln(x.lenth());compile error:cannot find symbol Symbol:method length()
//location:class int[];
//sop ln(x.length);//6

//length()
//string s="samikshya";
//sopln(s.lenth);cannot find symbol
//Symbol:variable length location:class java language string
//sopln(s.length()); output: 9

//length method is final method applicable for string objects
//length method return number of character present in the string

//NOTE****:length of variable applicable for arrays but not for string
//objects whereas length method applicable for string object not for arrays

//string[] s={"A","AA","AAA"};
//sopln(s.length);output:3
//sopln(s.length());cannot find symbol
//symbol:method length() location:class string[]
//sopln(s[0].length);//cannot find symbol
//symbol:variable length location:class java.lenguage.string
//sopln(s[0].length());   output:1

//In multidimensional array only length represent only base size but not total size
//int[][] x=new int[6][3];
//sopln(x.lenth);     output:6
//sopln(x[0].length);  output:3
//there is no direct way to specify total length of multidimensional array,
//but indirectly we can find as follows:
//x[0].length+x[1].length+x[2].length+.......

//7.-------------------------ANONYMOUS ARRAYS------------------
//sometimes we can declare and array without name such type of name listed
//array are called anonymous arrays
//the main purpose of anonymous array is just for instant use (one time usage)

//we can create anonymous array as follows:
//new int[]{10,20,30,40};

//while creating anonymous arrays we cannot specify the size otherwise we will
//get compile time error
//example:new int[3]{10,20,30};  invalid
//new int[]{10,20,30};  valid