package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min = 0)
    String description;

    //In your Skill class, add a jobs field.
    //Add a getter and setter for the field.
    //This field has a many-to-many type relationship with skills.
    //You’ll need to add the @ManyToMany annotation with an argument mappedBy="skills" to configure this mapping.
    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill() {}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
