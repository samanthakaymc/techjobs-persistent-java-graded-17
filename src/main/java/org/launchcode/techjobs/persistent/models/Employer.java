package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotNull
    @Size(min = 0, max = 200)
    private String location;

    //Within Employer, add a private property jobs of type List<Job> and initialize it to an empty ArrayList.
    //After we set up the Job class to work with Employer objects, this list will represent the list of all items in a given job.
    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();

    //Use the @OneToMany and @JoinColumn annotations on the jobs list in Employer to declare the relationship between data tables.
    //Recall that this annotation needs a name parameter. What should its value be?

    public String getLocation() {
        return location;
    }

    public void setLocation(String locationOfEmployer) {
        this.location = locationOfEmployer;
    }

    public Employer() {};

    public List<Job> getJobs() {
        return jobs;
    }
}
