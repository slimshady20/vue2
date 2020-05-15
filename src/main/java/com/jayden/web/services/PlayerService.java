package com.jayden.web.services;

import com.jayden.web.domains.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface   PlayerService {
    public List<PlayerDTO> retrieveAll();


}
