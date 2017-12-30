package org.tokencreek.mapper;

import org.apache.ibatis.annotations.Select;
import org.mybatis.cdi.Mapper;
import org.tokencreek.model.address.Address;
import org.tokencreek.qualifiers.AlbatrossMapper;

import javax.enterprise.context.RequestScoped;

@Mapper
@AlbatrossMapper
@RequestScoped
public interface AddressMapper {

    @Select("SELECT id , line_one as lineOne, line_two as lineTwo, city, state, postal_code as postalCode from address WHERE id = #{id}")
    public Address findAddressByAddressId(Integer id);
}
