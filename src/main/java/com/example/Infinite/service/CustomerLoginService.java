package com.example.Infinite.service;

import com.example.Infinite.Exception.HnDBankException;
import com.example.Infinite.dto.CustomerLoginDTO;

public interface CustomerLoginService {
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException;

}
