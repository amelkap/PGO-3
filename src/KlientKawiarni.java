import java.util.Objects;

public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email){
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getImieINazwisko(){
        return this.imie + " " + this.nazwisko;
    }
    public int getIdKlienta() {
        return idKlienta;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString(){
        return "KlientKawiarni { " +
                "idKlienta= " + idKlienta +
                ", imie= " + imie + '\'' +
                ", nazwisko= " + nazwisko + '\'' +
                ", email= " + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        KlientKawiarni that = (KlientKawiarni) o;
        return idKlienta == that.idKlienta;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(idKlienta);
    }
}
