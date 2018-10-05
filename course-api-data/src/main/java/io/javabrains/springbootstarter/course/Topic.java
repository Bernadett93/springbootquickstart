package io.javabrains.springbootstarter.course;

//ez a model class ez kell nekünk, hogy az adatbázisba legyen mentve
//ez az objektum

import javax.persistence.Entity;
import javax.persistence.Id;

//mivel ez adatbázisból tábla, kell ez, a property-k column-ok
@Entity
public class Topic {

    //teljesen mindegy mi a neve a változónak, ha ez a primary key, akkor ide kell az id annotáció
    @Id
    private String id;
    private String name;
    private String descriptions;

    public Topic(){

    }

    public Topic(String id, String name, String descriptions) {
        super();
        this.id = id;
        this.name = name;
        this.descriptions = descriptions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
