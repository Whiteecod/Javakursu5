package Gun36._04_Interface;

public class A4 implements IGosterir, IYazdirir{
    @Override
    public void goster() {
        System.out.println("Gösterdi");

    }

    @Override
    public void yazdir() {
        System.out.println("Yazdırdı");

    }
}
