/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.web.services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Asynchronous;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.soap.MTOM;
/**
 *
 * @author dhruvinparikh.byethost24.com
 */
@WebService(serviceName = "FileSizeService")
@Stateless()
@MTOM(enabled = true,threshold=51200)
public class FileSizeService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fileSize")
    public int fileSize(@WebParam(name = "fileContents") byte[] fileContents) {
        try {
            //TODO write your implementation code here:
            for (int i = 0; i < 10 ; i++) {
                Thread.sleep(1000);
            }
            return fileContents.length;
        } catch (InterruptedException ex) {
            Logger.getLogger(FileSizeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
