package com.company;

public class Main {
    public static void main(String[] args) {


        int firstPatternNumber = 1;
        int secondPatternNumber = 0;

//outer loop for number of lines

        for (int lineNumber=1; lineNumber<=4;lineNumber++) {

//loop for blanks

            for(int blank=1; blank<lineNumber ; blank++){
                System.out.print(" ");
            }

//Inner loop for printing 1st Pattern

            for(int x=1;x<6-lineNumber;x++){
                System.out.print(firstPatternNumber++ + "*");
            }

//Switch cases to change Second pattern's Starting Number
            switch (lineNumber) {
                case 1 -> secondPatternNumber = 17;
                case 2 -> secondPatternNumber = 14;
                case 3 -> secondPatternNumber = 12;
                case 4 -> secondPatternNumber = 11;
            }

//Inner loop for printing 2nd Pattern

            for(int y=1; y<6-lineNumber ; y++){

//Condition to avoid two stars in every line.
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