package com.example.groupe_alternant.entities;

public class Calcul  extends BaseEntity{
    Integer premierElement;
    Integer deuxiemeElement;
    String symbol;
    Integer resultat;

    public Calcul() {
    }

    public Integer getPremierElement() {
        return premierElement;
    }

    public void setPremierElement(Integer premierElement) {
        this.premierElement = premierElement;
    }

    public Integer getDeuxiemeElement() {
        return deuxiemeElement;
    }

    public void setDeuxiemeElement(Integer deuxiemeElement) {
        this.deuxiemeElement = deuxiemeElement;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getResultat() {
        return resultat;
    }

    public void setResultat(Integer resultat) {
        this.resultat = resultat;
    }
}
