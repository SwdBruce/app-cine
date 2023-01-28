package Model;

public class Butacas {

    private int codigo_butaca;
    private int estado;

    public Butacas() {
    }

    public Butacas(int codigo_butaca, int estado) {
        this.codigo_butaca = codigo_butaca;
        this.estado = estado;
    }

    public int getCodigo_butaca() {
        return codigo_butaca;
    }

    public void setCodigo_butaca(int codigo_butaca) {
        this.codigo_butaca = codigo_butaca;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    /* METODOS */
    public void pagarBoletos() {
        /* .. */
    }

    public void verPeliculas() {
        /* .. */
    }

}
