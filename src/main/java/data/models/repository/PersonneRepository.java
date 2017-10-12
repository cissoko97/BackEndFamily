package data.models.repository;

import data.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonneRepository extends CrudRepository<Personne , Long> {

}
