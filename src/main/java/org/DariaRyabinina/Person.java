package org.DariaRyabinina;


import java.math.BigDecimal;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private BigDecimal weight;
    private List<String> jobs;


    public Person(String name,int age,BigDecimal weight, List<String> jobs){
        this.age=age;
        this.jobs=jobs;
        this.name=name;
        this.weight=weight;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public List<String> getJobs() {
        return jobs;
    }
}
