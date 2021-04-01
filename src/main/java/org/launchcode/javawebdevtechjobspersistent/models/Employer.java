package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    private String location;

    @OneToMany (mappedBy = "employer", cascade = CascadeType.ALL)
    private List<Job> jobs = new ArrayList<>();

    public Employer (String location) {
        this.location = location;
    }

    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}


//  1. Within Employer, add a private property jobs of type List<Job> and initialize
// it to an empty ArrayList. After we set up the Job class to work with Employer
// objects, this list will represent the list of all items in a given job.

//  2. Use the @OneToMany and @JoinColumn annotations on the jobs list in Employer
//  to declare the relationship between data tables.