package Uebung10Uebungsbeispiel1komplett.bsp1Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        
        int[] numberArray = { 1, 5, 5, 6, 7, 7, 5, 8};
        System.out.println(isSortedArray(numberArray));


        removeDuplicates(numberArray);
        print(numberArray);

    }
    public static boolean isSortedArray(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i +1]){
                return false;
            }
        }
        return true;
    }

    // i = 0 ;;    j = 1            lenght = 7   -1=   6
    public static int[] removeDuplicates(int[] numbers){
        for (int i = 0; i < numbers.length -1 ; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]){
                    numbers[j] = -1;
                }
            }
        }
        return numbers;
    }

    public static void print (int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
