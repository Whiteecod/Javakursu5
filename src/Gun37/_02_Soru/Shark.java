package Gun37._02_Soru;

public class Shark implements ISailing, Animal {
    @Override
    public String food() {
        return "Okyanuzda ne varsa yer :D";
    }

    @Override
    public String yuzmek() {
        return "Yüzgeçleri ile hızlı bir şekilde yüzer";
    }
}
