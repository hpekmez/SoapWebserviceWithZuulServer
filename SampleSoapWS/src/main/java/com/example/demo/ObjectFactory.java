//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.24 at 01:38:55 PM TRT 
//


package com.example.demo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerUsageRequest }
     * 
     */
    public GetCustomerUsageRequest createGetCustomerUsageRequest() {
        return new GetCustomerUsageRequest();
    }

    /**
     * Create an instance of {@link GetCustomerUsageResponse }
     * 
     */
    public GetCustomerUsageResponse createGetCustomerUsageResponse() {
        return new GetCustomerUsageResponse();
    }

    /**
     * Create an instance of {@link UsageSummary }
     * 
     */
    public UsageSummary createUsageSummary() {
        return new UsageSummary();
    }

}
