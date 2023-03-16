package Uebung15GemischtesUebungsblatt.SchiffeVersenken;

import java.util.Arrays;

public class DemoSchiffeVersenken {
    public static void main(String[] args) {
        BattleShipMap battleShipMap = new BattleShipMap();
        battleShipMap.print();


        char playerA = 'A';
        char playerB = 'B';
        System.out.println("Flottenstärke PlayerA: " + battleShipMap.totalBattleShipStrength(playerA));
        System.out.println("Flottenstärke PlayerB: " + battleShipMap.totalBattleShipStrength(playerB));
        System.out.println("Gesammtanzahl Schiffe: " + battleShipMap.totalCountBattleShips());
        System.out.println("Schiffe pro Zeile: " + Arrays.toString(battleShipMap.countOfShipsPerLine()));
        System.out.println("Durchschnittliche Stärke von PlayerA: " + battleShipMap.averageShipStrengthPlayerA());

    }
}
