package ihe.qrph.dex._2013;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-07-31T17:14:40.927+03:00
 * Generated source version: 2.7.5
 * 
 */
@WebService(targetNamespace = "urn:ihe:qrph:dex:2013", name = "DataElementExchangePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DataElementExchangePortType {

    @WebResult(name = "RetrieveDataElementListResponse", targetNamespace = "urn:ihe:qrph:dex:2013", partName = "body")
    @WebMethod(operationName = "RetrieveDataElementList", action = "urn:ihe:qrph:dex:2013:RetrieveDataElementList")
    public RetrieveDataElementListResponseType retrieveDataElementList(
        @WebParam(partName = "body", name = "RetrieveDataElementListRequest", targetNamespace = "urn:ihe:qrph:dex:2013")
        RetrieveDataElementListRequestType body
    );

    @WebResult(name = "RetrieveMetadataResponse", targetNamespace = "urn:ihe:qrph:dex:2013", partName = "body")
    @WebMethod(operationName = "RetrieveMetadata", action = "urn:ihe:qrph:dex:2013:RetrieveMetadata")
    public RetrieveMetadataResponseType retrieveMetadata(
        @WebParam(partName = "body", name = "RetrieveMetadataRequest", targetNamespace = "urn:ihe:qrph:dex:2013")
        RetrieveMetadataRequestType body
    );
}