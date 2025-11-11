package HomePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ATSHomepage extends BrowserLaunch{
	

		@FindBy(xpath="//span[contains(text(),'Supriyo Sen')]//parent::a[@class='nav-link']")
		WebElement loginuser;
		
		// Main Menu just for click
		@FindBy(xpath="//a[contains(text(),'Job Management')]")
		WebElement JobManagement;
		
		@FindBy(xpath="//a[contains(text(),'New Job')]")  
		WebElement NewJob;
		
		@FindBy(xpath="//a[contains(text(),'My Job')]")  
		WebElement MyJob;
		
		@FindBy(xpath="//a[contains(text(),'Talent Management')]")
		WebElement Talentmanagement;
		
		
		@FindBy(xpath="//a[contains(text(),'New Candidate')]")
		WebElement NewCandidate;
		
		
		@FindBy(xpath="//a[contains(text(),'Candidate List')]")
		WebElement ViewCandidate;
		
		@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/ul/li[3]/a")
		WebElement Admin_link;
		
		@FindBy(xpath="/html/body/div[1]/div/div/div/div[2]/ul/li[3]/ul/li[7]/a")
		WebElement Masters_List;
		WebDriver driver;
		public ATSHomepage() {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}

		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
		
		public String verifyLoggedinuser() {
			return loginuser.getText();
		}
		
		public void expandJobManagement() {
			JobManagement.click();
		}
		
		public JobManagement.NewJob validateNewJobPage() {
			JobManagement.click();
			NewJob.click();
			return new JobManagement.NewJob();
		}
		
		public JobManagement.MyJobPage validateMyJobPage() {
			JobManagement.click();
			MyJob.click();
			return new JobManagement.MyJobPage();
		}
		
		public void expandTalentManagement() {
			Talentmanagement.click();
		}
		
		public TalentManagement.NewCandidatePage addNewCandidate() {
			Talentmanagement.click();
			NewCandidate.click();
			return new TalentManagement.NewCandidatePage();
		}
		
		public TalentManagement.CandidateListpage validateCandidateList() {
			Talentmanagement.click();
			ViewCandidate.click();
			return new TalentManagement.CandidateListpage();
			
		}
		public TalentManagement.MastersListPage MastersListPage() {
			Admin_link.click();
			Masters_List.click();
			return MastersListPage();
					
		
		}

	}



