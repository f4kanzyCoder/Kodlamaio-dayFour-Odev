package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;
	@Autowired
		public LanguagesController(LanguageService languageService) {
			this.languageService=languageService;

		}
		@GetMapping("/getall")
		public List<Language> getAll(){
			return this.languageService.getAll();
		}

		@GetMapping("/{id}")
		Language sId(@PathVariable int id) {
			return languageService.sId(id);
		}

		@PostMapping("/add")
		public void add(Language language) {
			languageService.add(language);
		}
		@DeleteMapping("/delete")
		public void delete(int id) {
			languageService.delete(id);
		}
		@PutMapping("/update")
		public void update(int id,Language language) {
			languageService.update(id, language);
		}



}
