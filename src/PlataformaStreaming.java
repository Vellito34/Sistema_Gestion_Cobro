import java.util.ArrayList;

public class PlataformaStreaming {
    ArrayList<CuentaUsuario> Usuarios = new ArrayList<>();
    public void AgregarUsuario(CuentaUsuario u){
        Usuarios.add(u);
    }

    public void ReporteUsuarios(){
        int ID = 1;
        double Total = 0.0;
        double Basico = 0.0;
        double Estandar = 0.0;
        double Premium = 0.0;
        for (CuentaUsuario cu : Usuarios){
            System.out.println("ID "+ID);
            System.out.println(cu+ "\n");
            if (cu.getTipoPlan() instanceof PlanBasico){
                Basico += cu.getTipoPlan().calcularCosto(cu.getMeseActivo());
            } else if (cu.getTipoPlan() instanceof PlanEstandar) {
                Estandar += cu.getTipoPlan().calcularCosto(cu.getMeseActivo());
            } else if (cu.getTipoPlan() instanceof PlanPremium) {
                Premium += cu.getTipoPlan().calcularCosto(cu.getMeseActivo());
            }
            ID ++;
            Total += cu.getTipoPlan().calcularCosto(cu.getMeseActivo());
        }

        System.out.println("\n" + "Total de dinero optenido: $"+Total);
        System.out.println("\n" + "Dinero optenido del Plan Basico: $"+Basico);
        System.out.println("\n" + "Dinero optenido del Plan Estandar $"+Estandar);
        System.out.println("\n" + "Dinero optenido del Plan Premium: $"+Premium);
    }

}
