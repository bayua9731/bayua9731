
package com.ubaya.projectdistprog;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MenuWS", targetNamespace = "http://projectdistprog.ubaya.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MenuWS {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.HelloResponse")
    @Action(input = "http://projectdistprog.ubaya.com/MenuWS/helloRequest", output = "http://projectdistprog.ubaya.com/MenuWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param kodeRestoran
     * @return
     *     returns java.util.List&lt;java.lang.String&gt;
     */
    @WebMethod(operationName = "DisplayMenuRestoran")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DisplayMenuRestoran", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.DisplayMenuRestoran")
    @ResponseWrapper(localName = "DisplayMenuRestoranResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.DisplayMenuRestoranResponse")
    @Action(input = "http://projectdistprog.ubaya.com/MenuWS/DisplayMenuRestoranRequest", output = "http://projectdistprog.ubaya.com/MenuWS/DisplayMenuRestoranResponse")
    public List<String> displayMenuRestoran(
        @WebParam(name = "kodeRestoran", targetNamespace = "")
        String kodeRestoran);

    /**
     * 
     * @param nama
     * @param harga
     * @param kode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TambahMenu")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "TambahMenu", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.TambahMenu")
    @ResponseWrapper(localName = "TambahMenuResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.TambahMenuResponse")
    @Action(input = "http://projectdistprog.ubaya.com/MenuWS/TambahMenuRequest", output = "http://projectdistprog.ubaya.com/MenuWS/TambahMenuResponse")
    public String tambahMenu(
        @WebParam(name = "kode", targetNamespace = "")
        String kode,
        @WebParam(name = "nama", targetNamespace = "")
        String nama,
        @WebParam(name = "harga", targetNamespace = "")
        double harga);

}
