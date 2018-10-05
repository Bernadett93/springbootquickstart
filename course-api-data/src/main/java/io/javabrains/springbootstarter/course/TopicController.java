package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    //we have to declare the dependence, we can do it with autowired
    @Autowired
    private TopicService topicService;

    //business logic happens in this method
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }
    //automatikusan JSON formátumba konvertálja a választ

    //id egy változó, amit várunk, ezért kell még egy annotáció a paraméterhez, hogy azt várjuk amúgy
    //ha a path-ban nem id, hanem foo, akkor @PathVariable('foo')
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    //post-al adunk hozzá, default értéke a lenti annotációnak a get
    //url a value propertybe fog kelleni
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){ //a path-ból kell kivennie azt az értéket, amit hozzá akarunk adni post-al
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
