package com.devesuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devesuperior.dsdeliver.dto.OrderDTO;
import com.devesuperior.dsdeliver.entities.Order;
import com.devesuperior.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;
  
    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(){
        List<Order>list = repository.findOrdersWithProduts();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
}  
}