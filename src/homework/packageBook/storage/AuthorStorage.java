package homework.packageBook.storage;

import homework.packageBook.exception.AuthorNotFoundException;
import homework.packageBook.model.Author;


public class AuthorStorage {
    Author[] author = new Author[10];
    int size = 0;

    public void add(Author author) {
        if (size == this.author.length) {
            extend();
        }
        this.author[size++] = author;
    }

    private void extend() {
        Author[] temp = new Author[author.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = author[i];
        }
        author = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + author[i] + " ");
        }
    }

    public int getSize() {
        return size;
    }


    public void getAuthorByIndex(int index) throws AuthorNotFoundException {

        if (index >= -1 && index < size) {
            System.out.println(author[index]);
        } else {
            throw new AuthorNotFoundException("author not found with this index");
        }
    }
    public void printBooksByAuthorName(String author) {

        for (int i = 0; i < size; i++) {
            if (this.author[i].getName().equalsIgnoreCase(author)) {
                System.out.println(this.author[i]);
            }
        }
    }

    public boolean existsByEmail(String email) {
        for (Author author : author) {
            if (author.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}
