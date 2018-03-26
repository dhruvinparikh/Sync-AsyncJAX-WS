# Sync-AsyncJAX-WS
Using a JSP file, add a file upload control to upload a file and use an Action class and
Action Form bean to send the results to a web service. The simplest way to do this is to use
the provied Struts form below and POST it to a Struts action (<ACTION>.do). You can
however, do this anyway you want.
- Your EE solution should contain a Web Application containing the struts framework and a
JSP file to do the file upload, and a Web Application with a Web Service method to receive
the file.
- The Web Service does not need to store the file, but should receive the file contents and
return the file size in bytes (as an Integer).
- The Web Service should have a Thread.Sleep() method to make the method wait 10
seconds before returning the file size in bytes to simulate writing the contents to a file.
- Set MTOM on your Web Service with a Threshold of 50 kilobytes.
- Display the size in bytes on a JSP page after the file has been uploaded.
- Call the Async method of your Web Service method right before calling the Synchronous
method. The Async method should not wait for the Web Service method to complete, and
move on to your Synchronous upload immediately.
*****
Hint - If you use the struts tags <html:form>, <html:file>, <html:submit> you will also need to
use the object FormFile on your ActionForm to retrieve the File uploaded from the JSP
form.
*****
You can use this as your starting form...
<html:form method="post" action="<action_name>" enctype="multipart/form-data">
<html:file property="<property_name>" />
<html:submit />
html:form>