package Kodlama.io.Dev.DevsHub.webApi.controllers;

import Kodlama.io.Dev.DevsHub.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Dev.DevsHub.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

    private ProgrammingLanguageService service;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService service) {
        this.service = service;
    }

    @PostMapping
    public boolean add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        boolean result = service.add(programmingLanguage);
        if (!result) return false;

        return result;
    }

    @DeleteMapping
    public boolean delete(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        boolean result = service.delete(programmingLanguage);
        if (!result) return false;

        return result;
    }

    @PutMapping
    public boolean update(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        boolean result = service.update(programmingLanguage);
        if (!result) return false;

        return result;
    }

    @GetMapping
    public List<ProgrammingLanguage> getAll() {
        if (service.getAll().isEmpty()) return null;
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getById(int id) {
        return service.getById(id);
    }
}
