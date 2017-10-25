/**
 * Created by Alumnos on 24/10/2017.
 */
public class AplicacionTerminal {
    public static void main(String[] args) {
        Contacto c1 = new Contacto("Ana","Montes",4445816296L);
        Contacto c2 = new Contacto("Silvia"," Uaslp",4445621967L);
        Contacto c3 = new Contacto("Vallejo","labo ",4445789245L);
        Agenda agenda = new Agenda();
        agenda.agregaContacto(c1);
        agenda.agregaContacto(c2);
        agenda.agregaContacto(c3);
        agenda.imprimerTodo();
    }
}
