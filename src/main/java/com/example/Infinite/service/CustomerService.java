package com.example.Infinite.service;

import com.example.Infinite.Exception.HnDBankException;

import com.example.Infinite.dto.CustomerDTO;


import java.util.List;

public class CustomerService {


    public interface CustomerService {
        public CustomerDTO getCustomer(Integer customerId) throws HnDBankException;
        public void addCustomer(CustomerDTO customerDTO) throws HnDBankException;
        public void updateCustomer(Integer customerId, String emailId) throws HnDBankException;
        public void deleteCustomer(Integer customerId) throws HnDBankException;

        public List<CustomerDTO> getCustomerdetails() throws HnDBankException;
        public List<CustomerDTO> getCustomerdetailsParam(int custId) throws HnDBankException;
        public List<Object[]> getCustomerNameAndDob() throws HnDBankException;
        public List<String> getCustomerName() throws HnDBankException;


    }