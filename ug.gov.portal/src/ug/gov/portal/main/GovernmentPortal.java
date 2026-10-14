package ug.gov.portal.main;

import ug.gov.nira.service.Citizen;
import ug.gov.nira.service.NationalIdService;
import ug.gov.tax.service.TaxRecord;
import ug.gov.tax.service.TaxService;
import ug.gov.passport.service.PassportService;
import ug.gov.business.service.BusinessService;

public class GovernmentPortal {
    public static void main(String[] args) {
        System.out.println("=== UGANDA E-GOVERNMENT SERVICES PORTAL ===");

        String citizenNin = "CM200598765432";

        NationalIdService niraService = new NationalIdService();
        Citizen citizen = niraService.verifyCitizen(citizenNin);

        if (citizen != null) {
            System.out.println("Citizen Verified: " + citizen.getFullName() + "\n");

            TaxService taxService = new TaxService();
            TaxRecord taxRecord = new TaxRecord(citizen.getNin(), 300000.0);
            taxService.processTaxCollection(taxRecord);

            PassportService passportService = new PassportService();
            passportService.issuePassport(citizen.getNin(), citizen.getFullName());

            BusinessService businessService = new BusinessService();
            businessService.registerBusiness("Kampala Innovations Ltd", citizen.getNin());

        } else {
            System.out.println("Verification Failed. Access Denied.");
        }
    }
}
//Portal execution finished successfully