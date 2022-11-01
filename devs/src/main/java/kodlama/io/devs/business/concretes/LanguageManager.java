package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Service // Bu bir is sinifidir (business sinifi)
public class LanguageManager implements LanguageService{
	
		private LanguageRepository languageRepository;
		
	@Autowired
		public LanguageManager(LanguageRepository languageRepository) {
			this.languageRepository=languageRepository;
		}

		@Override
		public List<Language> getAll() {

			return languageRepository.getAll();
		}

		@Override
		public Language sId(int id) {
			return languageRepository.sId(id);
		}

		@Override
		public void add(Language language) {
			languageRepository.add(language);

		}

		@Override
		public void delete(int id) {
			languageRepository.delete(id);

		}

		@Override
		public void update(int id, Language language) {
			languageRepository.update(id, language);

		}

}
