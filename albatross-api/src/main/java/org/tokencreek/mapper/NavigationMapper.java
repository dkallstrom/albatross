package org.tokencreek.mapper;


import org.apache.ibatis.annotations.Select;
import org.mybatis.cdi.Mapper;
import org.tokencreek.model.navigation.Navigation;
import org.tokencreek.qualifiers.AlbatrossMapper;

import javax.enterprise.context.RequestScoped;
import java.util.List;

@Mapper
@AlbatrossMapper
@RequestScoped
public interface NavigationMapper {

    @Select("select id as id, href as href, text as text, class as cssClass, icon as icon from navigation ;")
    public List<Navigation>getAllLeftNav();
}
