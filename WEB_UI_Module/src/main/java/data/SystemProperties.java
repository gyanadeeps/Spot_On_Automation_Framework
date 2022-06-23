package data;

import org.apache.commons.lang.RandomStringUtils;
import utilities.ReadWriteData;

import static java.lang.System.getProperty;

public interface SystemProperties {

    //ReadWriteData rwd = new ReadWriteData();


    String randomString = RandomStringUtils.randomAlphanumeric(7);

    String USERDIR = System.getProperty("user.dir");
    String FILE_SEPERATOR = System.getProperty("file.separator");

   // public static final String AUTOMATE_USERNAME = "gsahoo_H9WwOn";
  //  public static final String AUTOMATE_ACCESS_KEY = "kxcLz1kAScjLqRpxyPro";

     public static final String AUTOMATE_USERNAME = "gyanadeepsahoo2";
     public static final String AUTOMATE_ACCESS_KEY = "yrg5n87bJ8XT3YzX5wST";


    String RESOURCES_FOLDER_PATH = USERDIR + FILE_SEPERATOR + "src"
            + FILE_SEPERATOR + "main" + FILE_SEPERATOR + "resources" + FILE_SEPERATOR +"sportsCategory"+FILE_SEPERATOR;

    String BUILD_NUMBER = System.getenv("BUILD_NUMBER");
    String BUILD_ID = System.getenv("BUILD_ID");
    String BUILD_URL = System.getenv("BUILD_URL");
    String ARTIFACTFOLDER = USERDIR + FILE_SEPERATOR + "Artifacts" + FILE_SEPERATOR ;
    String FAILEDSCREENSHOTFOLDER = ARTIFACTFOLDER + "failedScreenshots" + FILE_SEPERATOR;

    String CSV_FOLDER_PATH = System.getProperty("folder.path","");
    String SUITENAME = System.getProperty("SUITE", "testng");

    String DRIVER_TYPE = System.getProperty("DRIVER", "CHROME");
    String USERNAME = System.getProperty("Username","gyansahoo111@gmail.com");

    String ACCOUNT_MANAGER_USERNAME = System.getProperty("AccountManagerUsername","achin+accountmanager@vtechys.com");
    String CREATIVE_MANAGER_USERNAME = System.getProperty("CreativeManagerUsername","achin+creativemanager@vtechys.com");

    String PASSWORD = System.getProperty("Password","Huck@3012");
    String REMOTE_DRIVER_STATUS = System.getProperty("remote.driver.status", "DISABLED");
   // String REMOTE_URL = getProperty("remote.url", "http://54.226.11.199:4444/wd/hub");
    String REMOTE_URL = System.getProperty("remote.url", "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub");

    String AUTHENTICATION_REQUIRED=System.getProperty("Authentication_Required", "Yes");
    String SPOT_ON_URL =System.getProperty("URL", "http://dev.spot-on.com/");
    String AWS_BUILD = System.getProperty("AWS_BUILD", "sched");



    String PROPOSAL_NAME = System.getProperty("ProposalName",randomString+" Automation");
    String DESCRIPTION = System.getProperty("Description","Test Proposals");
    String START_DATE = System.getProperty("StartDate","2022-06-10 04:14 pm");
    String END_DATE = System.getProperty("EndDate","2022-06-30 05:15 pm");
    String WEB_URL = System.getProperty("ClickTagURL","https://www.spot-on.com");

    String DESCRIPTION_NEW_VALUE = System.getProperty("NewDescription","Test Description Edit Automation");

    int SIZE_INDEX = ((int)(Math.round(Math.random()*4))+1);
    int PLACEMENT_INDEX = ((int)(Math.round(Math.random()*3))+1);
    int UNIT_PRICE_INDEX = ((int)(Math.round(Math.random()*1))+1);

    String PUBLISHER_NAME = System.getProperty("PublisherName",randomString+" Automation");
    String DESCRIPTION_PUBLISHER = System.getProperty("PublisherDescription","Test Publishers Page");
    String CITY = System.getProperty("City","San Francisco");
    String MONTHLY_VISITORS = System.getProperty("MonthlyVisitors","100000");
    String UNIT_NAME = System.getProperty("UnitName","Test Unit");
    String UNIT_COST = System.getProperty("UnitCost","15");
    String UNIT_AVAILABILITY = System.getProperty("Availability","2000");

    //String campaignKey = System.getProperty("CampaignKey", rwd.getStr());
    String campaignKey = System.getProperty("CampaignKey","gnLkqxN Automation");
    String campaignKeyAM = System.getProperty("CampaignKeyAM","uf23PI6 Automation");

    //String creativeKey = System.getProperty("CreativeKey","R08tC Automation");
    String creativeKey = System.getProperty("CreativeKey","wLT8Qrc Automation");
    String creativeKeyAM = System.getProperty("CreativeKeyAM","rtZ79 Automation");

    String SEARCH_KEY_PROPOSALS = System.getProperty("SearchKeyProposals",campaignKey);
    String SEARCH_KEY_PROPOSALS_AM = System.getProperty("SearchKeyProposalsAM",campaignKeyAM);
    String DESIRED_IMPRESSIONS = System.getProperty("DesiredImpressions", "1000");
    String ALLOCATED_BUDGET = System.getProperty("AllocatedBudget","10");

    //String STATE_NAME = System.getProperty("StateName","California ");

    //Creative Page Details
    String CAMPAIGN = System.getProperty("Campaign",creativeKey);
    String CAMPAIGN_AM = System.getProperty("CampaignAM",creativeKeyAM);
    String CREATIVE_NAME = System.getProperty("CreativeName",creativeKey+" Creative");
    String CREATIVE_NAME_CM = System.getProperty("CreativeNameCM",creativeKeyAM+" Creative");


    //Client Page Details
    String COMPANY_NAME = System.getProperty("CompanyName",randomString+" Automation");
    String DESCRIPTION_CLIENTS = System.getProperty("ClientsDescription","Test Clients Page");
    String CONTACT_NAME = System.getProperty("ContactName", randomString);
    String CONTACT_PHONE = System.getProperty("ContactPhone","2345678901");
    String CONTACT_EMAIL = System.getProperty("ContactEmail","test@abc.com");
    String STREET_ADDRESS = System.getProperty("StreetAddress","AB Street 01");
    String CITY_CLIENT = System.getProperty("ClientCity","San Francisco");


    boolean SCREENSHOT_ON_EVERY_STEP = Boolean.parseBoolean(getProperty("screenshot_on_every_step"));

    int RETRY_COUNT = 2;

    //Users Page Details
    String PUBLISHERS_USERNAME = System.getProperty("PublishersName","achin+publisher@vtechys.com");
    String EMAIL_USERS = System.getProperty("EmailUsers","test@abc.com");
    String FIRST_NAME = System.getProperty("FirstName",randomString);
    String LAST_NAME = System.getProperty("LastName",randomString);

    //Creatives Publisher Page
    String SEARCH_KEY_CREATIVES = System.getProperty("SearchKeyCreatives",creativeKey+" Creative");



}