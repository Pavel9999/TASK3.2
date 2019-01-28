
package by.epam.task3.logic.impl;


import javax.servlet.http.HttpServletRequest;
import by.epam.task3.controller.JspPageName;
import by.epam.task3.logic.CommandException;
import by.epam.task3.logic.ICommand;
public class NoSuchCommand implements ICommand {
@Override
public String execute(HttpServletRequest request) throws CommandException {
// stub
return JspPageName.ERROR_PAGE;
}
}
