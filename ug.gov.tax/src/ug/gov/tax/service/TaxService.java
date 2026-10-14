package ug.gov.tax.service;

public class TaxService {
    public void processTaxCollection(TaxRecord record) {
        System.out.println("[Tax Module - URA] Processed tax payment of UGX " + record.getAmount() + " for NIN: " + record.getNin());
    }
}