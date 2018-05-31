
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

    private final static QName _FindBy_QNAME = new QName("http://ModelLayer.company.com/", "findBy");
    private final static QName _GetAllSocks_QNAME = new QName("http://ModelLayer.company.com/", "getAllSocks");
    private final static QName _GetSockByCondition_QNAME = new QName("http://ModelLayer.company.com/", "getSockByCondition");
    private final static QName _GetAllSocksResponse_QNAME = new QName("http://ModelLayer.company.com/", "getAllSocksResponse");
    private final static QName _DeleteSockResponse_QNAME = new QName("http://ModelLayer.company.com/", "deleteSockResponse");
    private final static QName _UpdateSock_QNAME = new QName("http://ModelLayer.company.com/", "updateSock");
    private final static QName _AddSock_QNAME = new QName("http://ModelLayer.company.com/", "addSock");
    private final static QName _AddSockResponse_QNAME = new QName("http://ModelLayer.company.com/", "addSockResponse");
    private final static QName _UpdateSockResponse_QNAME = new QName("http://ModelLayer.company.com/", "updateSockResponse");
    private final static QName _FindByResponse_QNAME = new QName("http://ModelLayer.company.com/", "findByResponse");
    private final static QName _GetSockById_QNAME = new QName("http://ModelLayer.company.com/", "getSockById");
    private final static QName _GetSockByConditionResponse_QNAME = new QName("http://ModelLayer.company.com/", "getSockByConditionResponse");
    private final static QName _GetSockByIdResponse_QNAME = new QName("http://ModelLayer.company.com/", "getSockByIdResponse");
    private final static QName _DeleteSock_QNAME = new QName("http://ModelLayer.company.com/", "deleteSock");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company.modellayer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSockByConditionResponse }
     * 
     */
    public GetSockByConditionResponse createGetSockByConditionResponse() {
        return new GetSockByConditionResponse();
    }

    /**
     * Create an instance of {@link DeleteSock }
     * 
     */
    public DeleteSock createDeleteSock() {
        return new DeleteSock();
    }

    /**
     * Create an instance of {@link GetSockByIdResponse }
     * 
     */
    public GetSockByIdResponse createGetSockByIdResponse() {
        return new GetSockByIdResponse();
    }

    /**
     * Create an instance of {@link GetSockById }
     * 
     */
    public GetSockById createGetSockById() {
        return new GetSockById();
    }

    /**
     * Create an instance of {@link AddSock }
     * 
     */
    public AddSock createAddSock() {
        return new AddSock();
    }

    /**
     * Create an instance of {@link FindByResponse }
     * 
     */
    public FindByResponse createFindByResponse() {
        return new FindByResponse();
    }

    /**
     * Create an instance of {@link AddSockResponse }
     * 
     */
    public AddSockResponse createAddSockResponse() {
        return new AddSockResponse();
    }

    /**
     * Create an instance of {@link UpdateSockResponse }
     * 
     */
    public UpdateSockResponse createUpdateSockResponse() {
        return new UpdateSockResponse();
    }

    /**
     * Create an instance of {@link DeleteSockResponse }
     * 
     */
    public DeleteSockResponse createDeleteSockResponse() {
        return new DeleteSockResponse();
    }

    /**
     * Create an instance of {@link UpdateSock }
     * 
     */
    public UpdateSock createUpdateSock() {
        return new UpdateSock();
    }

    /**
     * Create an instance of {@link GetAllSocksResponse }
     * 
     */
    public GetAllSocksResponse createGetAllSocksResponse() {
        return new GetAllSocksResponse();
    }

    /**
     * Create an instance of {@link FindBy }
     * 
     */
    public FindBy createFindBy() {
        return new FindBy();
    }

    /**
     * Create an instance of {@link GetAllSocks }
     * 
     */
    public GetAllSocks createGetAllSocks() {
        return new GetAllSocks();
    }

    /**
     * Create an instance of {@link GetSockByCondition }
     * 
     */
    public GetSockByCondition createGetSockByCondition() {
        return new GetSockByCondition();
    }

    /**
     * Create an instance of {@link SockData }
     * 
     */
    public SockData createSockData() {
        return new SockData();
    }

    /**
     * Create an instance of {@link OwnerData }
     * 
     */
    public OwnerData createOwnerData() {
        return new OwnerData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "findBy")
    public JAXBElement<FindBy> createFindBy(FindBy value) {
        return new JAXBElement<FindBy>(_FindBy_QNAME, FindBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSocks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "getAllSocks")
    public JAXBElement<GetAllSocks> createGetAllSocks(GetAllSocks value) {
        return new JAXBElement<GetAllSocks>(_GetAllSocks_QNAME, GetAllSocks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSockByCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "getSockByCondition")
    public JAXBElement<GetSockByCondition> createGetSockByCondition(GetSockByCondition value) {
        return new JAXBElement<GetSockByCondition>(_GetSockByCondition_QNAME, GetSockByCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSocksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "getAllSocksResponse")
    public JAXBElement<GetAllSocksResponse> createGetAllSocksResponse(GetAllSocksResponse value) {
        return new JAXBElement<GetAllSocksResponse>(_GetAllSocksResponse_QNAME, GetAllSocksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "deleteSockResponse")
    public JAXBElement<DeleteSockResponse> createDeleteSockResponse(DeleteSockResponse value) {
        return new JAXBElement<DeleteSockResponse>(_DeleteSockResponse_QNAME, DeleteSockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "updateSock")
    public JAXBElement<UpdateSock> createUpdateSock(UpdateSock value) {
        return new JAXBElement<UpdateSock>(_UpdateSock_QNAME, UpdateSock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "addSock")
    public JAXBElement<AddSock> createAddSock(AddSock value) {
        return new JAXBElement<AddSock>(_AddSock_QNAME, AddSock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "addSockResponse")
    public JAXBElement<AddSockResponse> createAddSockResponse(AddSockResponse value) {
        return new JAXBElement<AddSockResponse>(_AddSockResponse_QNAME, AddSockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "updateSockResponse")
    public JAXBElement<UpdateSockResponse> createUpdateSockResponse(UpdateSockResponse value) {
        return new JAXBElement<UpdateSockResponse>(_UpdateSockResponse_QNAME, UpdateSockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "findByResponse")
    public JAXBElement<FindByResponse> createFindByResponse(FindByResponse value) {
        return new JAXBElement<FindByResponse>(_FindByResponse_QNAME, FindByResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSockById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "getSockById")
    public JAXBElement<GetSockById> createGetSockById(GetSockById value) {
        return new JAXBElement<GetSockById>(_GetSockById_QNAME, GetSockById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSockByConditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "getSockByConditionResponse")
    public JAXBElement<GetSockByConditionResponse> createGetSockByConditionResponse(GetSockByConditionResponse value) {
        return new JAXBElement<GetSockByConditionResponse>(_GetSockByConditionResponse_QNAME, GetSockByConditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSockByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "getSockByIdResponse")
    public JAXBElement<GetSockByIdResponse> createGetSockByIdResponse(GetSockByIdResponse value) {
        return new JAXBElement<GetSockByIdResponse>(_GetSockByIdResponse_QNAME, GetSockByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ModelLayer.company.com/", name = "deleteSock")
    public JAXBElement<DeleteSock> createDeleteSock(DeleteSock value) {
        return new JAXBElement<DeleteSock>(_DeleteSock_QNAME, DeleteSock.class, null, value);
    }

}
