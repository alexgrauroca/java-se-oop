import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Doctorito Doctorando");
        //myDoctor.name = "Doctorito Doctorando";
        myDoctor.showName();
        
        showMenu();
    }
}