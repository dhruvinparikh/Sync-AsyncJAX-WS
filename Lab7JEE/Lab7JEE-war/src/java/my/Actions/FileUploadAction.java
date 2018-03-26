/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import my.Forms.FileUploadForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author dhruvinparikh.byethost24.com
 */
public class FileUploadAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        try {
            //extract user data
            FileUploadForm formBean = (FileUploadForm) form;
            FormFile file = formBean.getUploadFile();
            byte[] fileBytes = formBean.getUploadFile().getFileData();
            formBean.setFileName(file.getFileName());
            callAsyncCallback(fileBytes);
            formBean.setFileSize(fileSize(fileBytes));
            request.setAttribute("filesize", formBean.getFileSize());
            request.setAttribute("filename", formBean.getFileName());
            return mapping.findForward(SUCCESS);
        } catch (NullPointerException ex) {
            return mapping.findForward(FAILURE);
        }
    }

    private static int fileSize(byte[] arg0) {
        my.web.services.FileSizeService_Service service = new my.web.services.FileSizeService_Service();
        my.web.services.FileSizeService port = service.getFileSizeServicePort();
        return port.fileSize(arg0);
    }

    public void callAsyncCallback(byte[] arg0) {

        try { // Call Web Service Operation(async. callback)
            my.web.services.FileSizeService_Service service = new my.web.services.FileSizeService_Service();
            my.web.services.FileSizeService port = service.getFileSizeServicePort();
            // TODO initialize WS operation arguments here
            byte[] fileContents = arg0;
            javax.xml.ws.AsyncHandler<my.web.services.FileSizeResponse> asyncHandler = new javax.xml.ws.AsyncHandler<my.web.services.FileSizeResponse>() {
                public void handleResponse(javax.xml.ws.Response<my.web.services.FileSizeResponse> response) {
                    try {
                        // TODO process asynchronous response here
                        System.out.println("Result = " + response.get());
                    } catch (Exception ex) {
                        // TODO handle exception
                    }
                }
            };
            java.util.concurrent.Future<? extends java.lang.Object> result = port.fileSizeAsync(fileContents, asyncHandler);
            while (!result.isDone()) {
                // do something
                Thread.sleep(100);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

    }
}
