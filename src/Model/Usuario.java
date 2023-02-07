package Model;

public abstract class Usuario {

    private int codigo;
    private String nombres;
    private String apellidos;
    private int dni;
    private String correo;
    private int celular;
    private String contrasena;
    private int usuarioTipoId;

    public Usuario() {
    }

    public Usuario(int codigo, String nombres, String apellidos, int dni, String correo, int celular, String contrasena, int usuarioTipoId) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
        this.celular = celular;
        this.contrasena = contrasena;
        this.usuarioTipoId = usuarioTipoId;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getUsuarioTipoId() {
        return usuarioTipoId;
    }

    public void setUsuarioTipoId(int usuarioTipoId) {
        this.usuarioTipoId = usuarioTipoId;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
