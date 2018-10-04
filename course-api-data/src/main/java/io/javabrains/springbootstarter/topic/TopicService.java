package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//ez fog az adatbázishoz csatlakozni
@Service
public class TopicService {
    //business service are singletons
    //start: spring create an instance of it
    //akinek van ilyen service annotáció, sporing létrehoz belőle egy példányt

    //készít egy példányt belőle
    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics= new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
    ));

    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> topics=new ArrayList<>();
        topicRepository.findAll()       //iteratable típus, ezért végigmegyünk rajta és beletesszük a listába
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        //return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        Optional<Topic> topic=topicRepository.findById(id);
        return topic.get();
    }

    public void addTopic(Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        for(int i=0; i<topics.size();i++){
            Topic t=topics.get(i);
            if(t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id){
        topics.removeIf(t->t.getId().equals(id));
    }
}
