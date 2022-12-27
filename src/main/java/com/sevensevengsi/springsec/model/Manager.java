package com.sevensevengsi.springsec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manager", schema = "public")
public class Manager extends User {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "lender_shop_id")
    private Integer lenderShopId;

    @Column(name = "is_enable")
    private boolean isEnabled;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getLenderShopId() {
        return lenderShopId;
    }

    public void setLenderShopId(Integer lenderShopId) {
        this.lenderShopId = lenderShopId;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
