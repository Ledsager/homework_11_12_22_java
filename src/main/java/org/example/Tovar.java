package org.example;
//        Дан массив записей: наименование товара, цена, сорт.
//        Найти наибольшую цену товаров 1го или 2го сорта среди
//        товаров, название которых содержит «высший».
public class Tovar {
    public String name;
    public String brand;
    public Double price;

    public Tovar(String name, String brand, Double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String country) {
        this.brand = brand;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
