package com.hankshop.shinobik.service;

import com.hankshop.shinobik.model.ToCheck;

import java.util.List;

public interface TaskService {
    List<ToCheck> listAllToChecks();

    ToCheck saveToCheck(ToCheck toCheck);
}
