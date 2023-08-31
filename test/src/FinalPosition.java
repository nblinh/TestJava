import java.util.*;
import java.io.*;
import java.math.*;

public class FinalPosition {

    public static void main(String args[]) {
        final int[] portailA = new int[]{1, 1};
        final int[] portailB = new int[]{2, 3};
        int[] result = computeFinalPosition(5, 4, new int[]{0, 0}, portailA, portailB, "DRR");
        System.out.println("(" + result[0] + "," + result[1] + ")");
    }

    public static int[] computeFinalPosition(int width, int height, int[] position, int[] portalA, int[] portalB, String moves) {
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U' && position[1] > 0) {
                position[1]--;
            } else if (moves.charAt(i) == 'D' && position[1] < height) {
                position[1]++;
            } else if (moves.charAt(i) == 'L' && position[0] > 0) {
                position[0]--;
            } else if (moves.charAt(i) == 'R' && position[0] < width) {
                position[0]++;
            }
            position = checkPortailAndJump(position, portalA, portalB);
            System.out.println("(" + position[0] + "," + position[1] + ")");
        }
        return position;
    }

    public static int[] checkPortailAndJump(int[] position, int[] portalA, int[] portalB) {
        if (position[0] == portalA[0] && position[1] == portalA[1]) {
            position[0] = portalB[0];
            position[1] = portalB[1];
        } else if (position[0] == portalB[0] && position[1] == portalB[1]) {
            position[0] = portalA[0];
            position[1] = portalA[1];
        }
        return position;
    }
}
