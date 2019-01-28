
package by.epam.task3.logic;


import javax.servlet.http.HttpServletRequest;
public interface ICommand {
public String execute(HttpServletRequest request) throws CommandException;
}
