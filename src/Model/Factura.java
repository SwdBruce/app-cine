package Model;

import java.util.Date;

public class Factura extends Venta {

    private int numero_factura;
    private int ruc;
    private String serie;
    private double igv;

    public Factura() {
        super();
    }

    public Factura(int codigo, int boletos_cantidad, String pelicula_nombre, double monto_total, int codigo_cliente, String metodo_pago, Date fecha, int numero_factura, int ruc, String serie, double igv) {
        super(codigo, boletos_cantidad, pelicula_nombre, monto_total, codigo_cliente, metodo_pago, fecha);
        this.numero_factura = numero_factura;
        this.ruc = ruc;
        this.serie = serie;
        this.igv = igv;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    @Override
    public String guardarVenta() {
        return "Respuesta: Se registro la venta exitosamente: "
                + this.getNumero_factura()
                + ", con RUC: " + this.getRuc();
    }
}
