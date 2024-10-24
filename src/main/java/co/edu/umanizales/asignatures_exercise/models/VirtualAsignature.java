package co.edu.umanizales.asignatures_exercise.models;

public class VirtualAsignature extends Asignature {
    private String platform; // Plataforma de reuniones dónde se ven las clases

    public VirtualAsignature(String code, String name, String platform) {
        super(code, name);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public boolean isVirtual() {
        return true;
    }
}
