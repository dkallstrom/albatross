package org.tokencreek;

import javax.inject.Named;


public class Company {


    private Long companyId;

    public Company(){

    }
    public Company(Long companyId){
        this.companyId = companyId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }



}
