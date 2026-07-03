public class UsuarioPremium extends CuentaUsuario {
    public UsuarioPremium(String correo, int meseActivo) {
        super(correo, meseActivo, new PlanPremium());
    }
}
