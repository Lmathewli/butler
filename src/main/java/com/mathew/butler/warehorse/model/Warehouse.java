package com.mathew.butler.warehorse.model;

import com.mathew.butler.base.model.BaseModel;

import javax.persistence.Entity;

@Entity
public class Warehouse extends BaseModel {
    private String warehouse;
    private String description;
    
    public String getWarehouse() {
        return warehouse;
    }
    
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
