package Gun37._02_Soru;

public class Duck implements ISailing, Animal{
    @Override
    public String food() {
        return "ne bilim ne yer";
    }

    @Override
    public String yuzmek() {
        return "Ördek de yüzebilir";
    }
}
