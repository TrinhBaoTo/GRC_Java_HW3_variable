// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment #3, 10/30/19
//
// This program's behavior is evaluate the expressions and print out the results.

public class HW3
{//open class
	public static void main(String[] args)
   {//open main

   int answer1= 3 - 1;
   // variable type: integer
   System.out.println(answer1);
   
   int answer2= 2 + 2 + 3 + 4;
   // variable type: integer
   System.out.println(answer2);
   
   double answer3= 2 + 2  + 3.1 + 4;
   // variable type: double (3.1)
   System.out.println(answer3);
   
   String answer4= 2 + " 2 + 3 " + 4;
   // variable type: String(" 2 + 3 ")
   System.out.println(answer4);
   
   String answer5= 3 + 4 + " 2 + 2";
   // variable type: String(" 2 + 2 ")
   System.out.println(answer5);
   
   int answer6= 2 + 2  + (3 /  4);
   // variable type: integer
   System.out.println(answer6);
   
   double answer7=(12 / 2) + (13 / 4.0);
   // variable type: double (4.0)
   System.out.println(answer7);
   
   String answer8= "hello" + 2 * 4;
   // variable type: String ("hello")
   System.out.println(answer8);
   
   double answer9= 2 +  2.0 + 2 * 2 + 2;
   // variable type: double (2.0)
   System.out.println(answer9);
   
   double answer10= 4 + 1 + 9 + .01 + (-3 + 10) + 11 / 3;
   // variable type: double(.01)
   System.out.println(answer10);
   
   double answer11= 8 + 16 / 5 + 4 + 0 + 12 / 5.0;
   // variable type: double (5.0)
   System.out.println(answer11);
   
   int answer12= 1 + 1 + (8 - 2) * 1 + 1;
   // variable type: integer
   System.out.println(answer12);
   
   String answer13= 5 + 2 + "(1 + 1)" + 4 + 2 * 3;
   // variable type: String ("(1 + 1)")
   System.out.println(answer13);
   
   String answer14= "1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9);
   // variable type: String ("1","4","7")
   System.out.println(answer14);

   }//end main
}//end class