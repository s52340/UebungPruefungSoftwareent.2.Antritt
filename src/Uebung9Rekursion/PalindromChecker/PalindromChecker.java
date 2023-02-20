package Uebung9Rekursion.PalindromChecker;

public class PalindromChecker {
    public static void main(String[] args) {

        System.out.println(check("Erika feuert nur untreue Fakire."));


    }
    //  0 12345 6
    //  R entne r
    public static boolean check(String palindrom){
        palindrom = palindrom.toLowerCase();
        if (palindrom.length() == 0 || palindrom.length() == 1){
            return true;
        }
        if (!Character.isLetter(palindrom.charAt(0))){
            palindrom = palindrom.substring(1);
            return check(palindrom);
        }
        if (!Character.isLetter(palindrom.charAt(palindrom.length()-1))){
            palindrom = palindrom.substring(0, palindrom.length()-1);
            return check(palindrom);
        }
        if (palindrom.charAt(0) == palindrom.charAt(palindrom.length() - 1)) {
            palindrom = palindrom.substring(1, palindrom.length() - 1);
            return check(palindrom);
        }
        if (palindrom.charAt(0) != palindrom.charAt(palindrom.length() - 1)) {
            return false;
        }
      return false;
    }

}
