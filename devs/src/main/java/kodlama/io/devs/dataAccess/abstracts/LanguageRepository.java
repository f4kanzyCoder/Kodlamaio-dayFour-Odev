package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	Language sId(int id);
	public void add(Language language);
	public void delete(int id);
	public void update(int id,Language language);




}
