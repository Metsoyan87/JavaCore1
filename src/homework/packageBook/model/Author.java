package homework.packageBook.model;

import homework.packageBook.enums.Gender;

import java.util.Date;

import static homework.packageBook.util.DateUtil.dateToString;

public class Author {

    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private User user;
    private Date startDate;

    public Author() {
    }

    public Author(String name, String surname, String email, Gender gender, Date startDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;

        this.startDate = startDate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", user=" + user +
                ", startDate=" + dateToString(startDate) +
                '}';
    }
}