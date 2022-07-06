
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
@WebService(name = "RestaurantWS", targetNamespace = "http://projectdistprog.ubaya.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RestaurantWS {


    /**
     * 
     * @param namaRestoran
     * @param password
     * @param jumlahMeja
     * @param jamBuka
     * @param jamTutup
     * @param nomorTelepon
     * @param namaPemilik
     * @param alamat
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CheckRegister")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CheckRegister", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.CheckRegister")
    @ResponseWrapper(localName = "CheckRegisterResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.CheckRegisterResponse")
    @Action(input = "http://projectdistprog.ubaya.com/RestaurantWS/CheckRegisterRequest", output = "http://projectdistprog.ubaya.com/RestaurantWS/CheckRegisterResponse")
    public String checkRegister(
        @WebParam(name = "nama_pemilik", targetNamespace = "")
        String namaPemilik,
        @WebParam(name = "nama_restoran", targetNamespace = "")
        String namaRestoran,
        @WebParam(name = "alamat", targetNamespace = "")
        String alamat,
        @WebParam(name = "nomor_telepon", targetNamespace = "")
        String nomorTelepon,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "jumlah_meja", targetNamespace = "")
        int jumlahMeja,
        @WebParam(name = "jam_buka", targetNamespace = "")
        String jamBuka,
        @WebParam(name = "jam_tutup", targetNamespace = "")
        String jamTutup);

    /**
     * 
     * @param kriteria
     * @param value
     * @return
     *     returns java.util.List&lt;java.lang.String&gt;
     */
    @WebMethod(operationName = "DisplayResCari")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DisplayResCari", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.DisplayResCari")
    @ResponseWrapper(localName = "DisplayResCariResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.DisplayResCariResponse")
    @Action(input = "http://projectdistprog.ubaya.com/RestaurantWS/DisplayResCariRequest", output = "http://projectdistprog.ubaya.com/RestaurantWS/DisplayResCariResponse")
    public List<String> displayResCari(
        @WebParam(name = "kriteria", targetNamespace = "")
        String kriteria,
        @WebParam(name = "value", targetNamespace = "")
        String value);

    /**
     * 
     * @return
     *     returns java.util.List&lt;java.lang.String&gt;
     */
    @WebMethod(operationName = "DisplayRes")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DisplayRes", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.DisplayRes")
    @ResponseWrapper(localName = "DisplayResResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.DisplayResResponse")
    @Action(input = "http://projectdistprog.ubaya.com/RestaurantWS/DisplayResRequest", output = "http://projectdistprog.ubaya.com/RestaurantWS/DisplayResResponse")
    public List<String> displayRes();

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CheckLogin")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CheckLogin", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.CheckLogin")
    @ResponseWrapper(localName = "CheckLoginResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.CheckLoginResponse")
    @Action(input = "http://projectdistprog.ubaya.com/RestaurantWS/CheckLoginRequest", output = "http://projectdistprog.ubaya.com/RestaurantWS/CheckLoginResponse")
    public String checkLogin(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param kode
     * @return
     *     returns java.util.List&lt;java.lang.String&gt;
     */
    @WebMethod(operationName = "AmbilDataByUsername")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AmbilDataByUsername", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.AmbilDataByUsername")
    @ResponseWrapper(localName = "AmbilDataByUsernameResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.AmbilDataByUsernameResponse")
    @Action(input = "http://projectdistprog.ubaya.com/RestaurantWS/AmbilDataByUsernameRequest", output = "http://projectdistprog.ubaya.com/RestaurantWS/AmbilDataByUsernameResponse")
    public List<String> ambilDataByUsername(
        @WebParam(name = "kode", targetNamespace = "")
        String kode);

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
    @Action(input = "http://projectdistprog.ubaya.com/RestaurantWS/helloRequest", output = "http://projectdistprog.ubaya.com/RestaurantWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param kode
     * @return
     *     returns java.util.List&lt;java.lang.String&gt;
     */
    @WebMethod(operationName = "AmbilDataById")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AmbilDataById", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.AmbilDataById")
    @ResponseWrapper(localName = "AmbilDataByIdResponse", targetNamespace = "http://projectdistprog.ubaya.com/", className = "com.ubaya.projectdistprog.AmbilDataByIdResponse")
    @Action(input = "http://projectdistprog.ubaya.com/RestaurantWS/AmbilDataByIdRequest", output = "http://projectdistprog.ubaya.com/RestaurantWS/AmbilDataByIdResponse")
    public List<String> ambilDataById(
        @WebParam(name = "kode", targetNamespace = "")
        String kode);

}
