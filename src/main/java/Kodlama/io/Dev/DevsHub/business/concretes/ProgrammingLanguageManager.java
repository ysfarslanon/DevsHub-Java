package Kodlama.io.Dev.DevsHub.business.concretes;

import Kodlama.io.Dev.DevsHub.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Dev.DevsHub.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Dev.DevsHub.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository repository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.repository = programmingLanguageRepository;
    }


    @Override
    public boolean add(ProgrammingLanguage programmingLanguage) {
        if (isNameRepeat(programmingLanguage.getName())){
            return false;
        }
        if (isNameNullOrEmpty(programmingLanguage.getName())){
            return false;
        }
        repository.add(programmingLanguage);
        return true;
    }

    @Override
    public boolean delete(ProgrammingLanguage programmingLanguage) {
        repository.delete(programmingLanguage);
        return true;
    }

    @Override
    public boolean update(ProgrammingLanguage programmingLanguage) {
        if (isNameRepeat(programmingLanguage.getName())){
            return false;
        }
        if (isNameNullOrEmpty(programmingLanguage.getName())){
            return false;
        }
        repository.update(programmingLanguage);
        return true;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return repository.getAll();
    }

    // Business Rules
    private boolean isNameRepeat(String name){
        for (ProgrammingLanguage programmingLanguage: repository.getAll()) {
            if (programmingLanguage.getName().equals(name)) return true;
        }
        return false;
    }

    private boolean isNameNullOrEmpty(String name){
        for (ProgrammingLanguage programmingLanguage: repository.getAll()) {
            if (programmingLanguage.getName() == null || programmingLanguage.getName().equals("")) return true;
        }
        return false;
    }

}
