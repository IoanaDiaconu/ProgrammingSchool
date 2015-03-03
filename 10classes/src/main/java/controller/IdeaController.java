package controller;

import idea.Idea;
import notification.NotificationEvent;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.IdeaService;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IdeaController {

    private final AtomicLong id = new AtomicLong();

    @Autowired
    private IdeaService ideaService;
    @Autowired
    ApplicationContext context;


    @RequestMapping(value = "/ideas", method = RequestMethod.GET)
    public List<JSONObject> viewIdeas() {
        return ideaService.getAllIdeas();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Idea createNewIdea(@RequestParam(value = "title", defaultValue = "First Idea") String title, @RequestParam(value = "description", defaultValue = "Just my idea") String description) {
        NotificationEvent notification = new NotificationEvent(context, "new idea");
        context.publishEvent(notification);
        return new Idea(id.incrementAndGet(), title, description, 0, 0);
    }

}
