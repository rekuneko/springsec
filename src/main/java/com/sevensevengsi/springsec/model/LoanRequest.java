package com.sevensevengsi.springsec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "loan_request", schema = "public")
public class LoanRequest {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Integer borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getTermRateId() {
        return termRateId;
    }

    public void setTermRateId(Integer termRateId) {
        this.termRateId = termRateId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "borrower_id")
    private Integer borrowerId;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "term_rate_id")
    private Integer termRateId;

    @Column(name = "status_id")
    private Integer statusId;

    @Column(name = "store_id")
    private Integer storeId;

    @Column(name = "manager_id")
    private Integer managerId;

    @Column(name = "remarks")
    private String remarks;
}
