package co.edu.umanizales.asignatures_exercise.models;

import java.util.List;

public class Asignature {
    protected byte code;
    protected String name;
    List<Students> students;
    
    public Asignature(byte code, String name) {
        this.code = code;
        this.name = name;
    }

    public byte getCode() {
        return this.code;
    }

    public void setCode(byte code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
