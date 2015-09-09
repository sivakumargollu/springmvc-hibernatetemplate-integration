/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.springmvc.controllers;

import com.sun.tools.jxc.ApBasedTask;
import java.util.List;
import javax.faces.application.Application;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import learning.springmvc.controllers.DashBoardDocuments;
import learning.springmvc.controllers.DashBoardDocumentsDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringHibernateUtils {

    public List getDashBoardDocuments(HttpServletRequest req) {
//        Resource r = new ClassPathResource("//WEB-INF/applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(r);
        ServletContext servletContext = req.getServletContext();
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        DashBoardDocumentsDAO dao = (DashBoardDocumentsDAO) applicationContext.getBean("d");
        DashBoardDocuments boardDoc = new DashBoardDocuments();
        boardDoc.setCmsUrl("www.google.com");
        boardDoc.setUserID(41875);
        dao.saveDashBoardDocuments(boardDoc);
        return dao.getDashBoardDocuments();
    }
}
