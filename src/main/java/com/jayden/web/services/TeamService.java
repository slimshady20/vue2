package com.jayden.web.services;

import com.jayden.web.domains.TeamDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeamService {
    public List<TeamDTO> retrieveAll();
}
