package com.minatogithuborg.secretreplacementone.cron.controller;

import com.minatogithuborg.secretreplacementone.base.controller.CronBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping(path = "/rest/cronservices/", produces = "application/json")
public class CronController extends CronBaseController{	
}

