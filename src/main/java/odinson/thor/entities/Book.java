package odinson.thor.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Author is mandatory")
    private String author;

    @NotBlank(message = "ISBN is mandatory")
    private String ISBN;

    private int comments;

    public int getComments() {
        return comments;
    }

    public void setComment(int comments) {
        this.comments = comments;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book() {}

    public Book(String name, String author, String ISBN) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.comments = 0;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author=" + author + '}';
    }
}
