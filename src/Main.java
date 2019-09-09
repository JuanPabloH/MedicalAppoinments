import model.Doctor;
import model.Patient;
import model.User;

import javax.print.Doc;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(myDoctor);

        User user= new Doctor("Crisito","cris@gmail.com");
        user.showDataUser();

        User userPatient= new Patient("Vivi","vivi@vivi.es");
        userPatient.showDataUser();

        User user1= new User("Nombre","nombre@email.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz Auzul");
                System.out.println("DEpto: Pediatria");
            }
        };

        user1.showDataUser();
        /*

        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + "  " + aA.getTime());
        }*/
/*
        Patient patient= new Patient("Juan Herrera","juan@gmail.com");


        System.out.println(patient);*/
    }
}
