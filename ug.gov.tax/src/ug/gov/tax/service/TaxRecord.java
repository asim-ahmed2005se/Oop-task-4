package ug.gov.tax.service;

public class TaxRecord {
    private String nin;
    private double amount;

    public TaxRecord(String nin, double amount) {
        this.nin = nin;
        this.amount = amount;
    }

    public String getNin() { return nin; }
    public double getAmount() { return amount; }
}
