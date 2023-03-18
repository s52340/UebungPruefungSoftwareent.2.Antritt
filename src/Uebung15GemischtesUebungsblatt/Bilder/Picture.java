package Uebung15GemischtesUebungsblatt.Bilder;

public class Picture {

   private int length;
   private int width;


    public Picture(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int totalPixels(){
        int gesammtzahlPixels = length * width;
        return gesammtzahlPixels;
    }

    public int totalSize(int bytePerPixel){
        int gesammterSpeicherplatz= totalPixels() * bytePerPixel;
        return gesammterSpeicherplatz;
    }

    public void scale(double factor){
        width = (int) (width * factor);
        length = (int) (length * factor);
    }

}
