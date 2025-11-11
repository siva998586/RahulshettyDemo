package Dashboard;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import LaunchBrowserTest.ATSLoginTest;

public class HomeDashboard_LinksTest {
	WebDriver driver;
	HomeDashboard_LinksPage HomepageLinks;
	String Homepage= "http://192.168.1.96/#/dashboard";
	 
	@Test(priority=0)
	public void BrowserLaunch() throws InterruptedException {
		ATSLoginTest launch = new ATSLoginTest();
		 driver = launch.BrowserLaunch();
		launch.EnterLoginCredentials();
		HomepageLinks = new HomeDashboard_LinksPage(driver);
	}
	
	
	@Test(priority=1)
	public void  HD_MyJob() throws InterruptedException {
		HomepageLinks.HD_MyJobs_Link().click();
		
		
		  String currentURL = driver.getCurrentUrl(); String ExpectedURL = "http://192.168.1.96/#/jobdetails"; 
		  if(currentURL.equals(ExpectedURL)) {
				 Assert.assertEquals(currentURL, ExpectedURL,  "HD_MyJob link is  working");
			 System.out.println("HD_MyJob link is  working"); }
		 else 	{
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_MyJob link is  working");
			 System.out.println("HD_MyJob link is not working"); 
		 }
		 
		Thread.sleep(3000);
		
		driver.navigate().to(Homepage);
		Thread.sleep(3000);
			
	}
	@Test(priority=2)
	public void HD_NewJob() throws InterruptedException {
		HomepageLinks.HD_NewJob_Link().click();
		
		  String currentURL = driver.getCurrentUrl(); 
		  String ExpectedURL = "http://192.168.1.96/#/job";
		 if(currentURL.equals(ExpectedURL)) {
				 Assert.assertEquals(currentURL, ExpectedURL,  "New Job link is  working");
			 System.out.println("New Job link is  working"); }
		 else 	{
			 Assert.assertEquals(currentURL, ExpectedURL,  "New Job link is  working");
			 System.out.println("New Job link is not working"); 
		 }

		 Thread.sleep(3000);
		 driver.navigate().to(Homepage); 
	}
	
	
	@Test(priority=3)
	public void HD_SearchJobs() throws InterruptedException {
		HomepageLinks.HD_SearchJobs_Link().click();
				String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/searchjobs";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_SearchJobs link is  working");
		 System.out.println("HD_SearchJobs link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_SearchJobs link is  working");
		 System.out.println("HD_SearchJobs link is not working"); 
	 }
		 
		Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	@Test(priority=4)
	public void HD_JobsDashboard() throws InterruptedException {
		HomepageLinks.HD_JobsDashboard_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/jobsDashboard";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_JobsDashboard link is  working");
		 System.out.println("HD_JobsDashboard link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_JobsDashboard link is  working");
		 System.out.println("HD_JobsDashboard link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}

	
	@Test(priority=5)
	public void HD_JobSubmissionReport() throws InterruptedException {
		HomepageLinks.HD_JobSubmissionReport_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/jobsubmissions";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_JobSubmissionReport link is  working");
		 System.out.println("HD_JobSubmissionReport link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_JobSubmissionReport link is  working");
		 System.out.println("HD_JobSubmissionReport link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	@Test(priority=6)
	public void HD_RecruitersSubmissionReport() throws InterruptedException {
		HomepageLinks.HD_RecruitersSubmissionReport_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/recruiterReports";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruitersSubmissionReport link is  working");
		 System.out.println("HD_RecruitersSubmissionReport link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruitersSubmissionReport link is  working");
		 System.out.println("HD_RecruitersSubmissionReport link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=7)
	public void HD_RecruitersInterviewReport() throws InterruptedException {
		HomepageLinks.HD_RecruitersInterviewReport_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/recruiterinterviewReports";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruitersInterviewReport link is  working");
		 System.out.println("HD_RecruitersInterviewReport link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruitersInterviewReport link is  working");
		 System.out.println("HD_RecruitersInterviewReport link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=8)
	public void HD_RecruitersHiringReport() throws InterruptedException {
		HomepageLinks.HD_RecruitersHiringReport_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/recruiterhiringReports";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruitersHiringReport link is  working");
		 System.out.println("HD_RecruitersHiringReport link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruitersHiringReport link is  working");
		 System.out.println("HD_RecruitersHiringReport link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=9)
	public void HD_RecruitersActiveReport() throws InterruptedException {
		HomepageLinks.HD_RecruitersActiveReport_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/recruiteractiveReports";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruitersActiveReport link is  working");
		 System.out.println("HD_RecruitersActiveReport link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruitersActiveReport link is  working");
		 System.out.println("HD_RecruitersActiveReport link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	// Talent Search
	
	@Test(priority=10)
	public void HD_TalentSearch() throws InterruptedException {
		HomepageLinks.HD_TalentSearch_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/talentSearch";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_TalentSearch link is  working");
		 System.out.println("HD_TalentSearch link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_TalentSearch link is  working");
		 System.out.println("HD_TalentSearch link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	@Test(priority=11)
	public void HD_NewCandidate() throws InterruptedException {
		HomepageLinks.HD_NewCandidate_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/candidate";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_NewCandidate link is  working");
		 System.out.println("HD_NewCandidate link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_NewCandidate link is  working");
		 System.out.println("HD_NewCandidate link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	@Test(priority=12)
	public void HD_CandidateHotlists() throws InterruptedException {
		HomepageLinks.HD_CandidateHotlists_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/candidateHotlist";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CandidateHotlists link is  working");
		 System.out.println("HD_CandidateHotlists link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CandidateHotlists link is  working");
		 System.out.println("HD_CandidateHotlists link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=13)
	public void HD_SearchCandidateNotes() throws InterruptedException {
		HomepageLinks.HD_SearchCandidateNotes_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/searchCandidateNotes";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_SearchCandidateNotes link is  working");
		 System.out.println("HD_SearchCandidateNotes link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_SearchCandidateNotes link is  working");
		 System.out.println("HD_SearchCandidateNotes link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	@Test(priority=14)
	public void HD_CandidateList() throws InterruptedException {
		HomepageLinks.HD_CandidateList_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/resumesList";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CandidateList link is  working");
		 System.out.println("HD_CandidateList link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CandidateList link is  working");
		 System.out.println("HD_CandidateList link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	// Admin
	
	
	@Test(priority=15)
	public void HD_CreateRecruiter() throws InterruptedException {
		HomepageLinks.HD_CreateRecruiterLink().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/recruiter";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CreateRecruiter link is  working");
		 System.out.println("HD_CreateRecruiter link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CreateRecruiter link is  working");
		 System.out.println("HD_CreateRecruiter link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=16)
	public void HD_RecruiterList() throws InterruptedException {
		HomepageLinks.HD_RecruiterList_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/list-recruiter";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruiterList link is  working");
		 System.out.println("HD_RecruiterList link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RecruiterList link is  working");
		 System.out.println("HD_RecruiterList link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=17)
	public void HD_RoleAdministration() throws InterruptedException {
		HomepageLinks.HD_RoleAdministration_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/create-role";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RoleAdministration link is  working");
		 System.out.println("HD_RoleAdministration link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_RoleAdministration link is  working");
		 System.out.println("HD_RoleAdministration link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=18)
	public void HD_CreateGroup() throws InterruptedException {
		HomepageLinks.HD_CreateGroup_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/create-group";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CreateGroup link is  working");
		 System.out.println("HD_CreateGroup link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CreateGroup link is  working");
		 System.out.println("HD_CreateGroup link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	@Test(priority=19)
	public void HD_ManageDivisions() throws InterruptedException {
		HomepageLinks.HD_ManageDivisions_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/User-Divisions";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_ManageDivisions link is  working");
		 System.out.println("HD_ManageDivisions link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_ManageDivisions link is  working");
		 System.out.println("HD_ManageDivisions link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=20)
	public void HD_ResumeParameters() throws InterruptedException {
		HomepageLinks.HD_ResumeParameters_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/ResumeParameters";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_ResumeParameters link is  working");
		 System.out.println("HD_ResumeParameters link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_ResumeParameters link is  working");
		 System.out.println("HD_ResumeParameters link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=21)
	public void HD_MasterList() throws InterruptedException {
		HomepageLinks.HD_MasterList_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/Master_List";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_MasterList link is  working");
		 System.out.println("HD_MasterList link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_MasterList link is  working");
		 System.out.println("HD_MasterList link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=22)
	public void HD_Notifications() throws InterruptedException {
		HomepageLinks.HD_Notifications_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/notification";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_MasterList link is  working");
		 System.out.println("HD_MasterList link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_MasterList link is  working");
		 System.out.println("HD_MasterList link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=23)
	public void HD_ProductiveSettings() throws InterruptedException {
		HomepageLinks.HD_ProductiveSettings_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/Productive-Settings";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_ProductiveSettings link is  working");
		 System.out.println("HD_ProductiveSettings link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_ProductiveSettings link is  working");
		 System.out.println("HD_ProductiveSettings link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=24)
	public void HD_MyContacts() throws InterruptedException {
		HomepageLinks.HD_MyContacts_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/contactList";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_MyContacts link is  working");
		 System.out.println("HD_MyContacts link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_MyContacts link is  working");
		 System.out.println("HD_MyContacts link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=25)
	public void HD_SearchContacts() throws InterruptedException {
		HomepageLinks.HD_SearchContacts_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/search_contacts";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_SearchContacts link is  working");
		 System.out.println("HD_SearchContacts link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_SearchContacts link is  working");
		 System.out.println("HD_SearchContacts link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=26)
	public void HD_NewContact() throws InterruptedException {
		HomepageLinks.HD_NewContact_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/new_contact";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_NewContact link is  working");
		 System.out.println("HD_NewContact link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_NewContact link is  working");
		 System.out.println("HD_NewContact link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=27)
	public void HD_CompanyList() throws InterruptedException {
		HomepageLinks.HD_CompanyList_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/companylist";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CompanyList link is  working");
		 System.out.println("HD_CompanyList link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_CompanyList link is  working");
		 System.out.println("HD_CompanyList link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=28)
	public void HD_SearchCompanies() throws InterruptedException {
		HomepageLinks.HD_SearchCompanies_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/searchCompanies";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_SearchCompanies link is  working");
		 System.out.println("HD_SearchCompanies link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_SearchCompanies link is  working");
		 System.out.println("HD_SearchCompanies link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	@Test(priority=29)
	public void HD_NewCompany() throws InterruptedException {
		HomepageLinks.HD_NewCompany_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/new_company";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_NewCompany link is  working");
		 System.out.println("HD_NewCompany link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_NewCompany link is  working");
		 System.out.println("HD_NewCompany link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
	
	@Test(priority=30)
	public void HD_ContactHotlists() throws InterruptedException {
		HomepageLinks.HD_ContactHotlists_Link().click();
		
		String currentURL = driver.getCurrentUrl();
		String ExpectedURL = "http://192.168.1.96/#/Contact_hotlist";
		if(currentURL.equals(ExpectedURL)) {
			 Assert.assertEquals(currentURL, ExpectedURL,  "HD_ContactHotlists link is  working");
		 System.out.println("HD_ContactHotlists link is  working"); }
	 else 	{
		 Assert.assertEquals(currentURL, ExpectedURL,  "HD_ContactHotlists link is  working");
		 System.out.println("HD_ContactHotlists link is not working"); 
	 }
		 Thread.sleep(3000);
		 driver.navigate().back();
	}
	
}
