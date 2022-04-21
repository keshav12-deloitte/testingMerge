package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.baseClass.BaseClass;

public class ProjectsPage extends BaseClass {

    @FindBy (xpath = "//a[normalize-space()='PROJECTS']")
    WebElement projectField;

    public ProjectsPage() {
        PageFactory.initElements(driver,this);
    }

    public String checkProjectFieldBtn(){
        projectField.click();
        String projectsUrl = driver.getCurrentUrl();
        return projectsUrl;
    }

    public void selectTechnology(){

    }
}
