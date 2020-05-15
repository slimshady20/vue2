package com.jayden.web.serviceImpl;

import com.jayden.web.domains.TeamDTO;
import com.jayden.web.mappers.TeamMapper;
import com.jayden.web.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamMapper teamMapper;
    @Override
    public List<TeamDTO> retrieveAll() {

        return teamMapper.selectAll();
    }
}
