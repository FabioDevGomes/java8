package livro.cap8;

import java.util.Set;

public class StudentPOJO {

  private String name;
  private Set<String> books;

  public void addBook(String book) {
    this.books.add(book);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<String> getBooks() {
    return books;
  }

  public void setBooks(Set<String> books) {
    this.books = books;
  }
}
