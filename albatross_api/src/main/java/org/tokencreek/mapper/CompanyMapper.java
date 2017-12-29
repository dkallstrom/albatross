package org.tokencreek.mapper;

import org.apache.ibatis.annotations.Select;
import org.mybatis.cdi.Mapper;
import org.tokencreek.Company;
import org.tokencreek.qualifiers.AlbatrossMapper;

import javax.enterprise.context.RequestScoped;


@Mapper
@AlbatrossMapper
@RequestScoped
public interface CompanyMapper {


    @Select("select * from company where company_id = #{companyId}")
    public Company findCompanyByCompanyId(Integer companyId);
}
