public class Launch {

    public static void main(String[] args) {
        Book tolstoy = new Book("Война и Мир", "Л.Н.Толстой", 1863);
        Book pushkin = new Book("Сказка о царе Салтане", "А.С.Пушкин", 1831);
        Book pushkin2 = new Book("Сказка о царе Салтане", "А.С.Пушкин", 1831);
        System.out.println(pushkin.equals(pushkin2));
        System.out.println(tolstoy);
        System.out.println(pushkin);
        tolstoy.setYearOfPublication(1864);
        System.out.println(tolstoy);

//
        Author tolstoyname = new Author("Лев", "Толстой");
        Author pushkinname = new Author("Александр", "Пушкин");
        Author pushkinname2 = new Author("Александр", "Пушкин");
        System.out.println(pushkinname.equals(pushkinname2));
        System.out.println(tolstoyname);
        System.out.println(pushkinname);
    }


}
