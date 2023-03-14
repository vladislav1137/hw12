package hw12;

public class HW12 {
    public static void main(String[] args) {
        Author london = new Author("Джек ", "Лондон ");
        Book loveOfLive = new Book("Любовь к жизни ", london, 1905);
        Author tolkien = new Author("Джон ", "Толкин ");
        Book theLordOfTheRings = new Book("Властелин колец ", tolkien, 1954);
        theLordOfTheRings.setPublicationYear(1955);
        System.out.println(loveOfLive);
        System.out.println(theLordOfTheRings);
    }
}

