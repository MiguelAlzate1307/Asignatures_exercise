package co.edu.umanizales.asignatures_exercise.service;

import co.edu.umanizales.asignatures_exercise.models.Asignature;
import co.edu.umanizales.asignatures_exercise.util.Response;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AsignaturesService {
    private List<Asignature> asignatures = new ArrayList<>();

    public Response<Asignature> createAsignature(Asignature asignature) {
        Asignature asignatureExists = asignatures.stream()
                                      .filter(a -> a.getCode() == asignature.getCode())
                                      .findFirst()
                                      .orElse(null);

        if (asignatureExists != null) {
            return new Response<>(null, "Code already exists");
        }

        asignatures.add(asignature);

        return new Response<Asignature>(asignature, null);
    }

    public List<Asignature> getAllAsignatures() {
        return this.asignatures;
    }

    public Response<Asignature> getAsignature(byte code) {
        Asignature asignature = asignatures.stream()
                                           .filter(a -> a.getCode() == code)
                                           .findFirst()
                                           .orElse(null);

        if (asignature == null) {
            return new Response<>(null, "Asignature not found");
        }

        return new Response<Asignature>(asignature, null);
    }

    public String deleteAsignature(byte code) {
        Response<Asignature> asignature = getAsignature(code);

        if (asignature.getMessage() != null) {
            return asignature.getMessage();
        }

        asignatures.remove(asignature);

        return "Asiganture deleted successfully";
    }
}