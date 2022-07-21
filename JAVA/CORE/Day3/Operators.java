package coreJAVA.Week_1.Day_2;
class Operators{
    public static void main(String[] args) {
        Operators_Class.arithmatic_Operator();
        Operators_Class.assignment_Operator();
        Operators_Class.logical_operators();
        Operators_Class.relational_Operators();
        Operators_Class.unary_operators();
        Operators_Class.ternary_operator();
    }
}
class Operators_Class {
     static void  arithmatic_Operator( ){
         int num1 =10, num2 =2;
         System.out.println("Addition"+ (num1 + num2));
         System.out.println("Subtraction"+ (num1 - num2));
         System.out.println("multiplication"+ (num1 * num2));
         System.out.println("division"+ (num1 / num2));

     }
   static void assignment_Operator(){
       // create variables
       int a = 4;
       int var;

       // assign value using =
       var = a;
       System.out.println("var using =: " + var);

       // assign value using =+
       var += a;
       System.out.println("var using +=: " + var);

       // assign value using =*
       var *= a;
       System.out.println("var using *=: " + var);
   }
   static void relational_Operators(){
       // create variables
       int a = 7, b = 11;

       // value of a and b
       System.out.println("a is " + a + " and b is " + b);

       // == operator
       System.out.println(a == b);  // false

       // != operator
       System.out.println(a != b);  // true

       // > operator
       System.out.println(a > b);  // false

       // < operator
       System.out.println(a < b);  // true

       // >= operator
       System.out.println(a >= b);  // false

       // <= operator
       System.out.println(a <= b);  // true
   }
   static void logical_operators(){
       // && operator
       System.out.println((5 > 3) && (8 > 5));  // true
       System.out.println((5 > 3) && (8 < 5));  // false

       // || operator
       System.out.println((5 < 3) || (8 > 5));  // true
       System.out.println((5 > 3) || (8 < 5));  // true
       System.out.println((5 < 3) || (8 < 5));  // false

       // ! operator
       System.out.println(!(5 == 3));  // true
       System.out.println(!(5 > 3));  // false
   }
   static void unary_operators(){
       // declare variables
       int a = 12, b = 12;
       int result1, result2;

       // original value
       System.out.println("Value of a: " + a);

       // increment operator
       result1 = ++a;
       System.out.println("After increment: " + result1);

       System.out.println("Value of b: " + b);

       // decrement operator
       result2 = --b;
       System.out.println("After decrement: " + result2);
   }
   static void ternary_operator(){
       int februaryDays = 29;
       String result;

       // ternary operator
       result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
       System.out.println(result);
   }


}
