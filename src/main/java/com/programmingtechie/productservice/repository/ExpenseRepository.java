package com.programmingtechie.productservice.repository;

import com.programmingtechie.productservice.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense,String> {

}
