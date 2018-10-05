package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

//methods with getAllTopics(), getTopic(String id), updateTopic(Topic t), deleteTopic(String id)
//de a fentieket nem kell megcsinálni
public interface TopicRepository extends /*JpaRepository<Topic, String>*/ CrudRepository<Topic, String> /*tartalmazza a logikát minden entityhez*/{
    //CrudRepository: az entity maga: Topic először, aztán az Id típusa

    //mégis JPArepository Roki mondta

    //findById(String id);

}
