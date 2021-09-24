package Lesson03.online;

public class HomeWorkApp03 {

    public static void main(String[] arg) {

// Задача 1

        System.out.println("***** Задача 1 *****");

            int[] myBlockIntegerChange = new int[10];
            myBlockIntegerChange[0] = 1;
            myBlockIntegerChange[1] = 1;
            myBlockIntegerChange[2] = 0;
            myBlockIntegerChange[3] = 0;
            myBlockIntegerChange[4] = 1;
            myBlockIntegerChange[5] = 0;
            myBlockIntegerChange[6] = 1;
            myBlockIntegerChange[7] = 1;
            myBlockIntegerChange[8] = 0;
            myBlockIntegerChange[9] = 0;

            for (int i = 0; i < myBlockIntegerChange.length; i++) {
                System.out.print(myBlockIntegerChange[i]+" ");
            }
            System.out.println();

            for (int i = 0; i < myBlockIntegerChange.length; i++) {
                if (myBlockIntegerChange[i] ==1) {
                   myBlockIntegerChange[i] = 0;
                } else {
                    myBlockIntegerChange[i] = 1;
                }
                System.out.print(myBlockIntegerChange[i] + " ");
            }

// Задача 2

        System.out.println();
        System.out.println("***** Задача 2 *****");

         int[] myBlockInteger100 = new int[100];
         for (int i = 0; i < myBlockInteger100.length; i++) {
             myBlockInteger100[i] = i+1;
             System.out.print(myBlockInteger100[i] + " ");
          }

// Задача 3

        System.out.println();
        System.out.println("***** Задача 3 *****");

        int[] myBlockIntegerMultiplyOn2 = new int[12];
            myBlockIntegerMultiplyOn2[0] = 1;
            myBlockIntegerMultiplyOn2[1] = 5;
            myBlockIntegerMultiplyOn2[2] = 3;
            myBlockIntegerMultiplyOn2[3] = 2;
            myBlockIntegerMultiplyOn2[4] = 11;
            myBlockIntegerMultiplyOn2[5] = 4;
            myBlockIntegerMultiplyOn2[6] = 5;
            myBlockIntegerMultiplyOn2[7] = 2;
            myBlockIntegerMultiplyOn2[8] = 4;
            myBlockIntegerMultiplyOn2[9] = 8;
            myBlockIntegerMultiplyOn2[10] = 9;
            myBlockIntegerMultiplyOn2[11] = 1;

        for (int i = 0; i < myBlockIntegerMultiplyOn2.length; i++) {
                    System.out.print(myBlockIntegerMultiplyOn2[i]+" ");
                }
        System.out.println();

        for (int i = 0; i < myBlockIntegerMultiplyOn2.length; i++) {
                   if (myBlockIntegerMultiplyOn2[i] < 6 ) {
                      myBlockIntegerMultiplyOn2[i] = myBlockIntegerMultiplyOn2[i]*2;
                   }
                   System.out.print(myBlockIntegerMultiplyOn2[i] + " ");
               }

// Задача 4

        System.out.println();
        System.out.println("***** Задача 4 *****");

         int n = 9;

         int[][] myMatrixInteger = new int[n][n];
            for (int i = 0; i < myMatrixInteger.length; i++) {
            for (int j = 0; j < myMatrixInteger.length; j++) {
                if (i == j || j == (myMatrixInteger.length - 1 ) - i ) {
                    myMatrixInteger[i][j] = 1;
                } else  {
                    myMatrixInteger[i][j] = 0;
                }
                System.out.print("a[ " + i + ", "+ j +" ] = " + myMatrixInteger[i][j] + "  ");
            }
            System.out.println();
        }
// Задача 5

        System.out.println();
        System.out.println("***** Задача 5 *****");

        oneBlock (25, 16);

// Задача 6

        System.out.println();
        System.out.println("***** Задача 6 *****");

        int[] myMaxMinInBlock = new int[10];

        myMaxMinInBlock[0]=10;
        myMaxMinInBlock[1]=26;
        myMaxMinInBlock[2]=37;
        myMaxMinInBlock[3]=14;
        myMaxMinInBlock[4]=7;
        myMaxMinInBlock[5]=64;
        myMaxMinInBlock[6]=96;
        myMaxMinInBlock[7]=53;
        myMaxMinInBlock[8]=49;
        myMaxMinInBlock[9]=73;
        for (int i = 0; i < myMaxMinInBlock.length; i++) {
                        System.out.print(myMaxMinInBlock[i]+" ");
                    }
            System.out.println();

        int max = myMaxMinInBlock[0];
        for (int i = 0; i < myMaxMinInBlock.length; i++) {

            if (max <= myMaxMinInBlock[i]) {
                max = myMaxMinInBlock[i];
            }
        }
                System.out.println("MAX of BLOCK = " + max);

        int min = myMaxMinInBlock[0];
        for (int i = 0; i < myMaxMinInBlock.length; i++) {

            if (min >= myMaxMinInBlock[i]) {
                min = myMaxMinInBlock[i];
            }
        }
        System.out.println("MIN of BLOCK = " + min);


    }

    public static void oneBlock (int len, int initialValue) {
        int[] Block = new int[len];
        for (int i = 0; i < Block.length; i++) {
            Block[i] = initialValue;
            System.out.print(Block[i] + " ");

        }
    }

}

