package homework.packageBoks.storage;

import homework.packageBoks.model.Author;



public class AuthorStorage {
    Author [] array = new Author[10];
    int size = 0;

    public void add(Author author) {
        if (size == array.length) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] temp = new Author[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }
    }

    public int getSize() {
        return size;
    }


    public Author getAuthorByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];

        }
        return null;
    }
    public void printBooksByAuthorName(String author) {

        for (int i = 0; i < size; i++) {
            if (array[i].getName().equalsIgnoreCase(author)) {
                System.out.println(array[i]);
            }
        }
    }
}
