package com.fitrytm.data.entity;

import javax.persistence.Entity;

@Entity
public class Exercise extends AbstractEntity {

    private String category;
    private String exposureLevel;
    private String name;
    private String description;

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getExposureLevel() {
        return exposureLevel;
    }
    public void setExposureLevel(String exposureLevel) {
        this.exposureLevel = exposureLevel;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
