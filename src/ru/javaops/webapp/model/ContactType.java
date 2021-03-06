package ru.javaops.webapp.model;

public enum ContactType {
    PHONE("Телефон: "),
    SKYPE("Skype: "),
    EMAIL("Почта: "),
    LINKEDIN("LinkedIn: "),
    GITHUB("GitHub: "),
    STACKOVERFLOW("Stackoverflow ");

    private String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
