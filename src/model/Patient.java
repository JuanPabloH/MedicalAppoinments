package model;

public class Patient extends  User{

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name,email);
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

    @Override
    public String toString() {
        return super.toString()+"\nAge: "+birthday+"\n Weight: "+getWeight()
                +"\n Height: "+getHeight()+"\n Blood: "+ getBlood();
    }
}
