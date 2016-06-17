package app05a.service.impl;

import app05a.domain.Book;
import app05a.domain.Category;
import app05a.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jecyhw on 2016/6/12.
 */
@Service
public class BookServiceImpl implements BookService {
    private List<Category> categories;
    private List<Book> books;

    public BookServiceImpl() {
        categories = new ArrayList<Category>();
        categories.add(new Category(1, "Computing"));
        categories.add(new Category(2, "Travel"));
        categories.add(new Category(3, "Health"));

        books = new ArrayList<Book>();
        books.add(new Book(1l, "23432423432423", "Servlet & JSP: A Tutorial", categories.get(0), "Budi Kurniawan"));
        books.add(new Book(2l, "45345463432432", "C# & A Beginner's Tutorial", categories.get(0), "Jayden Ky"));
    }
    public List<Category> getAllCategories() {
        return categories;
    }

    public Category getCategory(int id) {
        for (Category category : categories) {
            if (id == category.getId()) {
                return category;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book save(Book book) {
        book.setId(getNextId());
        books.add(book);
        return null;
    }

    public Book update(Book book) {
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getId() == book.getId()) {
                books.set(i, book);
                break;
            }
        }
        return book;
    }

    public Book get(long id) {
        for (Book book : books) {
            if (id == book.getId()) {
                return book;
            }
        }
        return null;
    }

    public long getNextId() {
        long id =0l;
        for (Book book : books) {
            long bookId = book.getId();
            if (bookId > id) {
                id = bookId;
            }
        }
        return id + 1;
    }
}
