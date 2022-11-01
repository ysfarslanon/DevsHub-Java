package Kodlama.io.Dev.DevsHub.dataAccess.concretes;

import Kodlama.io.Dev.DevsHub.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Dev.DevsHub.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> languages;

    public InMemoryProgrammingLanguageRepository() {
        languages = new ArrayList<ProgrammingLanguage>();
        languages.add( new ProgrammingLanguage(1,"C#"));
        languages.add( new ProgrammingLanguage(2,"Java"));
        languages.add( new ProgrammingLanguage(3,"Kotlin"));
        languages.add( new ProgrammingLanguage(4,"Go"));
        languages.add( new ProgrammingLanguage(5,"R"));
        languages.add( new ProgrammingLanguage(6,"C++"));
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        languages.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage updatedLanguage = getById(programmingLanguage.getId());
        updatedLanguage.setName(programmingLanguage.getName());
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        languages.remove(programmingLanguage);
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage: languages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languages;
    }
}
