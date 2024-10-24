package co.edu.umanizales.asignatures_exercise.models;

public class PresentialAsignature extends Asignature {
    private String classRoom; // Salón donde se verá la clase

    public PresentialAsignature(byte code, String name, String classRoom) {
        super(code, name);
        this.classRoom = classRoom;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public boolean isVirtual() {
        return false;
    }
}
