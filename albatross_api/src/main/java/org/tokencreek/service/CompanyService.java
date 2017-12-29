package org.tokencreek.service;


import org.tokencreek.Company;

import javax.decorator.Decorator;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Model;
import javax.inject.Named;


public interface CompanyService {

    Company getCompanyById(Long companyId);
}
