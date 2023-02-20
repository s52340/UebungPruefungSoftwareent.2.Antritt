package FolienLV8Recursion.Zahlen0bisN;

public class Zahlen0bisN {
    public static void main(String[] args) {

        formZeroToNIterativ(4);
        System.out.println();
        fromNToZeroIterativ(5);
        System.out.println();
        fromZeroToNRecursive(5);
        System.out.println();
        fromNToZeroRecursive(4);
    }
    public static void fromZeroToNRecursive(int n){
        //Abbruchbestimmung
        if (n < 0){
        return;
        }
        fromZeroToNRecursive(n -1);
        System.out.print(n);
    }
    public static void fromNToZeroRecursive(int n){
    //Abbruchbestimmung
        if(n < 0){
            return;
        }
        System.out.print(n);
        fromNToZeroRecursive(n-1);
    }

    public static void formZeroToNIterativ(int n){
        for (int i = 0; i <= n; i++) {
            System.out.print(i);
        }
    }

    public static void fromNToZeroIterativ(int n){
        for (int i = 0; n >= i; n--) {
            System.out.print(n);
        }
    }
}
