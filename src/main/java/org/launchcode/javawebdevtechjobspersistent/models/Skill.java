package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max=500, message="Description can't exceed 500 characters!")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> job;


    public Skill(String description) {
        this();
        this.description = description;
    }

    public Skill() {};

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}