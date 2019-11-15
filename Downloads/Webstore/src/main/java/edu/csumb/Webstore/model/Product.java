//This is your model. This file should only contain getters and setters, along with the variables your struct uses.
//DONT FORGET THE CONSTRUCTOR! Getters and setters must be setup to match the name exactly
//or else you will have many errors.
package edu.csumb.Webstore.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

public class Product
{
    String name;

    public Product(String name, String description, String imageURL, Double price, Integer stock) {
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.price = price;
        this.stock = stock;
    }

    @Id
    @ApiModelProperty(required = false, hidden = true)
    String id;
    String description;
    String imageURL;
    Double price;
    Integer stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

//    @Id
//   @ApiModelProperty(required = false, hidden = true)
//   String id;
//   String description;
//   String imageURL;
//   Double price;
//   Integer stock;
}