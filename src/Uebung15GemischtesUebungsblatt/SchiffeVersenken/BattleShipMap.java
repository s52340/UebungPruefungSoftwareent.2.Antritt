package Uebung15GemischtesUebungsblatt.SchiffeVersenken;

import java.util.Arrays;

public class BattleShipMap {

    private int[][] map = {{0, 0, 0, +2, 0, +1, +1, 0, 0, 0},
            {0, +3, -1, +2, 0, 0, 0, +2, 0, 0},
            {0, +3, -1, 0, +4, +4, 0, 0, +2, +2},
            {0, 0, +2, 0, 0, 0, 0, 0, 0, 0},
            {-1, 0, +2, 0, -1, +2, +2, 0, 0, 0}};

    public void print() {
        for (int[] x :
                map) {
            System.out.println(Arrays.toString(x));
        }
    }

    public int totalBattleShipStrength(char player) {
        int strengh = 0;
        if (player == 'A') {
            for (int[] x :
                    map) {
                for (int i = 0; i < x.length; i++) {
                    if (x[i] > 0) {
                        strengh = strengh + x[i];
                    }
                }
            }
        }
        if (player == 'B') {
            for (int[] x :
                    map) {
                for (int i = 0; i < x.length; i++) {
                    if (x[i] < 0) {
                        strengh = strengh - x[i];
                    }
                }
            }
        }
        return strengh;
    }

    public int totalCountBattleShips() {
        int count = 0;
        for (int[] x :
                map) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != 0) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

    public int[] countOfShipsPerLine(){
        int[] shipsPerLine = {0,0,0,0,0};
        int count;
        int zeile = -1;
        for (int[] x : map) {
            zeile += 1;
            count = 0;
            for (int i = 0; i < x.length; i++) {
                if (x[i] != 0){
                    count += 1;
                }
                shipsPerLine[zeile] = count;
            }
        }

        return shipsPerLine;
    }

    public double averageShipStrengthPlayerA(){
        int strengh = 0;
        int count = 0;
        for (int[] x :
                map) {
            for (int y :
                    x) {
                if (y > 0) {
                    strengh += y;
                    count ++;
                }
            }
        }
        double averageStrengh = (strengh*1.0) / count;
        return averageStrengh;
    }

}
