package com.jayden.web.domains;


import org.springframework.stereotype.Component;

@Component

public class PlayerDTO {
    public String playerId,playerName,ePlayerName,nickName,
            joinYyyy,position,backNo,nation,birthDate,solar,
            height,weight,teamId;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getePlayerName() {
        return ePlayerName;
    }

    public void setePlayerName(String ePlayerName) {
        this.ePlayerName = ePlayerName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getJoinYyyy() {
        return joinYyyy;
    }

    public void setJoinYyyy(String joinYyyy) {
        this.joinYyyy = joinYyyy;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBackNo() {
        return backNo;
    }

    public void setBackNo(String backNo) {
        this.backNo = backNo;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSolar() {
        return solar;
    }

    public void setSolar(String solar) {
        this.solar = solar;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
