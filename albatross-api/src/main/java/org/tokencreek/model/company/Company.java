package org.tokencreek.model.company;

import org.tokencreek.model.address.Address;

public class Company {


    private Integer id;
    private String name;
    private Address address;


    public Company(Integer companyId, String name){
        this.id = companyId; this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
