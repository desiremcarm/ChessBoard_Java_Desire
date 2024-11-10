// By Desiré Marrón Carmona 👩🏻

import java.sql.SQLOutput;
import java.util.Scanner;

public class MarronDesireEjercicio2 {
    public static void main(String[] args) {

        // Variables

        // CONST
        final int BOARD_SIZE = 8;
        final int MIN_SIZE = 1;
        final int MAX_SIZE = 16;

        // CONST COLORS
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_WHITE = "\u001B[37m";

        // User provided
        char pattern;
        int size;

        // Control
        boolean paintEvenSpots = true;

        Scanner scan = new Scanner(System.in);

        // Asking for a pattern
        System.out.println(ANSI_BLUE + "Provide your desired pattern. It must contain only 1 character. You can use a number, a symbol, a letter...");

        // Reading pattern
        pattern = scan.next().charAt(0);
        System.out.println("The character you've chosen is: " + pattern);

        // Asking for cell size
        System.out.println("Provide a desired size for each cell on the board. It must be a value between 1 and 15, both included.");

        // Checking if given value is a positive integer between 1 and 15
        do {
            System.out.print(ANSI_RED + "⚠️ Please, use a positive number between 1 and 15\n");
            while(!scan.hasNextInt()){
                System.out.println("⚠️ That value is not valid. Try again");
                scan.next();
            }
            size = scan.nextInt();
        }while((size >= MIN_SIZE && size >= MAX_SIZE) || size <= 0);

        System.out.println(ANSI_BLUE + "The size you've chosen is: " + size);

        // Main loop for the chess board
        for (int i = 1; i < BOARD_SIZE+1; i++) {

            // Upper decoration row
            for (int j = 0; j < (BOARD_SIZE * size) + 9; j++) {
                System.out.print(ANSI_WHITE + "-");
            }

            System.out.println("");

            for (int h = 0; h < size; h++) {

                // Paint rows depending on given size
                // Inner row with spots

                for (int k = 1; k < BOARD_SIZE+1; k++) {

                    // Logic to paint cells with pattern or empty
                    if(paintEvenSpots){
                        if((k+1)%2 == 0){
                            System.out.print("|");
                            for (int l = 0; l < size; l++) {
                                System.out.print(pattern);
                            }
                        } else {
                            System.out.print("|");
                            for (int l = 0; l < size; l++) {
                                System.out.print(" ");
                            }
                        }
                    } else {
                        if((k+1)%2 == 0){
                            System.out.print("|");
                            for (int l = 0; l < size; l++) {
                                System.out.print(" ");
                            }
                        } else {
                            System.out.print("|");
                            for (int l = 0; l < size; l++) {
                                System.out.print(pattern);
                            }
                        }
                    }

                    // Finish the last cell with "|"
                    if(k+1 >= BOARD_SIZE+1){
                        System.out.print("|");
                    }
                }

                // Spacing each row
                if((h+1) != size){
                    System.out.println("");
                }
            }

            // Changing the painting cell bool flag
            if(paintEvenSpots){
                paintEvenSpots = false;
            } else {
                paintEvenSpots = true;
            }

            System.out.println("");

            // End row decoration
            if((i+1) >= BOARD_SIZE+1){
                for (int j = 0; j < (BOARD_SIZE * size) + 9; j++) {
                    System.out.print("-");
                }
            }
        }
    }
}