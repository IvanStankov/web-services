package com.ivan.jmp.model;

import java.util.List;

/**
 * Created by Иван on 05.04.2016.
 */
public class CardsOfTeam {

    private List<UserCards> userCards;

    public CardsOfTeam() {
    }

    public CardsOfTeam(List<UserCards> userCards) {
        this.userCards = userCards;
    }

    public List<UserCards> getUserCards() {
        return userCards;
    }

    public void setUserCards(List<UserCards> userCards) {
        this.userCards = userCards;
    }
}
