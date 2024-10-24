package co.edu.umanizales.asignatures_exercise.models;

public class Student {
    private byte id;
    private String name;
    private String gender;
    
    public Student(byte id, String name, String gender) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
