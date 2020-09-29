package testClean;

import activity.todo.MainActivity;
import activity.todo.ToDoActivity;
import activity.todo.UpdateTask;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class ToDoActivityTest {

    MainActivity mainActivity= new MainActivity();
    ToDoActivity toDoActivity= new ToDoActivity();
    UpdateTask updateTask = new UpdateTask();
    String nameTask="Test01";
    String noteTask="Testing01";

    @Test
    public void verifyCreateTask() throws MalformedURLException {

        mainActivity.addTask.click(nameTask);
        toDoActivity.taskTitle.type(nameTask);
        toDoActivity.taskNote.type(noteTask);
        toDoActivity.saveButton.click(nameTask);
        // Verificacion
        Assert.assertTrue("ERROR, la tarea no esta creada",mainActivity.isDisplayedTask(nameTask));

    }

    @After
    public void verifyUpdateTask() throws MalformedURLException {
        String noteTask="Task Checked As Done";
        updateTask.updateTask.click(nameTask);
        updateTask.taskDoneCheck.click(nameTask);
        updateTask.taskNote.type(noteTask);
        updateTask.saveButton.click(nameTask);

        // Verificacion
        Assert.assertTrue("ERROR, la tarea no fue actualizada ",mainActivity.isDisplayedTask(nameTask));


    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
