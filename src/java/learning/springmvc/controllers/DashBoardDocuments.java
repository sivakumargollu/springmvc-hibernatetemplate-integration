/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.springmvc.controllers;

import java.util.Date;

/**
 *
 * @author sivakumar
 */
public class DashBoardDocuments {

    public int id;
    public String cmsUrl;
    public int userID;
    public Date dateTime;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCmsUrl() {
        return cmsUrl;
    }

    public void setCmsUrl(String cmsUrl) {
        this.cmsUrl = cmsUrl;
    }



    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
