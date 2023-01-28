package Model;

import java.util.Date;

public class Boleta extends Venta {

    private int numero_boleta;

    public Boleta() {
        super();
    }

    public Boleta(int codigo, int boletos_cantidad, String pelicula_nombre, double monto_total, int codigo_cliente, String metodo_pago, Date fecha, int numero_boleta) {
        super(codigo, boletos_cantidad, pelicula_nombre, monto_total, codigo_cliente, metodo_pago, fecha);
        this.numero_boleta = numero_boleta;
    }

    public int getNumero_boleta() {
        return numero_boleta;
    }

    public void setNumero_boleta(int numero_boleta) {
        this.numero_boleta = numero_boleta;
    }

    @Override
    public String guardarVenta() {
        return "Respuesta: Se registro la venta exitosamente: " + this.getNumero_boleta();
    }
}
