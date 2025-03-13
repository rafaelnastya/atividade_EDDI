package situacao_taxi_att_eddi;

public class Viagem {
    private String Nome_taxista;
    private String Destino;
    private int Km_percorrido;
    private double Valor_taximetro;
    
    public Viagem(){
        
    }

    public Viagem(String Nome_taxista, String Destino, int Km_percorrido, double Valor_taximetro) {
        this.Nome_taxista = Nome_taxista;
        this.Destino = Destino;
        this.Km_percorrido = Km_percorrido;
        this.Valor_taximetro = Valor_taximetro;
    }

    public String getNome_taxista() {
        return Nome_taxista;
    }

    public void setNome_taxista(String Nome_taxista) {
        this.Nome_taxista = Nome_taxista;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public Number getKm_percorrido() {
        return Km_percorrido;
    }

    public void setKm_percorrido(int Km_percorrido) {
        this.Km_percorrido = Km_percorrido;
    }

    public double getValor_taximetro() {
        return Valor_taximetro;
    }

    public void setValor_taximetro(double Valor_taximetro) {
        this.Valor_taximetro = Valor_taximetro;
    }

    @Override
    public String toString() {
        return "Viagem{" + "Nome_taxista=" + Nome_taxista + ", Destino=" + Destino + ", Km_percorrido=" + Km_percorrido + ", Valor_taximetro=" + Valor_taximetro + '}';
    }
    
    

}
