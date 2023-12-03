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
    String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String locationOfEmployer) {
        this.location = locationOfEmployer;
    }

    public Employer() {};

    @OneToMany
    @JoinColumn(name = "employerId")
    private List<Job> jobs = new ArrayList<>();


}
