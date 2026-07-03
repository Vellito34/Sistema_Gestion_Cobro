import java.util.Objects;

public abstract class CuentaUsuario {
    private String correo;
    private int meseActivo;
    private PlanSuscripcion tipoPlan;

    public CuentaUsuario(String correo, int meseActivo, PlanSuscripcion tipoPlan) {
        this.correo = correo;
        this.meseActivo = meseActivo;
        this.tipoPlan = tipoPlan;
    }

    public void TotalAPagar(){
        System.out.println(tipoPlan.calcularCosto(this.meseActivo));
    }

    @Override
    public String toString() {
        return "Datos de Usuario" +
                "\nCorreo='" + correo + '\n' +
                "Mese Activo=" + meseActivo +
                "\nPlan: " + tipoPlan +
                "\nTotal a pagar: " + tipoPlan.calcularCosto(this.meseActivo);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getMeseActivo() {
        return meseActivo;
    }

    public void setMeseActivo(int meseActivo) {
        this.meseActivo = meseActivo;
    }

    public PlanSuscripcion getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(PlanSuscripcion tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuentaUsuario that = (CuentaUsuario) o;
        return meseActivo == that.meseActivo && Objects.equals(correo, that.correo) && Objects.equals(tipoPlan, that.tipoPlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correo, meseActivo, tipoPlan);
    }
}
