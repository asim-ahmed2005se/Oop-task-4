package ug.gov.nira.service;

public class NationalIdService {
    public Citizen verifyCitizen(String nin) {
        System.out.println("[NIRA Module] Verifying National ID for NIN: " + nin);
        if (nin != null && nin.startsWith("CM")) {
            return new Citizen(nin, "Kato Mugisha");
        }
        return null;
    }
}
//End of NIRA verification module