package com.myapp.springdatajpa1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Job {
    @Id
    @GeneratedValue
    private Integer jobId;
    private String jobName;

    @ManyToMany(mappedBy = "jobs")
    List<Employee> employees;
}
