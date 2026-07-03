import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc, suscripcion;
        boolean repetir = true;
        String correo;



        do {
            System.out.println("-----------------------------------------------");
            System.out.println("                    NETFLIX                    ");
            System.out.println("-----------------------------------------------");
            System.out.println("1- Registrar Usuario");
            System.out.println("2- Reporte");
            System.out.println("3- Salir");
            System.out.println("-----------------------------------------------");

            try {
                opc = sc.nextInt();
                sc.nextLine();

                switch (opc){
                    case 1:
                        System.out.println("----------------------------------------");
                        System.out.println("Ingresar Correo");
                        correo = sc.next();
                        System.out.println("Elija el plan deseado:");
                        System.out.println("1- Plan Básico: $5.00 USD por mes (Permite 1 pantalla, calidad SD)");
                        System.out.println("2- Plan Estándar: $9.00 USD por mes (Permite 2 pantallas, calidad Full HD)");
                        System.out.println("3- Plan Premium: $14.00 USD por mes + un recargo único de $3.00 USD en la " +
                                "primera factura por habilitar acceso a contenido 4K Ultra HD y audio espacial");
                        suscripcion = sc.nextInt();



                }

            }catch (Exception e) {
                System.out.println("-----------------");
                System.out.println("Opcion invalida");
                System.out.println("-----------------");
                sc.nextLine();

        ]while(repetir);
    }
}