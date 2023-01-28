package com.hankshop.shinobik.Repository;

import com.hankshop.shinobik.model.Quantifiable;
import org.springframework.data.repository.CrudRepository;

public interface QuantifiableRepository extends CrudRepository<Quantifiable, Long> {
}