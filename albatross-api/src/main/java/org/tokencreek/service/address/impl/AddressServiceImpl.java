package org.tokencreek.service.address.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tokencreek.mapper.AddressMapper;
import org.tokencreek.model.address.Address;
import org.tokencreek.qualifiers.AlbatrossMapper;
import org.tokencreek.service.address.AddressService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class AddressServiceImpl implements AddressService {

    static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);


    private AddressMapper addressMapper;

    @Inject @AlbatrossMapper
    public AddressServiceImpl(AddressMapper addressMapper){
        this.addressMapper = addressMapper;
    }
    public Address findAddressByAddressId(Integer addressId) {
        logger.info("Find Address by address id  {}", addressId);
        return addressMapper.findAddressByAddressId(addressId);
    }
}
