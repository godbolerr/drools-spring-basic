package com.work.findrools.rules;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy")
public class PolicyController {

    private DroolsService dService;

    @Inject
    public PolicyController(DroolsService dService) {
        this.dService = dService;
    }

    @RequestMapping(value = "/check", method = {RequestMethod.POST})
    public PolicyInfo checkOrder(@RequestBody PolicyInfo info) {
        return dService.calculateRisk(info.getDriver(),info.getPolicy());
    }
}
