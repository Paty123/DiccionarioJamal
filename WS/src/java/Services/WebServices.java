/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rene
 */
@WebService(serviceName = "WebServices")
public class WebServices {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Convercion")
    public double Convercion(@WebParam(name = "valor") double valor) {
        double total;
        total = valor * 10;
        return total;
    }
}
