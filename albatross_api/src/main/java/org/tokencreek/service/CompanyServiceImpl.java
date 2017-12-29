package org.tokencreek.service;


import org.mybatis.cdi.Transactional;
import org.tokencreek.Company;
import org.tokencreek.mapper.CompanyMapper;
import org.tokencreek.qualifiers.AlbatrossMapper;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.io.Serializable;

@RequestScoped
public class CompanyServiceImpl implements CompanyService, Serializable {

    private CompanyMapper companyMapper;

    @Inject @AlbatrossMapper
    public CompanyServiceImpl(CompanyMapper companyMapper){
        this.companyMapper = companyMapper;
    }

    @Transactional
    public Company getCompanyById(Integer companyId){
        return companyMapper.findCompanyByCompanyId(companyId);
    }

}
