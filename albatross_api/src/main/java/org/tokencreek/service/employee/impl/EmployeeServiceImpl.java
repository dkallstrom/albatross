package org.tokencreek.service.employee.impl;

import org.tokencreek.mapper.EmployeeMapper;
import org.tokencreek.model.employee.Employee;
import org.tokencreek.qualifiers.AlbatrossMapper;
import org.tokencreek.service.employee.EmployeeService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;

    @Inject
    @AlbatrossMapper
    public EmployeeServiceImpl(EmployeeMapper employeeMapper){
        this.employeeMapper = employeeMapper;
    }
    public Employee findEmployeeByEmployeeId(Integer employeeId) {
        return employeeMapper.findEmployeeByEmployeeId(employeeId);
    }
}
