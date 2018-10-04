package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//methods with getAllTopics(), getTopic(String id), updateTopic(Topic t), deleteTopic(String id)
//de a fentieket nem kell megcsinálni
public interface TopicRepository extends CrudRepository<Topic, String> /*tartalmazza a logikát minden entityhez*/{
    //CrudRepository: az entity maga: Topic először, aztán az Id típusa


}
