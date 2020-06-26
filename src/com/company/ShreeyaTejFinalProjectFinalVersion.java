/* Shreeya Madhavanur
1. Import java.io
2. Import java.util*
3. Create new file object w file path
4. Create Scanner ScanUser
5. Declare int variables score and times and initialize as 0
6. Declare boolean variable flag and define as false
7. Define string Next, NextInt, and NextDouble and initialize
8. Insert methods for welcome screen
    a. Insert horizontal border method for welcome screen
    b. Insert TopHalf method for welcome screen
    c. Print “|     Welcome!     |”
    d. Insert BottomHalf method for welcome screen
    e. Insert horizontal border method for welcome screen
9. Create do while loop with while being flag == true
    a. Define flag as true at the beginning
    b. Create new Scanner called scanFile which scans the file
    c. Ask the user if they want to guess words, integers, or doubles
    d. Initialize string Category and define it as the user response
    e. If Category contains or then ask the user to guess peoples names
        1. Initialize string Answer and define it as the user response
        2. While loop with while being as long as the file has a next
            a. Define Next as scanFile.next
            b. If Next contains the answer,
                1. call right answer method with (score, times)
                2. Score ++
                3. Times++
                4. Break
            c. If Next does not contain answer,
                1. Call wrong answer method with (score, times)
                2. Times++
        3. Define flag from return method equal to loop method with (scanUser, flag, score, times)
    f. Else if Category contains nt then ask the user to guess an integer between 0 and 1000
        1. Initialize AnswerInt and define it as the user response
        2. While loop with while being as long as the file has a next
            a. Define NextInt as scanFile.next
            b. If NextInt equals the answerInt,
                1. call right answer method with (score, times)
                2. Score ++
                3. Times++
                4. Break
            c. If NextInt does not equal answerInt,
                1. Call wrong answer method with (score, times)
                2. Times++
        3. Define flag from return method equal to loop method with (scanUser, flag, score, times)
10. Else if Category contains ou then ask the user to guess a double between 0 and 1000
        a. Initialize AnswerDouble and define it as the user response
        b. While loop with while being as long as the file has a next
            1. Define NextDouble as scanFile.next
            2. If NextDouble equals the answerDouble,
                a. call right answer method with (score, times)
                b. Score ++
                c. Times++
                d. Break
            3. If NextDouble does not equal answerDouble,
                a. Call wrong answer method with (score, times)
                b. Times++
        c. Define flag from return method equal to loop method with (scanUser, flag, score, times)
11. Else
        a. Define flag as false
        b. Print thats not an option try again
12. Close do while loop
13. Close main
14. Create new void method RightAnswer with (int score, int times)
    a. Score++
    b. Times++
    c. Print you are correct and give score and rounds won out of total rounds
15. Create new void method WrongAnswer with (int score, int times)
    a. Times++
    b. Print you are wrong and give score and rounds won out of total rounds
16. Create new boolean method called loop with (Scanner scanUser, boolean flag, int score, int times)
    a. Ask user if they want to keep going
        1. Define string YesNo as the answer
        2. If YesNo contains an e
            a. Define flag as true
            b. Return flag
        3. Else
            a. Print thanks for playing and final score and final rounds won out of total rounds played
            b. Define flag as false
            c. Return flag
17. Create new void method for the horizontal border of the welcome
    a. Print a #
    b. Make a for loop for the equals
    c. Println a #
18. Create a new void method for the TopHalf of the welcome
    a. Create a for loop for the left most | column
    b. Create a for loop for the spaces on the left side of the center
    c. Print <>
    d. Create a for loop for the dots
    e. Print <>
    f. Create a for loop for the spaces on the right side of the center
    g. Create a for loop for the right most | column
19. Create a new void method for the BottomHalf of the welcome (basically make it inverse of TopHalf)
    a. Create a for loop for the left most | column
    b. Create a for loop for the spaces on the left side of the center
    c. Print <>
    d. Create a for loop for the dots
    e. Print <>
    f. Create a for loop for the spaces on the right side of the center
    g. Create a for loop for the right most | column






 */

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class ShreeyaTejFinalProjectFinalVersion {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\shree\\IdeaProjects\\Summer2020Shreeya\\src\\com\\company\\ShreeyaTejFinalProjectTokens");
        //Scanner scanFile = new Scanner(file); is defined later in the loop where it works better
        Scanner scanUser = new Scanner(System.in);
        int score = 0;
        int times = 0;
        boolean flag = false;
        String Next = "";
        String NextInt = "";
        String NextDouble = "";
        HorizontalBorder();
        TopHalf();
        System.out.println("|    Welcome!    |");
        BottomHalf();
        HorizontalBorder();

        do {
            flag = true;
            Scanner scanFile = new Scanner(file);
            System.out.println("Do you want to guess words, integers, or doubles?");
            String Category = scanUser.next();
            if (Category.contains("or")) {
                System.out.println("Try to guess people's names that I'm thinking of!");
                String Answer = "";
                Answer = scanUser.next();
                while (scanFile.hasNext()) {

                    Next = scanFile.next();
                    if (Next.contains(Answer)) {
                        RightAnswer(score, times);
                        score++;
                        times++;
                        break;
                    }

                }
                if (!Next.contains(Answer)) {

                    WrongAnswer(score, times);
                    times++;
                }

                flag = loop(scanUser, flag, score, times);

            } else if (Category.contains("nt")) {
                System.out.println("try to guess an integer from 9 - 1000!");
                String AnswerInt = scanUser.next();
                while (scanFile.hasNext()) {
                    if (scanFile.hasNext()) {
                        NextInt = scanFile.next();

                        if (NextInt.equals(AnswerInt)) {
                            RightAnswer(score, times);
                            score++;
                            times++;
                            break;
                        }
                    }

                }
                if (!(NextInt.equals(AnswerInt))) {

                    WrongAnswer(score, times);
                    times++;
                }

                flag = loop(scanUser, flag, score, times);

            } else if (Category.contains("ou")) {
                System.out.println("Hardest level: try to guess a double to the nearest tenth between 0 and 1000!");
                String AnswerDouble = "";
                while (scanFile.hasNext()) {
                    AnswerDouble = scanUser.next();
                    System.out.println("Double is " + AnswerDouble);
                    //AnswerDouble = (((int) (AnswerDouble * 10)) / 10.0);
                    while (scanFile.hasNext()) {

                        NextDouble = scanFile.next();
                        if (NextDouble.equals(AnswerDouble)) {
                            RightAnswer(score, times);
                            score++;
                            times++;
                            break;
                        }
                    }
                }
                if (!(NextDouble.equals(AnswerDouble))) {

                    WrongAnswer(score, times);
                    times++;
                }

                flag = loop(scanUser, flag, score, times);

            } else {
                flag = false;
                System.out.println("That's not an option. Try again");
            }

        }

        while (flag == true);

    }

    public static void RightAnswer(int score, int times) {
        score++;
        times++;
        System.out.println("You are correct! Your score is now: " + score + " and you've won " + score + " out of " + times + " of your rounds. ");
    }

    public static void WrongAnswer(int score, int times) {
        times++;
        System.out.println("You are Wrong. Your score is: " + score + " and you've won " + score + " out of " + times + " of your rounds.");
    }

    public static boolean loop(Scanner scanUser, boolean flag, int score, int times) {
        System.out.println("Do you want to keep going?");
        String YesNo = scanUser.next();
        if (YesNo.contains("e")) {
            flag = true;
            return flag;
        } else {
            System.out.println("Thanks for playing! Your final score is: " + score + " and you've won " + score + " out of " + times + " of your rounds.");
            flag = false;
            return flag;
        }

    }
//This is the Horizontal border for the image
    public static void HorizontalBorder() {
        System.out.print("#");
        for (int border = 1; border <= 16; border++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    //This is the for loops for the Top Half Method
    public static void TopHalf() {
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            for (int space = 1; space <= -2 * line + 8; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= 4 * line - 4; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= -2 * line + 8; space++) {

                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    //This is the for loops for the bottom half method
    public static void BottomHalf() {
        for (int line = 1; line < 5; line++) {
            System.out.print("|");
            for (int space = 1; space <= 2 * line - 2; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= -4 * line + 16; dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= 2 * line - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }


    }
}



