package Model;

import java.util.Date;

public abstract class Venta {

    private int codigo;
    private int boletos_cantidad;
    private String pelicula_nombre;
    private double monto_total;
    private int codigo_cliente;
    private String metodo_pago;
    private Date fecha;

    public Venta() {
    }

    public Venta(int codigo, int boletos_cantidad, String pelicula_nombre, double monto_total, int codigo_cliente, String metodo_pago, Date fecha) {
        this.codigo = codigo;
        this.boletos_cantidad = boletos_cantidad;
        this.pelicula_nombre = pelicula_nombre;
        this.monto_total = monto_total;
        this.codigo_cliente = codigo_cliente;
        this.metodo_pago = metodo_pago;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getBoletos_cantidad() {
        return boletos_cantidad;
    }

    public void setBoletos_cantidad(int boletos_cantidad) {
        this.boletos_cantidad = boletos_cantidad;
    }

    public String getPelicula_nombre() {
        return pelicula_nombre;
    }

    public void setPelicula_nombre(String pelicula_nombre) {
        this.pelicula_nombre = pelicula_nombre;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /* METODOS  */
    public void seleccionarButacas() {
        /* .. */
    }

    public abstract String guardarVenta();
}
