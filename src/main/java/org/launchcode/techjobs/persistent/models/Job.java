package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.List;

//Job.skills already exists. What needs to change and/or be added to map this relationship?
//Be sure to check the whole class for any necessary type updates.

@Entity
public class Job extends AbstractEntity{

   /*  @Id
    @GeneratedValue
    private int id;

    private String name; */

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills;


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List<Skill> skills) {
        super();
        this.employer = anEmployer;
        this.skills = skills;
    }

    // Getters and setters.
    
   /* public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } */

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
