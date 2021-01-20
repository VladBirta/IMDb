package ro.fasttrackit.project.IMDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.project.IMDB.model.Action;

public interface ActionRepository extends JpaRepository<Action, Integer> {
}
