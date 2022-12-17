package org.example;

public class TovarN {
    //        Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
    //        Получить наименования товаров заданного сорта с наименьшей ценой.
    public String name;
    public String country;
    public String brand;
    public Double weight;
    public Double price;

    public TovarN(String name, String country, String brand, Double weight, Double price) {
        this.name = name;
        this.country = country;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public String getName() { return this.name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() { return this.country; }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Double getWeight() {
        return this.weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    public Double getPrice() {
        return this.price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
