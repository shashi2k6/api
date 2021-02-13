package com.speedway.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public
class Course {

    @Id
    private int id;

    private String name;

    @ManyToMany(mappedBy = "likedCourses")
    Set<Student> likes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Student> getLikes() {
        return likes;
    }

    public void setLikes(Set<Student> likes) {
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
