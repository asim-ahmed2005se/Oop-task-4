package ug.gov.passport.service;

public class PassportService {
    public void issuePassport(String nin, String fullName) {
        System.out.println("[Passport Module - DCIC] Issuing e-Passport for: " + fullName + " (NIN: " + nin + ")");
    }
}
//Passport service ready for production