package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Repository // Bu bir dataAccess nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository{
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"Pyhton"));
		languages.add(new Language(3,"C#"));
				
	}


	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language sId(int id) {
		for (Language language : languages) {
					if (language.getId()== id) {
						return language;
					}
				}
				return null;
	}

	@Override
	public void add(Language language) {
		if (!(language.getName().trim()=="")) {
					boolean result=true;
					for (Language pLanguage : languages) {
						if (language.getName().toUpperCase().equals(language.getName().toUpperCase())) {
							result=false;
							break;
						}
					}
					if (result) {
						languages.add(language);
					}

				}

	}

	@Override
	public void delete(int id) {
		for (Language language : languages) {
					if (language.getId()==id) {
						languages.remove(language);
					}

				}

	}

	@Override
	public void update(int id, Language language) {
		languages.set(id-1, language);
	}
}
