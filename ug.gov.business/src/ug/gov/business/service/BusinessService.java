package ug.gov.business.service;

public class BusinessService {
    public void registerBusiness(String businessName, String ownerNin) {
        System.out.println("[Business Module - URSB] Successfully registered '" + businessName + "' for owner NIN: " + ownerNin);
    }
}
//URSB business registration handler