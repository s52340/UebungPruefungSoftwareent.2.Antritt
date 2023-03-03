package Hauptklausur1_WS22_23.Recursion;

public class RecursiveMultiplication {
    public static void main(String[] args) {

        System.out.println(multiplicate(5,4));
    }

    //a * b = a + a + a + a = a*b (“a wird b mal zu a addiert”)
    //5 * 4 = 5 + 5 + 5 + 5 = 20.
    public static int multiplicate(int a, int b){       //a = 5  b = 3  -->  15   //
        if (b == 1){
            return a;
        }
        else {
            b= b -1;
         return  multiplicate(a, b) + a;    // 40 //5    10 + 5 = 15
        }
    }

    /*
    public static int multiplicate(int a, int b){    // a = 10  b = 2        //  a = 5  b = 2
        if (b == 1){
            return a;
        }
        else {
            b= b -1;
            return  multiplicate(a, b) + a;  //40   // 5+5 = 10
        }
    }
    public static int multiplicate(int a, int b){   //    a = 20     b = 1       // a = 5   b = 1
        if (b == 1){
            return a;
        }
        else {
            b= b -1;

            return  multiplicate(a, b) + a;  //40
        }
    }
    */
}
