package Model;

public class Cliente extends Usuario {

    private String tarjeta;

    public Cliente() {
        super();
    }

    public Cliente(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Cliente(int codigo, String nombres, String apellidos, int dni, String correo, int celular, String contraseña, int usuarioTipoId, String tarjeta) {
        super(codigo, nombres, apellidos, dni, correo, celular, contraseña, usuarioTipoId);
        this.tarjeta = tarjeta;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
}
