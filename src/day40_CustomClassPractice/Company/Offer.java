package day40_CustomClassPractice.Company;

public class Offer {

    String applicantName;
    String applicationID;
    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean WFH;
    String jobTitle;
    boolean hasBenefit;


    public void setOfferInfo(String applicantName, String applicationID, double salary, String state, boolean hasPTO, boolean isFullTime,
           boolean WFH ,String jobTitle, boolean hasBenefit) {

        this.applicantName = applicantName;
        this.applicationID = applicationID;
        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
        this.WFH = WFH;

    }
    public void getOfferInfo(){
        System.out.println("-------------- Applicant Information's ----------------");
        System.out.println("Name : "+applicantName);
        System.out.println("Offer ID :"+applicationID);
        System.out.println("Salary :$"+salary);
        System.out.println("Location :"+state);
        System.out.println("Paid Over-Time :"+hasPTO);
        System.out.println("Full Time Position :"+isFullTime);
        System.out.println("Job Title :"+jobTitle);
        System.out.println("Benefit(s) :"+hasBenefit);
        System.out.println("Work From Home Option :"+WFH);

    }

}
