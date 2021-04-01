package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private  List<Skill> skill = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skill = someSkills;
    }

    // Getters and setters.
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public List<Skill> getSkill() {
        return skill;
    }
    public void setSkills(List<Skill> skill) {
        this.skill = skill;
    }


}
