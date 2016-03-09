import java.util.Arrays;
import java.util.Scanner;

public class Logicator {


    public static void main(String[] args) {
        int[][] list = {
                //OR
                {0, 1, 1},
                //AND
                {0, 0, 1},
                //NAND
                {1, 1, 0},
                //NOR
                {1, 0, 0},
                //XOR
                {0, 1, 0},
                //XNOR
                {1, 0, 1},
        };
        Scanner input = new Scanner(System.in);
        System.out.println("CYOURCE/BARRIER-BREAKER\nThis is a program I made to solve 2-way logic gates out of boredom");
        while (true) {
            String[] types = {"Or", "And", "NAnd", "NOr", "XOr", "XNOr"};
            System.out.println("---------------------\nENTER LOGIC GATE TYPE " + Arrays.toString(types));

            String s = input.next();
            if (s.equalsIgnoreCase("NOT")) {

            }
            if (s.equalsIgnoreCase(types[0])) {
                call(list, 0, input);
            } else if (s.equalsIgnoreCase(types[1])) {
                call(list, 1, input);
            } else if (s.equalsIgnoreCase(types[2])) {
                call(list, 2, input);
            } else if (s.equalsIgnoreCase(types[3])) {
                call(list, 3, input);
            } else if (s.equalsIgnoreCase(types[4])) {
                call(list, 4, input);
            } else if (s.equalsIgnoreCase(types[5])) {
                call(list, 5, input);
            }

        }
    }

    public static void call(int[][] list, int c, Scanner input) {
        System.out.println("ENTER INPUT 1");
        int bool = input.nextInt();
        System.out.println("ENTER INPUT 2");
        int bool2 = input.nextInt();
        if (bool == 0 && bool2 == 0) {
            System.out.println(list[c][0]);
        } else if (bool == 0 && bool2 == 1 || bool == 1 && bool2 == 0) {
            System.out.println(list[c][1]);
        } else if (bool == 1 && bool2 == 1) {
            System.out.println(list[c][2]);
        } else {
            System.out.println("PLEASE ENTER 0/1 AS INPUTS");
        }
    }
}
