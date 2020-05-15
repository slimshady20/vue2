package com.jayden.web.serviceImpl;

import com.jayden.web.domains.PlayerDTO;
import com.jayden.web.mappers.PlayerMapper;
import com.jayden.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl  implements PlayerService {
            @Autowired
    PlayerMapper playerMapper;

    @Override
    public List<PlayerDTO> retrieveAll() {
        return playerMapper.selectAll();
    }

}
