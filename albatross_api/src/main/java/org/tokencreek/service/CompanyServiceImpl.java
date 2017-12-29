package org.tokencreek.service;



import org.mybatis.cdi.Mapper;
import org.tokencreek.Company;
import org.tokencreek.mapper.CompanyMapper;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.io.Serializable;

@RequestScoped
public class CompanyServiceImpl implements CompanyService, Serializable {

    private CompanyMapper companyMapper;

    @Inject
    public CompanyServiceImpl(CompanyMapper companyMapper){
        this.companyMapper = companyMapper;
    }

    public Company getCompanyById(Long companyId){
        return companyMapper.findCompanyByCompanyId(companyId);
    }

}
