package co.edu.umanizales.asignatures_exercise.controller;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.umanizales.asignatures_exercise.models.Asignature;
import co.edu.umanizales.asignatures_exercise.models.PresentialAsignature;
import co.edu.umanizales.asignatures_exercise.models.VirtualAsignature;
import co.edu.umanizales.asignatures_exercise.service.AsignaturesService;
import co.edu.umanizales.asignatures_exercise.util.Response;

import java.util.List;

@RestController
@RequestMapping("/asignatures")
public class AsignatureController {
    @Autowired
    private AsignaturesService asignaturesService;

    @PostMapping("/presential")
    public Response<Asignature> createPresentialAsignatrue(@RequestBody PresentialAsignature presentialAsignature) {
        return asignaturesService.createAsignature(presentialAsignature);
    }

    @PostMapping("/virtual")
    public Response<Asignature> createVirtualAsignature(@RequestBody VirtualAsignature virtualAsignature) {
        return asignaturesService.createAsignature(virtualAsignature);
    }

    @GetMapping
    public List<Asignature> getAllAsignatures() {
        return asignaturesService.getAllAsignatures();
    }

    @GetMapping("/{code}")
    public Response<Asignature> getAsignature(@PathVariable byte code) {
        return asignaturesService.getAsignature(code);
    }

    @DeleteMapping("/{code}")
    public String deleteAsignature(@PathVariable byte code) throws BadRequestException {
        return asignaturesService.deleteAsignature(code);
    }

}
