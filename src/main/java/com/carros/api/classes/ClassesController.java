package com.carros.api.classes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/classes")
public class ClassesController {
    @Autowired
    private ClasseService service;

    @GetMapping()
    public ResponseEntity get() {
        List<ClasseDTO> classes = service.getClasse();
        return ResponseEntity.ok(classes);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        ClasseDTO classe = service.getClasseById(id);
        return  ResponseEntity.ok(classe);

    }
    @GetMapping("/tipo/{tipo}")
    public ResponseEntity getClasseByTipo(@PathVariable("tipo") String tipo) {
        List<ClasseDTO> classes = service.getClasseByTipo(tipo);
        return classes.isEmpty() ?
                ResponseEntity.noContent().build() :
                ResponseEntity.ok(classes);
    }



}
