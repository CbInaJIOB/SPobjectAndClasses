
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Author tolstoy = new Author("Лев", "Толстой");
        Author lermontov = new Author("Михаил", "Лермонтов");

        Book warAndPieace = new Book("Война и мир", tolstoy, 1869);
        Book herro = new Book("Герой нашего времени", lermontov, 1841);

        System.out.println(warAndPieace.getTitle() + " " + warAndPieace.getPublicationYear());
        System.out.println(herro.getTitle() + " " + herro.getPublicationYear());

        warAndPieace.setPublicationYear(2022);

        System.out.println(warAndPieace.getTitle() + " " + warAndPieace.getPublicationYear());
    }
}