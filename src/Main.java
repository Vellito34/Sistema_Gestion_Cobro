import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        CuentaUsuario u1 = new UsuarioBasico("Juanito@gmail.com",3);
        CuentaUsuario u2 = new UsuarioEstandar("Mario@gmail.com",6);
        CuentaUsuario u3 = new UsuarioPremium("Gojo@gmail.com",9);




        Scanner sc = new Scanner(System.in);
        int opc, suscripcion, meses;
        boolean repetir = true;
        String correo;
        PlataformaStreaming plataformaStreaming = new PlataformaStreaming();
        plataformaStreaming.AgregarUsuario(u1);
        plataformaStreaming.AgregarUsuario(u2);
        plataformaStreaming.AgregarUsuario(u3);


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
                        System.out.println("1- Plan Básico: $5.00 USD por mes "+"\nPermite 1 pantalla, calidad SD");
                        System.out.println("\n2- Plan Estándar: $9.00 USD por mes \nPermite 2 pantallas, " +
                                "calidad Full HD");
                        System.out.println("\n3- Plan Premium: $14.00 USD por mes + un recargo único de $3.00 USD en la " +
                                "primera factura \nPermite habilitar acceso a contenido 4K Ultra HD y audio espacial");
                        suscripcion = sc.nextInt();

                        switch (suscripcion){
                            case 1:
                                System.out.println("Ingresar los meses de suscripcion:");
                                meses = sc.nextInt();
                                plataformaStreaming.AgregarUsuario(new UsuarioBasico(correo, meses));
                                break;

                            case 2:
                                System.out.println("Ingresar los meses de suscripcion:");
                                meses = sc.nextInt();
                                plataformaStreaming.AgregarUsuario(new UsuarioEstandar(correo, meses));
                                break;

                            case 3:
                                System.out.println("Ingresar los meses de suscripcion:");
                                meses = sc.nextInt();
                                plataformaStreaming.AgregarUsuario(new UsuarioPremium(correo, meses));
                                break;

                            default:
                                System.out.println("-------------------------------------------");
                                System.out.println("Error: Opcion invalida, intentelo de nuevo");
                                System.out.println("-------------------------------------------");
                                break;
                        }
                        break;

                    case 2:
                        plataformaStreaming.ReporteUsuarios();
                        break;

                    case 3:
                        System.out.println("--------------------");
                        System.out.println("Cerrando sistema");
                        System.out.println("--------------------");
                        repetir = false;
                        break;

                    default:
                        System.out.println("-------------------------------------------");
                        System.out.println("Error: Opcion invalida, intentelo de nuevo");
                        System.out.println("-------------------------------------------");
                        break;

                }

            }catch (Exception e) {
                System.out.println("-----------------");
                System.out.println("Opcion invalida");
                System.out.println("-----------------");
                sc.nextLine();
            }
        } while(repetir);
    }
}