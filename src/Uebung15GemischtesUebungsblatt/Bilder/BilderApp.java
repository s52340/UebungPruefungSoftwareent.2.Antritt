package Uebung15GemischtesUebungsblatt.Bilder;

public class BilderApp {
    public static void main(String[] args) {
        Picture strauss = new Picture(10, 30);

        int totalPixi = strauss.totalPixels();
        System.out.println("totalPixi = " + totalPixi);

        int speicher = strauss.totalSize(20);
        System.out.println("speicher = " + speicher);


        System.out.println("strauss.getLength() = " + strauss.getLength());
        System.out.println("strauss.width = " + strauss.getWidth());
        strauss.scale(2.22);
        System.out.println("strauss.getLength() = " + strauss.getLength());
        System.out.println("strauss.getWidth() = " + strauss.getWidth());

    }
}
