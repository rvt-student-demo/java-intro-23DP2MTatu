package lv.rvt;

public class CD implements Packable{
    
    private String artist;
    private String cdName;
    private int year;

    public CD(String artist, String cdName, int year) {
        this.artist = artist;
        this.cdName = cdName;
        this.year = year;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + cdName + " (" + year + ")";
    }
}
