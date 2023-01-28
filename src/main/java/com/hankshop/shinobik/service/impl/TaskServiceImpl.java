package com.hankshop.shinobik.service.impl;

import com.hankshop.shinobik.Repository.ToCheckRepository;
import com.hankshop.shinobik.model.ToCheck;
import com.hankshop.shinobik.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    @Autowired
    ToCheckRepository toCheckRepository;

    @Override
    public List<ToCheck> listAllToChecks() {
        return (List<ToCheck>) toCheckRepository.findAll();
    }
    @Override
    public ToCheck saveToCheck(ToCheck toCheck){
        return  toCheckRepository.save(toCheck);
    }
}
