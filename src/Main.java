import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Learn your squares and cubes!!");

        int userNum;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        userNum = scan.nextInt();


        //String answer = "";

        System.out.println("Number\t\t" + "Squared\t\t" + "Cubed");

        System.out.println("=======\t\t" + "=======\t\t" + "=======");

        for (int i = 1; i<= userNum; i++)
        {
            int squareNum = i * i;
            int cubeNum = i * i * i;

            System.out.println(i + "\t\t\t\t"+ squareNum + "\t\t\t\t" + cubeNum);
        }

//        //do {
//            squareNum = userNum * userNum;
//            cubeNum = userNum * userNum * userNum;
//
//            System.out.println(userNum + "\t\t\t\t" + squareNum + "\t\t\t" + cubeNum);
//
//            System.out.println("Wanna learn more? (y/n): " + answer);
//            answer = scan.nextLine();
//        }
//        while (answer.equals("y"));
    }
}
