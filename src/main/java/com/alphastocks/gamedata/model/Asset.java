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
@Table(name = "asset")
@NamedQueries({
    @NamedQuery(name = "Asset.findAll", query = "SELECT a FROM Asset a"),
    @NamedQuery(name = "Asset.findBySymbol", query = "SELECT a FROM Asset a WHERE a.symbol = :symbol"),
    @NamedQuery(name = "Asset.findByName", query = "SELECT a FROM Asset a WHERE a.name = :name"),
    @NamedQuery(name = "Asset.findByLogo", query = "SELECT a FROM Asset a WHERE a.logo = :logo"),
    @NamedQuery(name = "Asset.findByDescription", query = "SELECT a FROM Asset a WHERE a.description = :description")})
public class Asset implements Serializable {

    
    @Column(name = "city")
    private String city;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "symbol")
    private String symbol;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "logo")
    private String logo;
    @Column(name = "description")
    private String description;

    public Asset() {
    }

    public Asset(String symbol) {
        this.symbol = symbol;
    }

    public Asset(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Asset)) {
            return false;
        }
        Asset other = (Asset) object;
        if ((this.symbol == null && other.symbol != null) || (this.symbol != null && !this.symbol.equals(other.symbol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alphastocks.gamedata.model.Asset[ symbol=" + symbol + " ]";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
