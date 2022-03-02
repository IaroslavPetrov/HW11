package com.company;

public class Main {

    public static void main(String[] args) {
        Book dune = new Book("Dune", new Author("Franklin", "Herbert"), 1965);
        Book TheStand = new Book("The Stand", new Author(" Stephen", "King"), 1978);
        Author FranklinHerbert = new Author("Franklin", "Herbert");
        Author StephenKing = new Author("Stephen", "King");
        System.out.println("Dune about = bookName - " + dune.getBookName() + ", authorName - " + dune.getAuthorName().getFullName() + ", publishingYear - " + dune.getPublishingYear());
        System.out.println("The Stand.bookName = " + TheStand.getBookName());
        System.out.println("The Stand.authorName = " + TheStand.getAuthorName().getFullName());
        System.out.println("The Stand.publishingYear = " + TheStand.getPublishingYear());
        System.out.println("FranklinHerbert.fullName = " + FranklinHerbert.getFullName());
        System.out.println("StephenKing.fullName = " + StephenKing.getFullName());
        TheStand.setPublishingYear(1994);
        System.out.println("The Stand.getPublishingYear() = " + TheStand.getPublishingYear());

    }
}
