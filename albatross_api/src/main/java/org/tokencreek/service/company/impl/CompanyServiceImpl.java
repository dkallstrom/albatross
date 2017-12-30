package org.tokencreek.service;


import org.mybatis.cdi.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tokencreek.Company;
import org.tokencreek.mapper.CompanyMapper;
import org.tokencreek.qualifiers.AlbatrossMapper;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class CompanyServiceImpl implements CompanyService {

    static final Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);
    private CompanyMapper companyMapper;


    @Inject @AlbatrossMapper
    public CompanyServiceImpl(CompanyMapper companyMapper){
        this.companyMapper = companyMapper;
    }


    @Transactional
    public Company  getCompanyById(Integer companyId){
        Company company = this.companyMapper.findCompanyByCompanyId(companyId);
        logger.info("Company {}", company);
        return company;
    }
}
