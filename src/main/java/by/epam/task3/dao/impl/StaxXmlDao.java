
package by.epam.task3.dao.impl;


import by.epam.task3.dao.XMLDao;
import by.epam.task3.dao.XMLDaoException;
import java.util.ArrayList;
import java.util.List;
public final class StaxXmlDao implements XMLDao{
private final static SaxXmlDao instance = new SaxXmlDao();
public static XMLDao getInstance(){
return instance;
}
@Override
public List<Object> parse(String resourceName) throws XMLDaoException{
// stub
List<Object> list = new ArrayList<>();
list.add("First string from SAX DAO");
list.add("Second string from SAX DAO");
return list;
}
}
