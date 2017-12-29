package org.tokencreek.mapper;
import org.apache.ibatis.annotations.Select;

import org.mybatis.cdi.Mapper;
import org.tokencreek.Company;

import javax.enterprise.context.ApplicationScoped;


@Mapper
public interface CompanyMapper {

    @Select("select * from company where companyId = #{companyId}")
    Company findCompanyByCompanyId(Long companyId);
}
