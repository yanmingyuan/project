package com.ymy.controller;

import com.ymy.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RewardController {
    @Autowired
    private RewardService rewardService;
}
