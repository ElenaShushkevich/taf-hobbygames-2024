package by.hobbygames.api;

import java.util.Objects;

public class Errors {

    private String phone;
    private String password;
    private String login;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Errors errors = (Errors) o;
        return Objects.equals(phone, errors.phone) && Objects.equals(password, errors.password) && Objects.equals(login, errors.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, password, login);
    }

    @Override
    public String toString() {
        return "Errors{" +
                "phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
