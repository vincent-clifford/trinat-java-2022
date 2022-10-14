package l01;
public class BusSimple {
    String hersteller;
    int wechselintervall;
    int kmGefahren = 0;
    int baujahr;

    public BusSimple(String hersteller, int wechselintervall, int kmGefahren, int baujahr) {
        this.hersteller = hersteller;
        this.wechselintervall = wechselintervall;
        this.kmGefahren = kmGefahren;
        this.baujahr = baujahr;
    }

    void oelwechsel() {
        if (kmGefahren >= wechselintervall) {
            System.out.println("Ölwechsel durchgeführt");
            kmGefahren = 0;
        } else {
            System.out.println("Ölwechsel nicht mehr erforderlich");
        }
    }
}
