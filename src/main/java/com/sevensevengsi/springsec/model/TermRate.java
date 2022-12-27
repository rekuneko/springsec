package com.sevensevengsi.springsec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.text.DateFormat;

@Entity
@Table(name = "term_rate", schema = "public")
public class TermRate {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "months")
    private Integer months;

    @Column(name = "rate")
    private Integer rate;

    @Column(name = "date_updated")
    private Date dateUpdated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
