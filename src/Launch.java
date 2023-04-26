public class Launch {

    public static void main(String[] args) {
        Book tolstoy = new Book("Война и Мир", "Л.Н.Толстой", 1863);
        Book pushkin = new Book("Сказка о царе Салтане", "А.С.Пушкин", 1831);
        System.out.println("Название книги - " + tolstoy.getTitleOfBooks() + ". Автор - " + tolstoy.getAuthor() + ". Год написания - " + tolstoy.getYearOfPublication());
        System.out.println("Название книги - " + pushkin.getTitleOfBooks() + ". Автор - " + pushkin.getAuthor() + ". Год написания - " + pushkin.getYearOfPublication());
        tolstoy.setYearOfPublication(1864);
        System.out.println("Название книги - " + tolstoy.getTitleOfBooks() + ". Автор - " + tolstoy.getAuthor() + ". Год написания - " + tolstoy.getYearOfPublication());

//
        Author tolstoyname = new Author("Лев", "Толстой");
        Author pushkinname = new Author("Александр", "Пушкин");
        System.out.println( "Имя первого писателя - " + tolstoyname.getName() + ". Фамилия первого писателя - " + tolstoyname.getSurName());
        System.out.println( "Имя второго писателя - " + pushkinname.getName() + ". Фамилия второго писателя - " + pushkinname.getSurName());
    }


}
