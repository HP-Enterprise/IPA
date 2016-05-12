
package com.cmos.ipa.service.video_surveillance.deviceRegistryV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.deviceRegistryV1 package. 
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

    private final static QName _EvHeader_QNAME = new QName("urn:schemas-pelco-com:service:DeviceRegistry:1", "evHeader");
    private final static QName _UpnpStatesUpnpState_QNAME = new QName("", "upnpState");
    private final static QName _SysCfgItemStr_QNAME = new QName("", "str");
    private final static QName _AttrItemName_QNAME = new QName("", "name");
    private final static QName _AttrItemValue_QNAME = new QName("", "value");
    private final static QName _PageRespQueryId_QNAME = new QName("", "queryId");
    private final static QName _PageRespNext_QNAME = new QName("", "next");
    private final static QName _PageRespTotal_QNAME = new QName("", "total");
    private final static QName _PageRespUrl_QNAME = new QName("", "url");
    private final static QName _ItemDbId_QNAME = new QName("", "dbId");
    private final static QName _ItemUdn_QNAME = new QName("", "udn");
    private final static QName _ItemType_QNAME = new QName("", "type");
    private final static QName _ItemState_QNAME = new QName("", "state");
    private final static QName _ItemAttrs_QNAME = new QName("", "attrs");
    private final static QName _ItemSvcInfo_QNAME = new QName("", "svcInfo");
    private final static QName _ServiceInfoItemId_QNAME = new QName("", "id");
    private final static QName _PagePageResp_QNAME = new QName("", "pageResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.deviceRegistryV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.Page }
     * 
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.HeaderType }
     * 
     */
    public HeaderType createHeaderType() {
        return new HeaderType();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.SysCfgGet }
     * 
     */
    public SysCfgGet createSysCfgGet() {
        return new SysCfgGet();
    }

    /**
     * Create an instance of {@link SysCfgGetResponse }
     * 
     */
    public SysCfgGetResponse createSysCfgGetResponse() {
        return new SysCfgGetResponse();
    }

    /**
     * Create an instance of {@link GetDeviceAttributes }
     * 
     */
    public GetDeviceAttributes createGetDeviceAttributes() {
        return new GetDeviceAttributes();
    }

    /**
     * Create an instance of {@link GetDeviceAttributesResponse }
     * 
     */
    public GetDeviceAttributesResponse createGetDeviceAttributesResponse() {
        return new GetDeviceAttributesResponse();
    }

    /**
     * Create an instance of {@link GetDeviceAttributeValue }
     * 
     */
    public GetDeviceAttributeValue createGetDeviceAttributeValue() {
        return new GetDeviceAttributeValue();
    }

    /**
     * Create an instance of {@link GetDeviceAttributeValueResponse }
     * 
     */
    public GetDeviceAttributeValueResponse createGetDeviceAttributeValueResponse() {
        return new GetDeviceAttributeValueResponse();
    }

    /**
     * Create an instance of {@link GetDeviceServiceAttributeValue }
     * 
     */
    public GetDeviceServiceAttributeValue createGetDeviceServiceAttributeValue() {
        return new GetDeviceServiceAttributeValue();
    }

    /**
     * Create an instance of {@link GetDeviceServiceAttributeValueResponse }
     * 
     */
    public GetDeviceServiceAttributeValueResponse createGetDeviceServiceAttributeValueResponse() {
        return new GetDeviceServiceAttributeValueResponse();
    }

    /**
     * Create an instance of {@link GetDevicesByAttrValue }
     * 
     */
    public GetDevicesByAttrValue createGetDevicesByAttrValue() {
        return new GetDevicesByAttrValue();
    }

    /**
     * Create an instance of {@link GetDevicesByAttrValueResponse }
     * 
     */
    public GetDevicesByAttrValueResponse createGetDevicesByAttrValueResponse() {
        return new GetDevicesByAttrValueResponse();
    }

    /**
     * Create an instance of {@link GetDeviceServiceInfo }
     * 
     */
    public GetDeviceServiceInfo createGetDeviceServiceInfo() {
        return new GetDeviceServiceInfo();
    }

    /**
     * Create an instance of {@link GetDeviceServiceInfoResponse }
     * 
     */
    public GetDeviceServiceInfoResponse createGetDeviceServiceInfoResponse() {
        return new GetDeviceServiceInfoResponse();
    }

    /**
     * Create an instance of {@link ServiceInfoPage }
     * 
     */
    public ServiceInfoPage createServiceInfoPage() {
        return new ServiceInfoPage();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.GetDevices }
     * 
     */
    public GetDevices createGetDevices() {
        return new GetDevices();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.UpnpDvcQuery }
     * 
     */
    public UpnpDvcQuery createUpnpDvcQuery() {
        return new UpnpDvcQuery();
    }

    /**
     * Create an instance of {@link GetDevicesResponse }
     * 
     */
    public GetDevicesResponse createGetDevicesResponse() {
        return new GetDevicesResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.GetPage }
     * 
     */
    public GetPage createGetPage() {
        return new GetPage();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageReq }
     * 
     */
    public PageReq createPageReq() {
        return new PageReq();
    }

    /**
     * Create an instance of {@link GetPageResponse }
     * 
     */
    public GetPageResponse createGetPageResponse() {
        return new GetPageResponse();
    }

    /**
     * Create an instance of {@link ServiceInfoItem }
     * 
     */
    public ServiceInfoItem createServiceInfoItem() {
        return new ServiceInfoItem();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.SvcInfo }
     * 
     */
    public SvcInfo createSvcInfo() {
        return new SvcInfo();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageResp }
     * 
     */
    public PageResp createPageResp() {
        return new PageResp();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.Attrs }
     * 
     */
    public Attrs createAttrs() {
        return new Attrs();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.AttrItem }
     * 
     */
    public AttrItem createAttrItem() {
        return new AttrItem();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.AttrQueryItem }
     * 
     */
    public AttrQueryItem createAttrQueryItem() {
        return new AttrQueryItem();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.AttrQueryStrs }
     * 
     */
    public AttrQueryStrs createAttrQueryStrs() {
        return new AttrQueryStrs();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.SysCfgQuery }
     * 
     */
    public SysCfgQuery createSysCfgQuery() {
        return new SysCfgQuery();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.SysCfgItem }
     * 
     */
    public SysCfgItem createSysCfgItem() {
        return new SysCfgItem();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageResponse }
     * 
     */
    public PageResponse createPageResponse() {
        return new PageResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.UpnpStates }
     * 
     */
    public UpnpStates createUpnpStates() {
        return new UpnpStates();
    }

    /**
     * Create an instance of {@link DvcTypeQueryStrs }
     * 
     */
    public DvcTypeQueryStrs createDvcTypeQueryStrs() {
        return new DvcTypeQueryStrs();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.DvcTypeItem }
     * 
     */
    public DvcTypeItem createDvcTypeItem() {
        return new DvcTypeItem();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageReqType }
     * 
     */
    public PageReqType createPageReqType() {
        return new PageReqType();
    }

    /**
     * Create an instance of {@link UpnpDvcQueryType }
     * 
     */
    public UpnpDvcQueryType createUpnpDvcQueryType() {
        return new UpnpDvcQueryType();
    }

    /**
     * Create an instance of {@link UpnpStatesType }
     * 
     */
    public UpnpStatesType createUpnpStatesType() {
        return new UpnpStatesType();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.RenewalType }
     * 
     */
    public RenewalType createRenewalType() {
        return new RenewalType();
    }

    /**
     * Create an instance of {@link QueryStrsType }
     * 
     */
    public QueryStrsType createQueryStrsType() {
        return new QueryStrsType();
    }

    /**
     * Create an instance of {@link PageGetDevType }
     * 
     */
    public PageGetDevType createPageGetDevType() {
        return new PageGetDevType();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageItemType }
     * 
     */
    public PageItemType createPageItemType() {
        return new PageItemType();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.ItemListType }
     * 
     */
    public ItemListType createItemListType() {
        return new ItemListType();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.ItemReqType }
     * 
     */
    public ItemReqType createItemReqType() {
        return new ItemReqType();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.Page.Item }
     * 
     */
    public Page.Item createPageItem() {
        return new Page.Item();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.HeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-pelco-com:service:DeviceRegistry:1", name = "evHeader")
    public JAXBElement<HeaderType> createEvHeader(HeaderType value) {
        return new JAXBElement<HeaderType>(_EvHeader_QNAME, HeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "upnpState", scope = UpnpStates.class)
    public JAXBElement<Integer> createUpnpStatesUpnpState(Integer value) {
        return new JAXBElement<Integer>(_UpnpStatesUpnpState_QNAME, Integer.class, UpnpStates.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "str", scope = SysCfgItem.class)
    public JAXBElement<String> createSysCfgItemStr(String value) {
        return new JAXBElement<String>(_SysCfgItemStr_QNAME, String.class, SysCfgItem.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = AttrItem.class)
    public JAXBElement<String> createAttrItemName(String value) {
        return new JAXBElement<String>(_AttrItemName_QNAME, String.class, AttrItem.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value", scope = AttrItem.class)
    public JAXBElement<String> createAttrItemValue(String value) {
        return new JAXBElement<String>(_AttrItemValue_QNAME, String.class, AttrItem.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "queryId", scope = PageResp.class)
    public JAXBElement<String> createPageRespQueryId(String value) {
        return new JAXBElement<String>(_PageRespQueryId_QNAME, String.class, PageResp.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "next", scope = PageResp.class)
    public JAXBElement<String> createPageRespNext(String value) {
        return new JAXBElement<String>(_PageRespNext_QNAME, String.class, PageResp.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "total", scope = PageResp.class)
    public JAXBElement<String> createPageRespTotal(String value) {
        return new JAXBElement<String>(_PageRespTotal_QNAME, String.class, PageResp.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "url", scope = PageResp.class)
    public JAXBElement<String> createPageRespUrl(String value) {
        return new JAXBElement<String>(_PageRespUrl_QNAME, String.class, PageResp.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dbId", scope = Item.class)
    public JAXBElement<Integer> createItemDbId(Integer value) {
        return new JAXBElement<Integer>(_ItemDbId_QNAME, Integer.class, Item.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "udn", scope = Item.class)
    public JAXBElement<String> createItemUdn(String value) {
        return new JAXBElement<String>(_ItemUdn_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = Item.class)
    public JAXBElement<String> createItemType(String value) {
        return new JAXBElement<String>(_ItemType_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = Item.class)
    public JAXBElement<Integer> createItemState(Integer value) {
        return new JAXBElement<Integer>(_ItemState_QNAME, Integer.class, Item.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.Attrs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "attrs", scope = Item.class)
    public JAXBElement<Attrs> createItemAttrs(Attrs value) {
        return new JAXBElement<Attrs>(_ItemAttrs_QNAME, Attrs.class, Item.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.SvcInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "svcInfo", scope = Item.class)
    public JAXBElement<SvcInfo> createItemSvcInfo(SvcInfo value) {
        return new JAXBElement<SvcInfo>(_ItemSvcInfo_QNAME, SvcInfo.class, Item.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id", scope = ServiceInfoItem.class)
    public JAXBElement<String> createServiceInfoItemId(String value) {
        return new JAXBElement<String>(_ServiceInfoItemId_QNAME, String.class, ServiceInfoItem.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = ServiceInfoItem.class)
    public JAXBElement<String> createServiceInfoItemType(String value) {
        return new JAXBElement<String>(_ItemType_QNAME, String.class, ServiceInfoItem.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state", scope = ServiceInfoItem.class)
    public JAXBElement<Integer> createServiceInfoItemState(Integer value) {
        return new JAXBElement<Integer>(_ItemState_QNAME, Integer.class, ServiceInfoItem.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "queryId", scope = PageReq.class)
    public JAXBElement<String> createPageReqQueryId(String value) {
        return new JAXBElement<String>(_PageRespQueryId_QNAME, String.class, PageReq.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "next", scope = PageReq.class)
    public JAXBElement<String> createPageReqNext(String value) {
        return new JAXBElement<String>(_PageRespNext_QNAME, String.class, PageReq.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pageResp", scope = Page.class)
    public JAXBElement<PageResp> createPagePageResp(PageResp value) {
        return new JAXBElement<PageResp>(_PagePageResp_QNAME, PageResp.class, Page.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.cmos.ipa.service.video_surveillance.deviceRegistryV1.PageResp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "pageResp", scope = ServiceInfoPage.class)
    public JAXBElement<PageResp> createServiceInfoPagePageResp(PageResp value) {
        return new JAXBElement<PageResp>(_PagePageResp_QNAME, PageResp.class, ServiceInfoPage.class, value);
    }

}
