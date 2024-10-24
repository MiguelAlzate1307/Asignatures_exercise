package co.edu.umanizales.asignatures_exercise.models;

public class Students {
    private byte id;
    private byte name;
    private String gender;
    
    public Students(byte id, byte name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public byte getName() {
        return name;
    }

    public void setName(byte name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
