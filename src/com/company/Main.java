package com.company;

public class Main {
    public static void main(String[] args) throws Exception {

        // write your code here
        int x = 1;
        for (int i=1; i<=4;i++) {                                                   //outer loop for number of line

            for(int blank=1; blank<i ; blank++){                                    //loop for blanks
                System.out.print(" ");
            }

            for(int k=1;k<6-i;k++){                                                 //inner loop for printing numbers

                System.out.print(x++ + "*");
            }
            System.out.println();
        }
    }
}