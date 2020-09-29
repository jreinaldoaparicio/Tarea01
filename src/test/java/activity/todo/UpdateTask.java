package activity.todo;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class UpdateTask {
    public Label updateTask;
    public CheckBox taskDoneCheck;
    public TextBox taskNote;
    public Button saveButton;
    public UpdateTask(){
        updateTask= new Label(By.xpath("//android.widget.TextView[@text='Testing01']"));
        taskDoneCheck = new CheckBox(By.id("com.vrproductiveapps.whendo:id/note_item_marked"));
        taskNote= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
}
