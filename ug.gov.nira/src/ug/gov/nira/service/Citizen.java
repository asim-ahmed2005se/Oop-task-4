package ug.gov.nira.service;

public class Citizen {
    private String nin;
    private String fullName;

    public Citizen(String nin, String fullName) {
        this.nin = nin;
        this.fullName = fullName;
    }

    public String getNin() { return nin; }
    public String getFullName() { return fullName; }
}