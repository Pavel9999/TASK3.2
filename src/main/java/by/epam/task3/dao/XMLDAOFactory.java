
package by.epam.task3.dao;


import by.epam.task3.dao.impl.DOMXmlDao;
import by.epam.task3.dao.impl.SaxXmlDao;
import by.epam.task3.dao.impl.StaxXmlDao;
public class XMLDAOFactory {
    
private final static XMLDAOFactory instance = new XMLDAOFactory();

public static XMLDAOFactory getInstance() {
    
        return instance;
}
public XMLDao getDAO(DAOType type) throws XMLDaoException {
XMLDao dao;
switch (type) {
case SAX:
return SaxXmlDao.getInstance();
case STAX:
return StaxXmlDao.getInstance();
case DOM:
return DOMXmlDao.getInstance();


default:
throw new XMLDaoException("No sucj DAO");
}
}

public enum DAOType {
SAX, STAX, DOM;
}
}
