package Model;

public class Vendedor extends Usuario {

    private String horario;
    private double sueldo;

    public Vendedor() {
        super();
    }

    public Vendedor(String horario, double sueldo, int codigo, String nombres, String apellidos, int dni, String correo, int celular, String contraseña, int usuarioTipoId) {
        super(codigo, nombres, apellidos, dni, correo, celular, contraseña, usuarioTipoId);
        this.horario = horario;
        this.sueldo = sueldo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
