package com.example.Infinite.service;

import com.example.Infinite.Exception.HnDBankException;
import com.example.Infinite.repository.CustomerLoginRepository;
import com.example.Infinite.dto.CustomerLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {
    @Autowired
    private CustomerLoginRepository customerLoginRepository;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException {
        System.out.println("inside service impl method");
        String toRet = null;
        CustomerLoginDTO customerLoginDTO = customerLoginRepository
                .getCustomerLoginByLoginName(customerLogin.getLoginName());
        if (customerLogin.getPassword().equals(customerLoginDTO.getPassword())){
            toRet = "SUCCESS";
        }else{
            throw new HnDBankException("Service.WRONG_CREDENTIALS");
        }
        return toRet;
    }
}