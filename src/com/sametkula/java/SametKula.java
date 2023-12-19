package com.sametkula.java;

import java.util.List;

public class SametKula {

    private final String name = "Samet";
    private final String Surname = "Kula";
    private final Status currentStatus = Status.LEARNING;
    public List<String> languages = List.of("Turkish", "English");
    public String expertise = "back-end";


    public SametKula(List<String> languages, String expertise) {
        this.languages = languages;
        this.expertise = expertise;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "SametKula{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", currentStatus=" + currentStatus +
                ", languages=" + languages +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}

enum Status {

    LEARNING, WORKING, FREELANCE
}
