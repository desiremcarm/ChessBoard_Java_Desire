// By Desiré Marrón Carmona 👩🏻

import java.util.Scanner;

public class MarronDesireEjercicio2 {
    public static void main(String[] args) {

        // Variables

        // CONST
        final int BOARD_SIZE = 8;
        final int MIN_SIZE = 1;
        final int MAX_SIZE = 15;
        final int SEPARATOR = 16;

        // User provided
        char pattern;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide your desired pattern. It must contain only 1 character. You can use a number, a symbol, a letter...");

        pattern = scan.next().charAt(0);
        System.out.println(pattern);

        System.out.println("Provide a desired size for each pattern spot on the board. It must be a value between 1 and 15, both included.");
        size = scan.nextInt();

        int[][] boardSizeAndPattern = new int[size][size];

        System.out.println(size);

        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.println("");
            for (int j = 0; j < (BOARD_SIZE * size) + 9; j++) {
                System.out.print("-");
            }
            System.out.println("");
            //  ---------------
            // [ | | | | | | | ]
            for (int j = 0; j < BOARD_SIZE; j++) {
                // [ # |
                System.out.print("|");
                for (int k = 0; k < size; k++) {
                    if(((j+1)%2) == 0){
                        System.out.print(pattern);
                    } else {
                        System.out.print(" ");
                    }
                }
                if(j + 1 >= BOARD_SIZE){
                    System.out.print("|");
                }
            }
            if(i + 1 >= BOARD_SIZE){
                System.out.println("");
                for (int j = 0; j < (BOARD_SIZE * size) + 9; j++) {
                    System.out.print("-");
                }
            }
        }

    }
}