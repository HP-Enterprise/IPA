
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-12T18:18:29.335+08:00
 * Generated source version: 3.1.6
 * 
 */

@WebService(
                      serviceName = "PelcoConfiguration",
                      portName = "PelcoConfiguration",
                      targetNamespace = "urn:schemas-pelco-com:service:PelcoConfiguration:1",
                      wsdlLocation = "file:a/PelcoConfigurationV1.wsdl",
                      endpointInterface = "com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.PelcoConfigurationPortType")
                      
public class PelcoConfigurationImpl implements PelcoConfigurationPortType {

    private static final Logger LOG = Logger.getLogger(PelcoConfigurationImpl.class.getName());

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.PelcoConfigurationPortType#getModelName(*
     */
    public String getModelName() {
        LOG.info("Executing operation getModelName");
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.PelcoConfigurationPortType#getModelNumber(*
     */
    public String getModelNumber() {
        LOG.info("Executing operation getModelNumber");
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.PelcoConfigurationPortType#getLocation(*
     */
    public String getLocation() {
        LOG.info("Executing operation getLocation");
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.PelcoConfigurationPortType#getConfiguration(*
     */
    public PelcoConfig getConfiguration() {
        LOG.info("Executing operation getConfiguration");
        try {
            PelcoConfig _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.cmos.ipa.service.video_surveillance.pelcoConfigurationV1.PelcoConfigurationPortType#isRegistered(*
     */
    public int isRegistered() { 
        LOG.info("Executing operation isRegistered");
        try {
            int _return = 0;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
