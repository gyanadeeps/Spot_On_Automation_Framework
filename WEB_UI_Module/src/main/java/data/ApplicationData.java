package data;

import org.apache.commons.lang.RandomStringUtils;
import utilities.ReadWriteData;

import java.util.Properties;

public class ApplicationData {

    ReadWriteData rwd = new ReadWriteData();
    Properties p = new Properties();
    Properties p1 = new Properties();


    private static String randomString() {

        return RandomStringUtils.randomAlphanumeric(7);
    }

    public String USERNAME() {

        String username = "gyansahoo111@gmail.com";
        return username;
    }

    public String ACCOUNT_MANAGER_USERNAME() {

        String accountManagerUsername = "achin+accountmanager@vtechys.com";
        return accountManagerUsername;
    }

    public String CREATIVE_MANAGER_USERNAME() {

        String creativeManagerUsername = "achin+creativemanager@vtechys.com";
        return creativeManagerUsername;
    }

    public String PUBLISHERS_USERNAME() {

        String publisherUserName = "achin+publisher@vtechys.com";
        return publisherUserName;
    }

    public String TRAFFICKER_USERNAME() {

        String traffickerUsername = "achin+trafficker@vtechys.com";
        return traffickerUsername;
    }

    public String PASSWORD() {

        String password = System.getProperty("Password", "Huck@3012");
        return password;
    }

    public String PROPOSAL_NAME() {

        String proposalName = randomString() + " Automation";
        return proposalName;
    }


    public String PROPOSAL_NAME_AM() {

        String proposalNameAM = randomString() + " Automation";
        return proposalNameAM;
    }

    public String DESCRIPTION() {

        String description = "Test Proposals";
        return description;
    }

    public String START_DATE() {

        String startDate = "2022-06-10 04:14 pm";
        return startDate;
    }

    public String END_DATE() {

        String endDate = "2022-06-30 05:15 pm";
        return endDate;
    }

    public String WEB_URL() {

        String webURL = "https://www.spot-on.com";
        return webURL;
    }

    public String DESCRIPTION_NEW_VALUE() {

        String descriptionNewValue = "Test Description Edit Automation";
        return descriptionNewValue;
    }

    public int SIZE_INDEX() {

        int sizeIndex = ((int) (Math.round(Math.random() * 4)) + 1);
        return sizeIndex;
    }

    public int PLACEMENT_INDEX() {

        int placementIndex = ((int) (Math.round(Math.random() * 3)) + 1);
        return placementIndex;
    }

    public int UNIT_PRICE_INDEX() {

        int unitPriceIndex = ((int) (Math.round(Math.random() * 1)) + 1);
        return unitPriceIndex;
    }

    public String PUBLISHER_NAME() {

        String publisherName = randomString() + " Automation";
        return publisherName;
    }

    public String SEARCH_KEY_PUBLISHERS() {

        String searchKeyPublishers = PUBLISHER_NAME();
        return searchKeyPublishers;
    }

    public String EDIT_KEY_PUBLISHERS() {

        String editKeyPublishers = rwd.readPublisher(p);
        return editKeyPublishers;
    }

    public String DESCRIPTION_PUBLISHER() {

        String descriptionPublisher = "Test Publishers Page";
        return descriptionPublisher;
    }

    public String CITY() {

        String city = "San Francisco";
        return city;
    }

    public String MONTHLY_VISITORS() {

        String monthlyVisitors = "100000";
        return monthlyVisitors;
    }

    public String UNIT_NAME() {

        String unitName = "Test Unit";
        return unitName;
    }

    public String UNIT_COST() {

        String unitCost = "15";
        return unitCost;
    }

    public String UNIT_AVAILABILITY() {

        String unitAvailability = "2000";
        return unitAvailability;
    }

    public String CAMPAIGN_KEY() {
        String campaignKey = rwd.readData(p);
        return campaignKey;
    }

    public String CAMPAIGN_KEY_AM() {
        String campaignKeyAM = rwd.readDataAM(p1);
        return campaignKeyAM;
    }

    public String CREATIVE_KEY() {
        String creativeKey = rwd.readData(p);
        return creativeKey;
    }

    public String CREATIVE_KEY_AM() {
        String creativeKeyAM = rwd.readDataAM(p1);
        return creativeKeyAM;
    }

    public String SEARCH_KEY_PROPOSALS() {
        String searchKeyProposals = rwd.readData(p);
        return searchKeyProposals;
    }

    public String SEARCH_KEY_PROPOSALS_AM() {
        String searchKeyProposalsAM = rwd.readDataAM(p1);
        return searchKeyProposalsAM;
    }

    public String DESIRED_IMPRESSIONS() {
        String desiredImpressions = "100";
        return desiredImpressions;
    }

    public String ALLOCATED_BUDGET() {
        String allocatedBudget = "10";
        return allocatedBudget;
    }

    public String CAMPAIGN() {
        String campaign = rwd.readData(p);
        return campaign;
    }

    public String CAMPAIGN_AM() {
        String campaignAM = rwd.readDataAM(p1);
        return campaignAM;
    }

    public String CREATIVE_NAME() {
        String creativeName = rwd.readData(p) + " Creative";
        return creativeName;
    }

    public String CREATIVE_NAME_CM() {
        String creativeNameCM = rwd.readData(p1) + " Creative";
        return creativeNameCM;
    }

    public String COMPANY_NAME() {
        String companyName = randomString() + " Automation";
        return companyName;
    }

    public String DESCRIPTION_CLIENTS() {
        String descriptionClients = "Test Clients Page";
        return descriptionClients;
    }

    public String CONTACT_NAME() {
        String contactName = randomString();
        return contactName;
    }

    public String CONTACT_PHONE() {
        String contactPhone = "2345678901";
        return contactPhone;
    }

    public String CONTACT_EMAIL() {
        String contactEmail = "test@abc.com";
        return contactEmail;
    }

    public String STREET_ADDRESS() {
        String streetAddress = "AB Street 01";
        return streetAddress;
    }

    public String CITY_CLIENT() {
        String cityClient = "San Francisco";
        return cityClient;
    }

    public String EMAIL_ADDRESS() {
        String emailAddress = "test@abc.com";
        return emailAddress;
    }

    public String FIRST_NAME() {
        String firstName = randomString();
        return firstName;
    }

    public String LAST_NAME() {
        String lastName = randomString();
        return lastName;
    }

    public String SEARCH_KEY_CREATIVES() {
        String searchKeyCreatives = rwd.readData(p) + " Creative";
        return searchKeyCreatives;
    }

    public String SEARCH_KEY_NATIONAL_PUBLISHER() {
        String searchKeyNationalPublisher = "Gyan Test 1";
        return searchKeyNationalPublisher;
    }

    public String REJECTION_REASON() {
        String rejectionReason = "Test Reject";
        return rejectionReason;
    }

    public String USER_EMAIL() {
        String userEmail = "gyansahoo111@gmail.com";
        return userEmail;
    }


}


