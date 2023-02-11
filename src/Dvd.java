public class Dvd extends Prodotto{
    String titolo;
    String categoria;
    double peso;
    double prezzo;
    double durata;
    Dvd(String titolo, String categoria,double peso, double prezzo, double durata){
        this.titolo = titolo;
        this.categoria = categoria;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    public double getDurata() {
        return durata;
    }
}
