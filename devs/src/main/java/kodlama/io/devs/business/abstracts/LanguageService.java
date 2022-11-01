package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	Language sId(int id);
		public void add(Language language);
		public void delete(int id);
		public void update(int id,Language language);

}
