
package com.cmos.ipa.service.video_surveillance.videoAnalyticsV2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cmos.ipa.service.video_surveillance.videoAnalyticsV2 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cmos.ipa.service.video_surveillance.videoAnalyticsV2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetActiveProfile }
     * 
     */
    public GetActiveProfile createGetActiveProfile() {
        return new GetActiveProfile();
    }

    /**
     * Create an instance of {@link GetActiveProfileResponse }
     * 
     */
    public GetActiveProfileResponse createGetActiveProfileResponse() {
        return new GetActiveProfileResponse();
    }

    /**
     * Create an instance of {@link ExecuteProfile }
     * 
     */
    public ExecuteProfile createExecuteProfile() {
        return new ExecuteProfile();
    }

    /**
     * Create an instance of {@link ExecuteProfileResponse }
     * 
     */
    public ExecuteProfileResponse createExecuteProfileResponse() {
        return new ExecuteProfileResponse();
    }

    /**
     * Create an instance of {@link GetProfileList }
     * 
     */
    public GetProfileList createGetProfileList() {
        return new GetProfileList();
    }

    /**
     * Create an instance of {@link GetProfileListResponse }
     * 
     */
    public GetProfileListResponse createGetProfileListResponse() {
        return new GetProfileListResponse();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.videoAnalyticsV2.ProfileList }
     * 
     */
    public ProfileList createProfileList() {
        return new ProfileList();
    }

    /**
     * Create an instance of {@link com.cmos.ipa.service.video_surveillance.videoAnalyticsV2.StopProfile }
     * 
     */
    public StopProfile createStopProfile() {
        return new StopProfile();
    }

    /**
     * Create an instance of {@link StopProfileResponse }
     * 
     */
    public StopProfileResponse createStopProfileResponse() {
        return new StopProfileResponse();
    }

    /**
     * Create an instance of {@link ProfileSummary }
     * 
     */
    public ProfileSummary createProfileSummary() {
        return new ProfileSummary();
    }

}
