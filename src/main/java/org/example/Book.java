package org.example;

public class Book {
//    Сведения о книге состоят из названия, фамилии автора,
//    года издания и количества страниц, цены. Найти названия книг, в которых
//    простое количество страниц, фамилия автора содержит «А» и год издания не позднее 2010 г.

    public String name;
    public String surname;
    public Integer year;
    public Integer page;
    public Double price;

    public Book(String name, String surname, Integer year, Integer page, Double price) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.page = page;
        this.price = price;
    }

    public String getName() { return this.name; }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() { return this.surname; }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Integer getYear() {
        return this.year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public Integer getPage() {
        return this.page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Double getPrice() {
        return this.price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
