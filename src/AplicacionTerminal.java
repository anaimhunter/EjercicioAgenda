import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alumnos on 24/10/2017.
 */
public class AplicacionTerminal
{
    private Agenda agenda;

    public AplicacionTerminal()
    {
        agenda = new Agenda();
    }
    public void demo()
    {
        Contacto c1 = new Contacto("Ana","Montes",4445816296L);
        Contacto c2 = new Contacto("Silvia"," Uaslp",4445621967L);
        Contacto c3 = new Contacto("Vallejo","labo ",4445789245L);

        this.agenda.agregaContacto(c1);
        this.agenda.agregaContacto(c2);
        this.agenda.agregaContacto(c3);
        this.agenda.imprimerTodo();
    }

    public void entradaUsuario()
    {
        Scanner entrada = new Scanner(System.in);
        String opcion ="";
        do
        {
            try {
                System.out.println("Opciones: agregar - guardar  - imprimir -terminar");

                opcion = entrada.nextLine();//Va a leer una palabra que va a escribir
                switch (opcion) {
                    case "agregar":
                        agregar(entrada);
                        break;
                    case "guardar":
                        guardar(entrada);

                        break;
                    case "imprimir":
                        agenda.imprimerTodo();
                        break;
                }
            }
            catch(IllegalArgumentException ex)
            {
                System.out.println(ex.getMessage());
                opcion ="";
            }
            catch(InputMismatchException ex)
            {
                System.out.println("El numero de telefono debe tener digitos unicamente ");
                opcion ="";
            }
            catch (IOException e)
            {
                //e.printStackTrace();
                System.out.println("No es valido");
                opcion ="";
            }
            /*
            catch (StringIndexOutOfBoundsException ex)
            {
                System.out.println(ex.getMessage());
                opcion ="";
            }
            catch(RuntimeException ex)
            {
                System.out.println(ex.getMessage());
                opcion ="";
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
                opcion ="";
            }*/
        }while(opcion!="terminar");
    }



    private void agregar(Scanner entrada)
    {
            System.out.println("Agregar un contacto nuevo");
            System.out.print("Nombre:");
            String nombre = entrada.nextLine();
            System.out.print("Direccion:");
            String direccion = entrada.nextLine();
            System.out.print("Telefono:");
            Long telefono = entrada.nextLong();

            Contacto nuevo = new Contacto(nombre, direccion, telefono);
            agenda.agregaContacto(nuevo);

    }

    public static void main(String[] args)
    {
        AplicacionTerminal aplicacion = new AplicacionTerminal();
        aplicacion.demo();
        aplicacion.entradaUsuario();

    }
    private void guardar(Scanner entrada) throws IOException
    {
        System.out. print("Nombre del archivo");
        String nomArchivo = entrada.nextLine();
        agenda.guardar(nomArchivo);
    }
}
