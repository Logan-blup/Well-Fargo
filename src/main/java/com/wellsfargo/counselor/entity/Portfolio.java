package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(String clientId, String creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Long getportfolioId() {
        return portfolioId;
    }

    public String getclientId() {
        return clientId;
    }

    public void setclientId(String clientId) {
        this.clientId = clientId;
    }

    public String getcreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
