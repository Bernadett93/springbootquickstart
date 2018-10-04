package io.javabrains.springbootstarter.topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//methods with getAllTopics(), getTopic(String id), updateTopic(Topic t), deleteTopic(String id)
//de a fentieket nem kell megcsinálni
public interface TopicRepository extends JpaRepository<Topic, String> /*tartalmazza a logikát minden entityhez*/{
    //CrudRepository: az entity maga: Topic először, aztán az Id típusa

    //mégis JPArepository Roki mondta

    Topic findById(Long id);

}
