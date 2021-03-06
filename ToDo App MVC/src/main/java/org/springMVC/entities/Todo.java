package org.springMVC.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletContext;
import java.util.Date;

public class Todo
{

    private String todoTitle;
    private String todoContent;
    private Date todoDate;

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    public Date getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(Date todoDate) {
        this.todoDate = todoDate;
    }

    public Todo() {
    }

    public Todo(String todoTitle, String todoContent, Date todoDate) {
        this.todoTitle = todoTitle;
        this.todoContent = todoContent;
        this.todoDate = todoDate;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoTitle='" + todoTitle + '\'' +
                ", todoContent='" + todoContent + '\'' +
                ", todoDate=" + todoDate +
                '}';
    }
}
