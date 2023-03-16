package Uebung6Strings.Bsp2CSVTeilen;

import java.util.Arrays;

public class CSVDemo {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser("spalte1,spalte2,spalte3");
        System.out.println(csvParser.countComma());
        System.out.println(Arrays.toString(csvParser.parse()));
    }
}
