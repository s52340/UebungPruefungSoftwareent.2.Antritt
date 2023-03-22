package Altklausur070122.recursion.palindrom;

import java.util.ArrayList;

public class PalindromChecker {
    public static void main(String[] args) {

    ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);


        System.out.println("Ist ein Palindrom: " + checkPalindrom(arrayList));

    }

    public static boolean checkPalindrom(ArrayList<Integer> numbers){
        boolean palindrom;
        if (numbers.isEmpty() || numbers.size() == 1){
            palindrom = true;
            return palindrom;
        }

        if (numbers.get(0) != numbers.get(numbers.size()-1)){
            palindrom = false;
            return palindrom;
        }
        numbers.remove(0);
        numbers.remove(numbers.size()-1);
        return checkPalindrom(numbers);

    }
}
