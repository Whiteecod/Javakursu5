package Gun35._02_Polyformphisn;

public class Kopek extends Hayvan{

    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println(" Havladı ");
    }

    public void kokladi() {
        System.out.println(" Kokladi ");
    }
}
