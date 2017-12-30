package org.tokencreek.model.company;

public class Company {


    private Long id;
    private String name;

    public Company(){

    }
    public Company(Long companyId){
        this.id = companyId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
