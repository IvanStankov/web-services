package com.ivan.jmp.model;

/**
 * Created by Иван on 05.04.2016.
 */
public class UserCards {

    private String userName;
    private int yellowCards;
    private int redCards;

    public UserCards() {
    }

    public UserCards(String userName, int yellowCards, int redCards) {
        this.userName = userName;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(int yellowCards) {
        this.yellowCards = yellowCards;
    }

    public int getRedCards() {
        return redCards;
    }

    public void setRedCards(int redCards) {
        this.redCards = redCards;
    }
}
