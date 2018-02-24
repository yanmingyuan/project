package com.ymy.controller;

import com.ymy.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SalaryController {
    @Autowired
    private SalaryService salaryService;
}
