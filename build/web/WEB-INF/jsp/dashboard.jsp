<%@page import="learning.springmvc.controllers.DashBoardDocuments"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <% List myMap = (List) request.getAttribute("dashBoardDocumentsList");
            Iterator ite = myMap.iterator();
            DashBoardDocuments boardDocuments;
            String str="";
            while(ite.hasNext()){
                    boardDocuments = (DashBoardDocuments)ite.next();
                    str += boardDocuments.getDateTime()+"</br>";
                    str += boardDocuments.getCmsUrl()+"</br>";

            }
         %>

    <body>
       <fieldset width="50%" height="40%">
            <legend>Projects Dashboard</legend>
                <%=str%>
        </fieldset>
    </body>
</html>
