package activity.todo;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class ToDoActivity {
    public TextBox taskTitle;
    public TextBox taskNote;
    public Button saveButton;


    public ToDoActivity(){
        taskTitle= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        taskNote= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
}
