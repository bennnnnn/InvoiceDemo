package com.example.demo.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class product {

    long id;
    String description;
    double  price;
@NotNull
@Min(1)


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 @NotNull
 @Size(min=5,max=10)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
