package cn.tac.test.spring.boot.thymeleaf.pojo;

/**
 * @author tac
 * @since 19/12/2017
 */
public class Book {
    public Book() {
        this.author = new Author();
    }

    public Book(String authName) {
        this(authName, "untitled");
    }

    public Book(String authName, String title) {
        this();
        this.title = title;
        this.author.setName(authName);
    }

    private String title;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public static class Author {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
