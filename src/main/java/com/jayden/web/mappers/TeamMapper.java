package com.jayden.web.mappers;

import com.jayden.web.domains.TeamDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMapper {
    public List<TeamDTO> selectAll();
}
