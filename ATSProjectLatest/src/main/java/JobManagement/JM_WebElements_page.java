package JobManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JM_WebElements_page {
	
	
	WebDriver driver;
	// JobManagement modules with submodules link
	public WebElement JM_Link = driver.findElement(By.xpath("//a[normalize-space()='Job Management']"));
	
	public WebElement MyJob_Link = driver.findElement(By.xpath("//a[@class='nav-link'][normalize-space()='My Jobs']"));
	public WebElement NewJob_Link = driver.findElement(By.xpath("//a[normalize-space()='New Job']"));
	public WebElement SearchJob_Link = driver.findElement(By.xpath("//a[normalize-space()='Search Jobs']"));
	public WebElement  JobDashboard_Link = driver.findElement(By.xpath("//a[normalize-space()='Jobs Dashboard']"));
	public WebElement  JobSubmissionsReport_Link = driver.findElement(By.xpath("//a[normalize-space()='Job Submissions Report']"));
	public WebElement  RecruitersSubmissionReport_Link = driver.findElement(By.xpath("//a[normalize-space()='Recruiters Submission Report']"));
	public WebElement  RecruitersInterviewReport_Link = driver.findElement(By.xpath("//a[normalize-space()='Recruiters Interview Report']"));
	public WebElement  RecruitersHiringReport_Link = driver.findElement(By.xpath("//a[normalize-space()='Recruiters Hiring Report']"));
	public WebElement  RecruitersActiveReport_Link = driver.findElement(By.xpath("//a[normalize-space()='Recruiters Active Report']"));
	
	
	// TalentManagement modules with submodules link
	public WebElement TM_Link = driver.findElement(By.xpath("//a[normalize-space()='Talent Management']"));
	
	public WebElement TalentSearch_Link = driver.findElement(By.xpath("//a[normalize-space()='Talent Search']"));
	public WebElement NewCandidate_Link = driver.findElement(By.xpath("//a[normalize-space()='New Candidate']"));
	public WebElement CandidatesHotlists_Link = driver.findElement(By.xpath("//a[normalize-space()='Candidates Hotlists']"));
	public WebElement SearchCandidateNotes_Link = driver.findElement(By.xpath("//a[normalize-space()='Search Candidate Notes']"));


	
	
	// Admin modules with submodules link
	public WebElement Admin_Link = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/ul/li[3]"));
		
	public WebElement CreateRecruiter_Link = driver.findElement(By.xpath("//a[normalize-space()='Create Recruiter']"));
	public WebElement RecruiterList_Link = driver.findElement(By.xpath("//a[normalize-space()='Recruiter List']"));
	public WebElement RoleAdministration_Link = driver.findElement(By.xpath("//a[normalize-space()='Role Administration']"));
	public WebElement CreateGroup_Link = driver.findElement(By.xpath("//a[normalize-space()='Create Group']"));
	public WebElement ManageDivisions_Link = driver.findElement(By.xpath("//a[normalize-space()='Manage Divisions']"));
	public WebElement ResumeParameters_Link = driver.findElement(By.xpath("//a[normalize-space()='Resume Parameters']"));
	public WebElement MasterList_Link = driver.findElement(By.xpath("//a[normalize-space()='//a[normalize-space()='Master List']"));
	public WebElement Notifications_Link = driver.findElement(By.xpath("//a[normalize-space()='//a[normalize-space()='Notifications']"));
	public WebElement ProductiveSettings_Link = driver.findElement(By.xpath("//a[normalize-space()='Productive Settings']"));
	
	
	// CRM modules with submodules link
	public WebElement CRM_Link = driver.findElement(By.xpath("//a[normalize-space()='CRM']"));
	
	
	public WebElement MyContacts_Link = driver.findElement(By.xpath("//a[normalize-space()='My Contacts']"));
	public WebElement SearchContacts_Link = driver.findElement(By.xpath("//a[normalize-space()='Search Contacts']"));
	public WebElement NewContact_Link = driver.findElement(By.xpath("//a[normalize-space()='New Contact']"));
	public WebElement CompanyList_Link = driver.findElement(By.xpath("//a[normalize-space()='Company List']"));
	public WebElement SearchCompanies_Link = driver.findElement(By.xpath("//a[normalize-space()='Search Companies']"));
	public WebElement NewCompany_Link = driver.findElement(By.xpath("//a[normalize-space()='New Company']"));
	public WebElement ContactHotlist_Link = driver.findElement(By.xpath("//a[normalize-space()='Contact Hotlist']"));


	// Toggle ON/Off button ( dark mode and light mode button)
	public WebElement SwitchOn_button = driver.findElement(By.xpath("//div[@class='react-switch-handle']"));
	public WebElement SwitchOFF_button = driver.findElement(By.xpath("//div[@class='react-switch-bg']"));
	
	
	// Bell Notification icon
	public WebElement BellNotification_icon = driver.findElement(By.xpath("//i[@class='icon_bell_alt']"));
	
	
	// User profile options icon
	public WebElement UerOptions = driver.findElement(By.xpath("//li[@class='dropdown show nav-item']//button[1]"));
		
	
	public WebElement DashboardLink = driver.findElement(By.xpath("//div[@class='img-user-option']"));
	WebElement profileButton = driver.findElement(By.className("dropdown-item"));
	public WebElement LogoutLink = driver.findElement(By.xpath("//span[normalize-space()='Logout']"));
	
	
	
	
	
	
	
}
