/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alphastocks.gamedata.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jordi
 */
@Entity
@Table(name = "market")
@NamedQueries({
    @NamedQuery(name = "Market.findAll", query = "SELECT m FROM Market m"),
    @NamedQuery(name = "Market.findByName", query = "SELECT m FROM Market m WHERE m.name = :name"),
    @NamedQuery(name = "Market.findBySymbol", query = "SELECT m FROM Market m WHERE m.symbol = :symbol"),
    @NamedQuery(name = "Market.findByGame", query = "SELECT m FROM Market m WHERE m.game = :game"),
    @NamedQuery(name = "Market.findByCity", query = "SELECT m FROM Market m WHERE m.city = :city"),
    @NamedQuery(name = "Market.findByCountry", query = "SELECT m FROM Market m WHERE m.country = :country")})
public class Market implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "symbol")
    private String symbol;
    @Basic(optional = false)
    @Column(name = "game")
    private long game;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;

    public Market() {
    }

    public Market(String symbol) {
        this.symbol = symbol;
    }

    public Market(String symbol, String name, long game) {
        this.symbol = symbol;
        this.name = name;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public long getGame() {
        return game;
    }

    public void setGame(long game) {
        this.game = game;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (symbol != null ? symbol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Market)) {
            return false;
        }
        Market other = (Market) object;
        if ((this.symbol == null && other.symbol != null) || (this.symbol != null && !this.symbol.equals(other.symbol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alphastocks.gamedata.model.Market[ symbol=" + symbol + " ]";
    }
    
}
