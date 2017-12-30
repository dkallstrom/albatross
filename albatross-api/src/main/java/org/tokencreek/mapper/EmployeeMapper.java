package org.tokencreek.mapper;


import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.cdi.Mapper;
import org.tokencreek.model.address.Address;
import org.tokencreek.model.company.Company;
import org.tokencreek.model.employee.Employee;
import org.tokencreek.qualifiers.AlbatrossMapper;

import javax.enterprise.context.RequestScoped;


@Mapper
@AlbatrossMapper
@RequestScoped
public interface EmployeeMapper {


    @Select("SELECT e.first_name as firstName, e.last_name as lastName, e.id as id , e.company_id as companyId, e.address_id as addressId from employee e WHERE e.id = #{id}")
    @Results(value = {
            @Result(property = "company", javaType = Company.class, column = "companyId" , one = @One(select = "org.tokencreek.mapper.CompanyMapper.findCompanyByCompanyId")),
            @Result(property = "address", javaType = Address.class, column = "addressId" , one = @One(select = "org.tokencreek.mapper.AddressMapper.findAddressByAddressId")
            )
    })
    public Employee findEmployeeByEmployeeId(Integer id);
}
