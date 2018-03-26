/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author dhruvinparikh.byethost24.com
 */
public class FileUploadForm extends org.apache.struts.action.ActionForm {

    private FormFile uploadFile;
    private int fileSize = 0;
    private String fileName = "";

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public FormFile getUploadFile() {
        return uploadFile;
    }

    /**
     * @return the file
     */
    public void setUploadFile(FormFile uploadFile) {    
        this.uploadFile = uploadFile;
    }

    /**
     *
     */
    public FileUploadForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (uploadFile.getFileSize() == 0) {

            errors.add("file", new ActionMessage("error.file.required"));
        }else if (uploadFile.getFileSize() > 51200) {
            errors.add("file", new ActionMessage("error.file.size"));
        }
        return errors;
    }
}
