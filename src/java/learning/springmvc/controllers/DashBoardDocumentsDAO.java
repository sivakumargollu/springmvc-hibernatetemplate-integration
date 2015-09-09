/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author sivakumar
 */
public class DashBoardDocumentsDAO {

    HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    public void saveDashBoardDocuments(DashBoardDocuments boardDocuments) {
        template.save(boardDocuments);
    }

    public List<DashBoardDocuments> getDashBoardDocuments() {
        List<DashBoardDocuments> list = new ArrayList<DashBoardDocuments>();
        list = template.loadAll(DashBoardDocuments.class);
        return list;

    }
}
