package Lesson02.online;

import javax.sound.sampled.Line;

public class HomeWorkApp02 {

    public static void main ( String [] arg) {

        if ( compareTwoNumbers ( 7,8) ) {
            System.out.println( "True");
        } else {
            System.out.println( "False");
        }


        positiveNegativeNumber (-500);

        if (positiveNegativeNumberTrueFalse ( 100 )) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        printLine("Regards", 5);
    }

    public static boolean compareTwoNumbers ( int a, int b) {
                    return 10 <= ( a + b ) && ( a + b ) <= 20;
    }

    public static void positiveNegativeNumber ( int a) {
      if ( a >= 0 ) {
          System.out.println( "Positive Number");
      } else {
          System.out.println( "Negative Number");
      }
    }

    public static boolean positiveNegativeNumberTrueFalse ( int a ) {
        return a < 0;
    }

    public static void printLine (String myLine, int a) {

    if ( a > 0 ) {
        for (int n = 1; n <= a; n++) {
            System.out.println ( myLine);
        }
    }
}
}

