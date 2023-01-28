package Model;

public class SalaCine {

    private int numero_sala;
    private int numero_butacas;

    public SalaCine() {
    }

    public SalaCine(int numero_sala, int numero_butacas) {
        this.numero_sala = numero_sala;
        this.numero_butacas = numero_butacas;
    }

    public int getNumero_sala() {
        return numero_sala;
    }

    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }

    public int getNumero_butacas() {
        return numero_butacas;
    }

    public void setNumero_butacas(int numero_butacas) {
        this.numero_butacas = numero_butacas;
    }

}
