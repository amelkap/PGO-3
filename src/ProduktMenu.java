import java.util.Objects;

public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow = 0;


    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }

    public double getCena(){
        return cena;
    }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "kod=" + kod +
                ", nazwa=" + nazwa + '\'' +
                ", cena=" + cena + '\'' +
                ", kategoria=" + kategoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProduktMenu that = (ProduktMenu) o;
        return Objects.equals(kod, that.kod);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(kod);
    }
}