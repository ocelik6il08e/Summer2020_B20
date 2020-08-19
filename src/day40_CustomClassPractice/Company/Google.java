package day40_CustomClassPractice.Company;

import java.util.ArrayList;
import java.util.Arrays;

public class Google {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();


        offer1.setOfferInfo("William Henry","2020TX123654",85000,"Texas",true,true,false,
                "Manuel Tester",true);
        offer2.setOfferInfo("David W Elon","2020NY132652",45000,"New York",true,false,true,
                "Manuel Tester",false);
        offer3.setOfferInfo("Mustafa Tokatli","2020TR45632",33000,"TURKEY",true,true,true,
                "QA Tester",true);
        offer4.setOfferInfo("Jackson Yellowstone","2020UT36524",118000,"Utah",true,true,true,
                "QA Tester",true);
        offer5.setOfferInfo("Marry Johnston","2020FL163254",145000,"Florida",true,true,true,
                "SDET",true);

        ArrayList<Offer> jobOffer = new ArrayList<>();
        jobOffer.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));

        for(Offer each : jobOffer){
            each.getOfferInfo();
        }
        System.out.println("---------------------------------------------------------------");
        jobOffer.removeIf(p-> p.salary < 90000);
        System.out.println("Number of offers : "+jobOffer.size());

        System.out.println("---------------------------------------------------------------");

        jobOffer.removeIf(p-> p.isFullTime != true);
        System.out.println("Name of applicants :"+ jobOffer.size());


    }
}
