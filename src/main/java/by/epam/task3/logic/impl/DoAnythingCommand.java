
package by.epam.task3.logic.impl;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import by.epam.task3.controller.JspPageName;
import by.epam.task3.controller.RequestParameterName;
import by.epam.task3.dao.XMLDAOFactory;
import by.epam.task3.dao.XMLDao;
import by.epam.task3.dao.XMLDaoException;
import by.epam.task3.logic.CommandException;
import by.epam.task3.logic.ICommand;
public class DoAnythingCommand implements ICommand {
@Override
public String execute(HttpServletRequest request) throws CommandException {
String page = null;
XMLDao dao = null;
try {
dao = XMLDAOFactory.getInstance().getDAO(XMLDAOFactory.DAOType.SAX);
List<Object> info =
dao.parse(request.getParameter(RequestParameterName.FILE_NAME));
request.setAttribute(RequestParameterName.SIMPLE_INFO, info);
page = JspPageName.USER_PAGE;
} catch (XMLDaoException e) {
throw new CommandException("cann't get DAO", e);
}
return page;
}
}
