/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.springmvc.controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sivakumar
 */
public class MultiActionControllerActions {

    public ModelAndView ParameterizedResolver(HttpServletRequest req, HttpServletResponse resp) {
        return new ModelAndView("ParameterizedResolver", "date", new Long(System.currentTimeMillis()));
    }

    public ModelAndView PropertiesBasedResolver(HttpServletRequest req, HttpServletResponse resp) {
        return new ModelAndView("PropertiesBasedResolver", "date", new Long(System.currentTimeMillis()));
    }

    public ModelAndView internalResolver(HttpServletRequest req, HttpServletResponse resp) {
        return new ModelAndView("InternalResolver", "date", new Long(System.currentTimeMillis()));
    }

    public ModelAndView dashBoradLander(HttpServletRequest req, HttpServletResponse res) {
        System.out.println("Debug stmt @ into dashboard lander");
        SpringHibernateUtils hibernateUtils = new SpringHibernateUtils();
        List list = hibernateUtils.getDashBoardDocuments(req);
        return new ModelAndView("dashboard", "dashBoardDocumentsList", list);
    }
}
