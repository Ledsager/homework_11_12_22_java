package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task3();
    }
    public static void task1() {
        //        Дан массив записей: наименование товара, цена, сорт.
        //        Найти наибольшую цену товаров 1го или 2го сорта среди
        //        товаров, название которых содержит «высший».
        Tovar tov1 = new Tovar("высший 1", "первый", 90.0);
        Tovar tov2 = new Tovar(" мука", "второй", 80.0);
        Tovar tov3 = new Tovar("высший 2", "второй", 96.0);
        Tovar tov4 = new Tovar("высший 3", "третий", 70.0);
        List<Tovar> listTovar = new ArrayList<>();
        listTovar.add(tov1);
        listTovar.add(tov2);
        listTovar.add(tov3);
        listTovar.add(tov4);

        Double maxPrice = 0.0;
        for (Tovar tovar : listTovar) {
            Tovar t = (Tovar) tovar;
            if ((t.getName().contains("высший")) && ((t.getBrand().equals("первый")) || (t.getBrand().equals("второй")))) {
                if (t.getPrice() > maxPrice) {
                    maxPrice = t.getPrice();
                }

            }
        }
        if (maxPrice!=0.0) {
            System.out.println("наибольшая цена товаров 1го или 2го сорта среди\n" +
                    "товаров, название которых содержит «высший» " + maxPrice);
        }else{
            System.out.println("товаров 1го или 2го сорта среди\n" +
                    "товаров, название которых содержит «высший» - НЕТ");
        }
    }
    public static void task2() {
//        Сведения о товаре состоят из наименования, страны-производителя, сорта, веса, цены.
//        Получить наименования товаров заданного сорта с наименьшей ценой.

        TovarN tov1 = new TovarN("высший 1", "rus", "первый", 45.5, 70.0);
        TovarN tov2 = new TovarN(" мука", "evr",  "второй", 5.5, 80.0);
        TovarN tov3 = new TovarN("высший 2", "azi",  "первый", 4.5, 70.0);
        TovarN tov4 = new TovarN("высший 3", "vos",  "третий", 12.4, 60.0);
        List<TovarN> listTovar = new ArrayList<>();
        listTovar.add(tov1);
        listTovar.add(tov2);
        listTovar.add(tov3);
        listTovar.add(tov4);
        Set<String> setName = new HashSet();

        Double minPrice = Double.MAX_VALUE;
        for (TovarN tovar : listTovar) {
            TovarN t = (TovarN) tovar;
            if (t.getBrand().equals("первый")) {
                if (t.getPrice() < minPrice) {
                    minPrice = t.getPrice();
                }
            }
        }
        for (TovarN tovar : listTovar) {
            TovarN t = (TovarN) tovar;
            if ((t.getBrand().equals("первый")) && (t.getPrice().equals(minPrice))) {
                setName.add(t.getName());
            }
        }

        if (minPrice!=0.0) {
            System.out.println("наименования товаров заданного сорта с наименьшей ценой " + setName.toString());
        }else{
            System.out.println("товаров 1го или 2го сорта среди\n" +
                    "товаров, название которых содержит «высший» - НЕТ");
        }
    }
    public static void task3() {
//    Сведения о книге состоят из названия, фамилии автора,
//    года издания и количества страниц, цены. Найти названия книг, в которых
//    простое количество страниц, фамилия автора содержит «А» и год издания не позднее 2010 г.

        Book tov1 = new Book("высший 1", "Ad", 2019, 11, 70.0);
        Book tov2 = new Book("высший 2", "Af", 2014, 7, 50.0);
        Book tov3 = new Book("высший 3", "rus", 2001, 45, 80.0);
        Book tov4 = new Book("высший 4", "rus", 2016, 45, 90.0);
        List<Book> listTovar = new ArrayList<>();
        listTovar.add(tov1);
        listTovar.add(tov2);
        listTovar.add(tov3);
        listTovar.add(tov4);
        Set<String> setName = new HashSet();


        for (Book tovar : listTovar) {
            Book t = (Book) tovar;
            if ((t.getSurname().contains("A"))&&(t.getYear()>2010)&&(isPrime(t.getPage())==true)) {
                System.out.println(t);
                setName.add(t.getName());
            }
        }

        System.out.println("названия книг, в которых\n" +
                "простое количество страниц, фамилия автора содержит «А»\n" +
                "и год издания не позднее 2010 г" + setName.toString());
    }
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

}
