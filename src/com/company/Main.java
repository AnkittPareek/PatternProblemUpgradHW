package com.company;

public class Main {
    public static void main(String[] args) {

        // write your code here
        int firstPatternNumber = 1;
        int secondPatternNumber = 0;

        for (int lineNumber=1; lineNumber<=4;lineNumber++) {                                                   //outer loop for number of line
            for(int blank=1; blank<lineNumber ; blank++){                                    //loop for blanks
                System.out.print(" ");
            }
            for(int x=1;x<6-lineNumber;x++){                                                 //Inner loop for printing 1st Pattern
                System.out.print(firstPatternNumber++ + "*");
            }
            switch (lineNumber) {
                case 1 -> secondPatternNumber = 17;
                case 2 -> secondPatternNumber = 14;
                case 3 -> secondPatternNumber = 12;
                case 4 -> secondPatternNumber = 11;
            }

            for(int y=1; y<6-lineNumber ; y++){                                              //Inner loop for printing 2nd Pattern
                if(y == 1){
                    System.out.print(secondPatternNumber++);
                }
                else {
                    System.out.print("*" + secondPatternNumber++);
                }
            }
            System.out.println();
        }
    }
}