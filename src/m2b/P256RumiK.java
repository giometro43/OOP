package m2b;
/**@author Giovanni Castillo AIT502-11
Module: Arrays
Assignment: M2B-21
Program: 256 Rumi-K
*/
/** REQUIREMENTS:
 * Create a representation for the tiles in the Rumi-K game.
 * Pick a random tile.
 * Represent a new deck of tiles.
 * Shuffle the deck.
 * Print a deck.
 * Deal 4 hands of 14 tiles.
 */

public class P256RumiK {
    public static void main(String[] args) {
        System.out.println("Rumi-K by Giovanni Castillo on 09/08/2025");
        //uses program structure and comments to divide up tasks like in P255. 
        
        
        final String[] COLOR = { "Red", "Blue", "Black", "Orange" };
        final int[] NUMBER = { 1,2,3,4,5,6,7,8,9,10,11,12,13 };
        // Arrays to store color and number for each tile
        int[] tileColor = new int[104];
        int[] tileNumber = new int[104];
        int index = 0;
        // Fill the arrays with all tile combinations (2 sets)
        for (int set = 0; set < 2; set++) {
            for (int c = 0; c < 4; c++) {
                for (int n = 0; n < 13; n++) {
                    tileColor[index] = c;
                    tileNumber[index] = n;
                    index++;
                }
            }
        }
        // pick a random tile
        // pick a random index and show the tile at that spot
        int randIndex = (int)(Math.random() * 104);
        System.out.printf("A random tile is %d of %s\n", NUMBER[tileNumber[randIndex]], COLOR[tileColor[randIndex]]);
        // shuffle the deck
        // randomly swap tiles many times to mix up the deck
        for (int k = 0; k < 500; k++) {
            int i = (int)(Math.random() * 104);
            int j = (int)(Math.random() * 104);
            int tempColor = tileColor[i];
            tileColor[i] = tileColor[j];
            tileColor[j] = tempColor;
            int tempNumber = tileNumber[i];
            tileNumber[i] = tileNumber[j];
            tileNumber[j] = tempNumber;
        }
        // print the deck
        // prints all the tiles in the deck, 8 per line
        System.out.println("The deck is:");
        for (int k = 0; k < 104; k++) {
            System.out.printf("%d of %s", NUMBER[tileNumber[k]], COLOR[tileColor[k]]);
            if ((k + 1) % 8 == 0) {
                System.out.println(":");
            } else {
                System.out.print(": ");
            }
        }
        // deal 4 hands of 14 tiles
        // gives each player 14 tiles from the top of the deck
        int currentTile = 0;
        for (int player = 1; player <= 4; player++) {
            System.out.printf("Player %d: ", player);
            for (int t = 1; t <= 14; t++) {
                System.out.printf("%d of %s", NUMBER[tileNumber[currentTile]], COLOR[tileColor[currentTile]]);
                if (t < 14) System.out.print(": ");
                currentTile++;
            }
            System.out.println();
        }
    }
}