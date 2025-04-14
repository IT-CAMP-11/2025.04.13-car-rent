package com.comarch.szkolenia.car.rent;

public class Static {
    public static void main(String[] args) {
        Client.vat = 23;

        System.out.println(Client.vat);

        Client c1 = new Client();
        Client c2 = new Client();

        c1.name = "Janusz";
        c1.surname = "Kowalski";

        c2.name = "Wiesiek";
        c2.surname = "Malinowski";

        System.out.println(c1.name);
        System.out.println(c1.surname);
        System.out.println(c2.name);
        System.out.println(c2.surname);

        System.out.println(Client.vat);
        System.out.println(c1.vat);
        System.out.println(c2.vat);

        Client.vat = 5;
        System.out.println(Client.vat);
        System.out.println(c1.vat);
        System.out.println(c2.vat);

        c1.vat = 8;
        System.out.println(Client.vat);
        System.out.println(c1.vat);
        System.out.println(c2.vat);
    }
}
