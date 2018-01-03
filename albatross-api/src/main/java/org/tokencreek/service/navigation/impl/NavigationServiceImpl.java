package org.tokencreek.service.navigation.impl;

import org.tokencreek.mapper.NavigationMapper;
import org.tokencreek.model.navigation.Navigation;
import org.tokencreek.qualifiers.AlbatrossMapper;
import org.tokencreek.service.navigation.NavigationService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class NavigationServiceImpl implements NavigationService {

    @Inject
    @AlbatrossMapper
    NavigationMapper navigationMapper;

    public NavigationServiceImpl(){

    }
    public List<Navigation> getAllLinks() {
        return navigationMapper.getAllLeftNav();
    }
}
