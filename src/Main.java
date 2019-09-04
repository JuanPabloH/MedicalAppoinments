import ui.UIMenu;

public class Main {
    public static void main(String[] args) {
        Doctor doc= new Doctor();
        doc.name="JuanPi";
        doc.showName();
        doc.showId();

        Doctor doc1= new Doctor();

        doc1.showId();

        UIMenu.showMenu();
    }
}
