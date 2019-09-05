public class Patient {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        this.name=name;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getWeight() {
        return weight+" Kg";
    }

    public String getHeight() {
        return height+" m";
    }

    public String getBlood() {
        return blood;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length()>8){
            System.out.println("Asigne un numero telenofico valida, maximo 8 dig");
        }else if(phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;
        }

    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
