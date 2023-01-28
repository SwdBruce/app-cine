package Model;

public class VentaDetalle {

    private int codigo_detalle;
    private int codigo_butaca;
    private String tipo_descuento;
    private double monto_unitario;

    public VentaDetalle() {
    }

    public VentaDetalle(int codigo_detalle, int codigo_butaca, String tipo_descuento, double monto_unitario) {
        this.codigo_detalle = codigo_detalle;
        this.codigo_butaca = codigo_butaca;
        this.tipo_descuento = tipo_descuento;
        this.monto_unitario = monto_unitario;
    }

    public int getCodigo_detalle() {
        return codigo_detalle;
    }

    public void setCodigo_detalle(int codigo_detalle) {
        this.codigo_detalle = codigo_detalle;
    }

    public int getCodigo_butaca() {
        return codigo_butaca;
    }

    public void setCodigo_butaca(int codigo_butaca) {
        this.codigo_butaca = codigo_butaca;
    }

    public String getTipo_descuento() {
        return tipo_descuento;
    }

    public void setTipo_descuento(String tipo_descuento) {
        this.tipo_descuento = tipo_descuento;
    }

    public double getMonto_unitario() {
        return monto_unitario;
    }

    public void setMonto_unitario(double monto_unitario) {
        this.monto_unitario = monto_unitario;
    }

    /* METODOS */
    public void verDetalle() {
        /* .. */
    }
}
