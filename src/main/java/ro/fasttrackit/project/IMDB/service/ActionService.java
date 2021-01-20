package ro.fasttrackit.project.IMDB.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.project.IMDB.model.Action;
import ro.fasttrackit.project.IMDB.repository.ActionRepository;
import ro.fasttrackit.project.IMDB.exceptions.ResourceNotFoundException;

import java.util.List;

@Service
public class ActionService {
    private final ActionRepository repository;

    public ActionService(ActionRepository repository){
        this.repository = repository;
    }

    public List<Action> getAllAction(){
        return repository.findAll();
    }

    public Action getOne(Integer actionId) {
        return repository.findById(actionId)
                .orElseThrow(()-> new ResourceNotFoundException("Could NOT find the movie with the id " + actionId));
    }
}
