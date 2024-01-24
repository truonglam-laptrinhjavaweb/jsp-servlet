package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.HelloWorldEntity;
import com.laptrinhjavaweb.model.HelloModel;
import com.laptrinhjavaweb.repository.HelloWorldRepository;

public class HelloWorldService {

    private HelloWorldRepository helloWorldRepository = new HelloWorldRepository();

    public HelloModel find(int id) {
        HelloWorldEntity helloWorldEntity = helloWorldRepository.find(id);
        return new HelloModel(helloWorldEntity.getContent());
    }
}
