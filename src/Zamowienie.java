import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;

    public Zamowienie(KlientKawiarni klient){
        this.numerZamowienia = kolejnyNumer++;
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }

    public int getNumerZamowienia() {
        return numerZamowienia;
    }

    public KlientKawiarni getKlient() {
        return klient;
    }

    public boolean isOplacone() {
        return oplacone;
    }
    @Override
    public String toString(){
        return "Zamowienie { " +
                "numerZamowienia= " + numerZamowienia +
                ", klient= " + klient + '\'' +
                ", produkty= " + produkty + '\'' +
                ", oplacone= " + oplacone + '\'' +
                '}';
    }

    public void dodajProdukt(ProduktMenu produkt){
        this.produkty.add(produkt);
    }
    public double policzWartosc(){
        double suma = 0.0;
        for (ProduktMenu p : produkty) {
            suma += p.getCena();
        }
        return suma;
    }
    public int policzLiczbeProduktow(){
        return produkty.size();
    }
    public void oznaczJakoOplacone(){
        this.oplacone = true;
    }

    public static int pobierzKolejnyNumer(){
        return kolejnyNumer;
    }
}
