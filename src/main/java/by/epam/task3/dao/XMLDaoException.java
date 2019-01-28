
package by.epam.task3.dao;


import by.epam.task3.exception.ProjectException;
public class XMLDaoException extends ProjectException {
private static final long serialVersionUID = 1L;
public XMLDaoException(String msg){
super(msg);
}
public XMLDaoException(String msg, Exception e){
super(msg, e);
}
}
