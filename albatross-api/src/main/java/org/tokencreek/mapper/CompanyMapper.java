package org.tokencreek.mapper;


import org.apache.ibatis.annotations.Select;
import org.mybatis.cdi.Mapper;
import org.tokencreek.model.company.Company;
import org.tokencreek.qualifiers.AlbatrossMapper;

import javax.enterprise.context.RequestScoped;


@Mapper
@AlbatrossMapper
@RequestScoped
public interface CompanyMapper {


    @Select("SELECT id as id, company_name as name FROM company WHERE id = #{id}")
    public Company findCompanyByCompanyId(Integer id);
}
