package com.hankshop.shinobik.service;

import com.hankshop.shinobik.model.Quantifiable;
import com.hankshop.shinobik.model.ToCheck;

import java.util.List;

public interface TaskService {
    List<ToCheck> listAllToCheck();

    ToCheck saveToCheck(ToCheck toCheck);

    ToCheck findToCheckById(Long id);

    List<Quantifiable> listAllQuantifiable();

    Quantifiable saveQuantifiable(Quantifiable quantifiable);

}
