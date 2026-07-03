public class UsuarioBasico extends CuentaUsuario {
    private PlanBasico planBasico;
    public UsuarioBasico(String correo, int meseActivo) {
        super(correo, meseActivo,new PlanBasico() );
    }
}
