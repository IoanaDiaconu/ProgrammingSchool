package service;


import idea.Idea;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public interface IdeaService {
    List<Idea> ideas = new ArrayList<Idea>();

    public Idea addIdea(Idea idea);

    public Idea updateIdea(Idea idea);

    public void deleteIdea(Idea idea);

    public List<Idea> retrieveIdeas();

    public Optional<Idea> retrieveIdea(int id);

    public List<JSONObject> getAllIdeas();

}
