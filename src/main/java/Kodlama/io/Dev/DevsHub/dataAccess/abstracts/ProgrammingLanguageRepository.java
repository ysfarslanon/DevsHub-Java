package Kodlama.io.Dev.DevsHub.dataAccess.abstracts;

import Kodlama.io.Dev.DevsHub.entities.concretes.ProgrammingLanguage;

import java.util.List;
import java.util.ListIterator;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);
    List<ProgrammingLanguage> getAll();
}
