package com.programmingtechie.productservice.controller;

import com.programmingtechie.productservice.model.Expense;
import com.programmingtechie.productservice.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addExpense(@RequestBody Expense expense){
        expenseService.addExpense(expense);
    }

    public void updateExpense(){}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Expense>> getAllExpense(){

        return ResponseEntity.ok(expenseService.getAllExpense());
    }

    public void getExpenseByName(){}

    public void deleteExpense(){}


}
