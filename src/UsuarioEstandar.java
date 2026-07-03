public class UsuarioEstandar extends CuentaUsuario {
    public UsuarioEstandar(String correo, int meseActivo) {
        super(correo, meseActivo, new PlanEstandar());
    }
}
