public class RacchettaPadel extends Prodotto{
    String marca;
    double peso;
    double prezzo;
    String tipo;

    RacchettaPadel(String marca, double peso, double prezzo, String tipo){
        this.marca = marca;
        this.peso = peso;
        this.prezzo = prezzo;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    @Override

    public double getPeso() {
        return peso;
    }

    public double getPrezzo() {
        return prezzo;
    }

}
