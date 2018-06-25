
package com.company.modellayer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company.modellayer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllSockTypesResponse_QNAME = new QName("http://ModelLayer.company.com/", "getAllSockTypesResponse");
    private final static QName _GetAllSockTypes_QNAME = new QName("http://ModelLayer.company.com/", "getAllSockTypes");
    private final static QName _AddSockType_QNAME = new QName("http://ModelLayer.company.com/", "addSockType");
    private final static QName _DeleteSockTypeResponse_QNAME = new QName("http://ModelLayer.company.com/", "deleteSockTypeResponse");
    private final static QName _DeleteSockType_QNAME = new QName("http://ModelLayer.company.com/", "deleteSockType");
    private final static QName _UpdateSockType_QNAME = new QName("http://ModelLayer.company.com/", "updateSockType");
    private final static QName _UpdateSockTypeResponse_QNAME = new QName("http://ModelLayer.company.com/", "updateSockTypeResponse");
    private final static QName _AddSockTypeResponse_QNAME = new QName("http://ModelLayer.company.com/", "addSockTypeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company.modellayer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteSockType }
     * 
     */
    public DeleteSockType createDeleteSockType() {
        return new DeleteSockType();
    }

    /**
     * Create an instance of {@link AddSockTypeResponse }
     * 
     */
    public AddSockTypeResponse createAddSockTypeResponse() {
        return new AddSockTypeResponse();
    }

    /**
     * Create an instance of {@link UpdateSockType }
     * 
     */
    public UpdateSockType createUpdateSockType() {
        return new UpdateSockType();
    }

    /**
     * Create an instance of {@link UpdateSockTypeResponse }
     * 
     */
    public UpdateSockTypeResponse createUpdateSockTypeResponse() {
        return new UpdateSockTypeResponse();
    }

    /**
     * Create an instance of {@link GetAllSockTypes }
     * 
     */
    public GetAllSockTypes createGetAllSockTypes() {
        return new GetAllSockTypes();
    }

    /**
     * Create an instance of {@link DeleteSockTypeResponse }
     * 
     */
    public DeleteSockTypeResponse createDeleteSockTypeResponse() {
        return new DeleteSockTypeResponse();
    }

    /**
     * Create an instance of {@link AddSockType }
     * 
     */
    public AddSockType createAddSockType() {
        return new AddSockType();
    }

    /**
     * Create an instance of {@link GetAllSockTypesResponse }
     * 
     */
    public GetAllSockTypesResponse createGetAllSockTypesResponse() {
        return new GetAllSockTypesResponse();
    }

    /**
     * Create an instance of {@link SockType }
     * 
     */
    public SockType createSockType() {
        return new SockType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSockTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "getAllSockTypesResponse")
    public JAXBElement<GetAllSockTypesResponse> createGetAllSockTypesResponse(GetAllSockTypesResponse value) {
        return new JAXBElement<GetAllSockTypesResponse>(_GetAllSockTypesResponse_QNAME, GetAllSockTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSockTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "getAllSockTypes")
    public JAXBElement<GetAllSockTypes> createGetAllSockTypes(GetAllSockTypes value) {
        return new JAXBElement<GetAllSockTypes>(_GetAllSockTypes_QNAME, GetAllSockTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "addSockType")
    public JAXBElement<AddSockType> createAddSockType(AddSockType value) {
        return new JAXBElement<AddSockType>(_AddSockType_QNAME, AddSockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSockTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "deleteSockTypeResponse")
    public JAXBElement<DeleteSockTypeResponse> createDeleteSockTypeResponse(DeleteSockTypeResponse value) {
        return new JAXBElement<DeleteSockTypeResponse>(_DeleteSockTypeResponse_QNAME, DeleteSockTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "deleteSockType")
    public JAXBElement<DeleteSockType> createDeleteSockType(DeleteSockType value) {
        return new JAXBElement<DeleteSockType>(_DeleteSockType_QNAME, DeleteSockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "updateSockType")
    public JAXBElement<UpdateSockType> createUpdateSockType(UpdateSockType value) {
        return new JAXBElement<UpdateSockType>(_UpdateSockType_QNAME, UpdateSockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSockTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "updateSockTypeResponse")
    public JAXBElement<UpdateSockTypeResponse> createUpdateSockTypeResponse(UpdateSockTypeResponse value) {
        return new JAXBElement<UpdateSockTypeResponse>(_UpdateSockTypeResponse_QNAME, UpdateSockTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSockTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "addSockTypeResponse")
    public JAXBElement<AddSockTypeResponse> createAddSockTypeResponse(AddSockTypeResponse value) {
        return new JAXBElement<AddSockTypeResponse>(_AddSockTypeResponse_QNAME, AddSockTypeResponse.class, null, value);
    }

}
