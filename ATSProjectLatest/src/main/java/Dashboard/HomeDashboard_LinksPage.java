package Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeDashboard_LinksPage {
	
	private WebDriver driver;
	    public HomeDashboard_LinksPage(WebDriver driver) {
        this.driver = driver;
    }
    
    // Home Dashboard links -> Job Management
    
    public WebElement HD_MyJobs_Link() {
        return driver.findElement(By.linkText("My Jobs"));
    }

    public WebElement HD_NewJob_Link() {   // Adjust the timeout as needed.
    	return driver.findElement(By.linkText("New Job"));

    }
    
    public WebElement HD_SearchJobs_Link() {
        return driver.findElement(By.linkText("Search Jobs"));
    }
    
    public WebElement HD_JobsDashboard_Link() {
        return driver.findElement(By.linkText("Jobs Dashboard"));
    }
    
    public WebElement HD_JobSubmissionReport_Link() {
        return driver.findElement(By.linkText("Job Submission Report"));
    }
    
    public WebElement HD_RecruitersSubmissionReport_Link() {
        return driver.findElement(By.linkText("Recruiters Submission Report"));
    }
    
    public WebElement HD_RecruitersInterviewReport_Link() {
        return driver.findElement(By.linkText("Recruiters Interview Report"));
    }
    
    public WebElement HD_RecruitersHiringReport_Link() {
        return driver.findElement(By.linkText("Recruiters Hiring Report"));
    }
    
    public WebElement HD_RecruitersActiveReport_Link() {
        return driver.findElement(By.linkText("Recruiters Active Report"));
    }
    
    
    //Home Dashboard Links-> Talent Management
    
    public WebElement HD_TalentSearch_Link() {
        return driver.findElement(By.linkText("Talent Search"));
    }
    
    public WebElement HD_NewCandidate_Link() {
        return driver.findElement(By.linkText("New Candidate"));
    }
    

    public WebElement HD_CandidateHotlists_Link() {
        return driver.findElement(By.linkText("Candidate Hotlists"));
    }
    
    public WebElement HD_SearchCandidateNotes_Link() {
        return driver.findElement(By.linkText("Search Candidate Notes"));
    }
    
    public WebElement HD_CandidateList_Link() {
        return driver.findElement(By.linkText("Candidate List"));
    }
    
    
    //Home Dashboard -> Admin
    
    public WebElement HD_CreateRecruiterLink() {
        return driver.findElement(By.linkText("Create Recruiter"));
    }
    
    public WebElement HD_RecruiterList_Link() {
        return driver.findElement(By.linkText("Recruiter List"));
    }
    
    public WebElement HD_RoleAdministration_Link() {
        return driver.findElement(By.linkText("Role Administration"));
    }
    
    public WebElement HD_CreateGroup_Link() {
        return driver.findElement(By.linkText("Create Group"));
    }
    
    public WebElement HD_ManageDivisions_Link() {
        return driver.findElement(By.linkText("Manage Divisions"));
    }
    
    public WebElement HD_ResumeParameters_Link() {
        return driver.findElement(By.linkText("Resume Parameters"));
    }
    
    public WebElement HD_MasterList_Link() {
        return driver.findElement(By.linkText("Master List"));
    }
    
    public WebElement HD_Notifications_Link() {
        return driver.findElement(By.linkText("Notifications"));
    }
    
    public WebElement HD_ProductiveSettings_Link() {
        return driver.findElement(By.linkText("Productive Settings"));
    }
    
    
    // Home DAshboard Links -> CRM 
    
    public WebElement HD_MyContacts_Link() {
        return driver.findElement(By.linkText("My Contacts"));
    }
    
    public WebElement HD_SearchContacts_Link() {
        return driver.findElement(By.linkText("Search Contacts"));
    }
    
    public WebElement HD_NewContact_Link() {
        return driver.findElement(By.linkText("New Contact"));
    }
    
    public WebElement HD_CompanyList_Link() {
        return driver.findElement(By.linkText("Company List"));
    }
    
    public WebElement HD_SearchCompanies_Link() {
        return driver.findElement(By.linkText("Search Companies"));
    }
    
    public WebElement HD_NewCompany_Link() {
        return driver.findElement(By.linkText("New Company"));
    }
    
    public WebElement HD_ContactHotlists_Link() {
        return driver.findElement(By.linkText("Contact Hotlists"));
    }
    
     
    
}




