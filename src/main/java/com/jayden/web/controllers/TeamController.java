package com.jayden.web.controllers;

import com.jayden.web.domains.PlayerDTO;
import com.jayden.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    PlayerService playerService;
    @GetMapping("")
    public List<PlayerDTO> getList(){
        return playerService.retrieveAll();
    }
}
