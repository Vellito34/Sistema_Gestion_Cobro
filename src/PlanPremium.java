public class PlanPremium implements PlanSuscripcion{

    @Override
    public double calcularCosto(int meses) {
        return ((meses * 14.00) + 3.00);
    }
}