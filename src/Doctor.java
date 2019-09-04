public class Doctor {

    static int id=0;//Autoincrement
    String name;
    String speciality;

    Doctor(){

        System.out.println("creando el objeto");
        id++;
    }
    Doctor(String nombre){
        System.out.println("El nombre del doctor será "+ nombre);
        this.name=nombre;
    }

    //Comportamientos-metodos

    public void  showName(){
        System.out.println("Nombre: "+name);
    }
    public  void  showId(){
        System.out.println("Id doc: "+ id);
    }
}
