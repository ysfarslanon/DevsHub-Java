package Kodlama.io.Dev.DevsHub.business.abstracts;

import Kodlama.io.Dev.DevsHub.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    boolean add(ProgrammingLanguage programmingLanguage) throws Exception;
    boolean delete(ProgrammingLanguage programmingLanguage);
    boolean update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getById(int id);
    List<ProgrammingLanguage> getAll();
}
