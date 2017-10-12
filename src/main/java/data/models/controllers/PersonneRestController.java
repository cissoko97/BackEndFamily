package data.models.controllers;

import data.models.Personne;
import data.models.repository.PersonneRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonneRestController {

    private final PersonneRepository personneRepository;

    public PersonneRestController(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @GetMapping("/Personne")
    Iterable<Personne> PersonneCollection ()
    {
        return this.personneRepository.findAll();
    }
}
