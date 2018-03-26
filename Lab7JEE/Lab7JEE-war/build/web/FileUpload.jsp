<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">
        
       <h1>Upload File</h1>

        <html:form action="/FileUpload" enctype = "multipart/form-data">
            <table border="0">
                <tbody>
                    <tr>
                        <td colspan="2">
                            <html:file property="uploadFile" />
                            &nbsp;</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Submit" /></td>
                    </tr>
                </tbody>
            </table>
        </html:form>
    </body>
</html:html>
