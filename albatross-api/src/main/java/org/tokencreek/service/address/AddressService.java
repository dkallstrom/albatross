package org.tokencreek.service.address;

import org.tokencreek.model.address.Address;

public interface AddressService {


    Address findAddressByAddressId(Integer addressId);
}
