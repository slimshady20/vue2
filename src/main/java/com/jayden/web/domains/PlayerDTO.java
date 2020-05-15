package com.jayden.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data

public class PlayerDTO {
    public String playerId,playerName,ePlayerName,nickName,
            joinYyyy,position,backNo,nation,birthDate,solar,
            height,weight,teamId;
}
