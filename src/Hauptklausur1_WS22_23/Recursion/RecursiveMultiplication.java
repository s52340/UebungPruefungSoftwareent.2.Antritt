package Hauptklausur1_WS22_23.Recursion;

public class RecursiveMultiplication {
    public static void main(String[] args) {

        System.out.println(multiplicate(5,4));
    }

    //a * b = a + a + a + a = a*b (“a wird b mal zu a addiert”)
    //5 * 4 = 5 + 5 + 5 + 5 = 20.
    public static int multiplicate(int a, int b){
        if (b == 0){
            return a;
        }
        else {
            b= b -1;
            a = a + a;
         return  multiplicate(a, b);
        }
    }
}
