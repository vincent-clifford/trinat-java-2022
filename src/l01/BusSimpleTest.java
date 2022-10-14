package l01;

public class BusSimpleTest {
    public static void main(String[] args) {
        BusSimple linie4 = new BusSimple("Ford",50000, 1000, 1989);
        BusSimple meinBus = new BusSimple("MAN", 20000, 500, 1901);

        linie4.oelwechsel();
        meinBus.oelwechsel();

    }
}
