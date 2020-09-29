package activity.todo;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addTask;
    public Button updateTask;

    public MainActivity(){
        addTask= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    }

    public boolean isDisplayedTask(String nameTask){
        String locator="//android.widget.TextView[@text='"+nameTask+"']";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }
}
