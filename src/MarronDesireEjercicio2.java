// By Desiré Marrón Carmona 👩🏻

import java.sql.SQLOutput;
import java.util.Scanner;

public class MarronDesireEjercicio2 {
    public static void main(String[] args) {

        // Variables

        // CONST
        final int BOARD_SIZE = 8;
        final int MIN_SIZE = 1;
        final int MAX_SIZE = 15;
        final int SEPARATOR = 16;
        final int EXTRA_CHARS_PER_ROW = 8;

        // User provided
        char pattern;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide your desired pattern. It must contain only 1 character. You can use a number, a symbol, a letter...");

        pattern = scan.next().charAt(0);
        System.out.println(pattern);

        System.out.println("Provide a desired size for each pattern spot on the board. It must be a value between 1 and 15, both included.");
        size = scan.nextInt();

        System.out.println(size);

        for (int i = 1; i < BOARD_SIZE+1; i++) {

            // Upper decoration row
            //System.out.print("\nstart row: " + i + "\n");

            for (int j = 0; j < (BOARD_SIZE * size) + 9; j++) {
                System.out.print("-");
            }
            System.out.println("");

            for (int h = 0; h < size; h++) { // Paint rows depending on given size
                // Inner row with spots

                for (int k = 1; k < BOARD_SIZE+1; k++) {
                    // Paint pattern depending if cell is even or not
                    if((k%2) == 0){
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
                    if(k+1 >= BOARD_SIZE+1){
                        System.out.print("|");
                    }
                }

                // Spacing each row
                if((h+1) != size){
                    System.out.println("");
                }
            }

            System.out.println("");

            if((i+1) >= BOARD_SIZE+1){
                for (int j = 0; j < (BOARD_SIZE * size) + 9; j++) {
                    System.out.print("-");
                }
            }


        }

        /*
        for (int i = 0; i < BOARD_SIZE; i++) {

            System.out.println("");

            for (int l = 0; l < (BOARD_SIZE * size) + 8; l++) {
                System.out.print("-");
            }
            System.out.println("");

            // Bucle que pinta casillas del tablero
            for (int j = 0; j < (BOARD_SIZE * size) + 8; j++) {

                System.out.print("|");

                // Printea el pattern dependiendo de si es casilla par o impar
                for (int k = 0; k < size; k++) {

                    if(((j+1)%2) == 0){ // Comprueba si es casilla par o impar
                        System.out.print(pattern);
                    } else {
                        System.out.print(" ");
                    }

                }

                if(((j+1) % 8) == 0){
                    System.out.print("|");
                    System.out.println("");
                }

            }
            if(i + 1 >= BOARD_SIZE){
                for (int j = 0; j < (BOARD_SIZE * size) + 8; j++) {
                    System.out.print("-");
                }
            }
        }
        */
    }
}