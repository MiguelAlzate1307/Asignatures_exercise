package co.edu.umanizales.asignatures_exercise.models;

import java.util.List;
import java.util.ArrayList;

public abstract class Asignature {
    protected byte code;
    protected String name;
    protected List<Students> students;
    
    public Asignature(byte code, String name) {
        this.code = code;
        this.name = name;
        this.students = new ArrayList<>();
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

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public abstract boolean isVirtual();
}
