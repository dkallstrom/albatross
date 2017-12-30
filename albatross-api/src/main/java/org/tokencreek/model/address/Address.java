package org.tokencreek.model.address;

public class Address {

    private Integer id;
    private String lineOne;
    private String lineTwo;
    private String city;
    private String state;
    private String postalCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
