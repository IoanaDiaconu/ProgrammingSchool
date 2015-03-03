package service;

import idea.Idea;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IdeaServiceImpl implements IdeaService {
    @Override
    public Idea addIdea(Idea idea) {
       ideas.add(idea);
       return idea;
    }

    @Override
    public Idea updateIdea(Idea idea) {
       return null;
    }

    @Override
    public void deleteIdea(Idea idea) {
        ideas.remove(idea);
    }

    @Override
    public List<Idea> retrieveIdeas() {
        return ideas;
    }

    @Override
    public Optional<Idea> retrieveIdea(int id) {
        return ideas.stream().filter((Idea idea)->idea.getId()== id).findFirst();
    }

    @Override
    public List<JSONObject> getAllIdeas() {
        List<JSONObject> idesAsJson = ideas.stream().map(this::createJson).collect(Collectors.toList());
        return idesAsJson;

    }

    private JSONObject createJson(Idea idea) {
        JSONObject jsonObject =  new JSONObject();
        jsonObject.put("id",idea.getId());
        jsonObject.put("title",idea.getTitle());
        jsonObject.put("description",idea.getDescription());
        jsonObject.put("upVotes",idea.getUpVote());
        jsonObject.put("downVotes",idea.getDescription());
        return jsonObject;
    }
}
