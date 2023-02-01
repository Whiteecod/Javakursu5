package Gun29._03_Protected.Bir;

public class Doctor {
    protected String adi; // default ile aynı
    String bolumu; // default
    private String sicilNo; // private
    public String hastaneAdi; // public

    Doctor() { // default constructor

    }

    public Doctor(String adi) {
        this.adi=adi;
    }
}
