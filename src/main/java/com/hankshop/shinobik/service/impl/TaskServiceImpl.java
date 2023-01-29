package com.hankshop.shinobik.service.impl;

import com.hankshop.shinobik.Repository.QuantifiableRepository;
import com.hankshop.shinobik.Repository.ToCheckRepository;
import com.hankshop.shinobik.model.Quantifiable;
import com.hankshop.shinobik.model.ToCheck;
import com.hankshop.shinobik.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    ToCheckRepository toCheckRepository;
    @Autowired
    QuantifiableRepository quantifiableRepository;

    @Override
    public List<ToCheck> listAllToCheck() {
        return (List<ToCheck>) toCheckRepository.findAll();
    }
    @Override
    public ToCheck saveToCheck(ToCheck toCheck){
        return  toCheckRepository.save(toCheck);
    }

    @Override
    public ToCheck findToCheckById(Long id) {
        Optional<ToCheck> toCheck = toCheckRepository.findById(id);
        if (toCheck.isPresent()){
            return toCheck.get();
        }else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public List<Quantifiable> listAllQuantifiable() {
        return (List<Quantifiable>) quantifiableRepository.findAll();
    }

    @Override
    public Quantifiable saveQuantifiable(Quantifiable quantifiable) {
        return quantifiableRepository.save(quantifiable);
    }
}
