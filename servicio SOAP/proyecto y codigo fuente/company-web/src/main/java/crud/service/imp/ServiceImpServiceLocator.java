/**
 * ServiceImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crud.service.imp;

public class ServiceImpServiceLocator extends org.apache.axis.client.Service implements crud.service.imp.ServiceImpService {

    public ServiceImpServiceLocator() {
    }


    public ServiceImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiceImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceImpPort
    private java.lang.String ServiceImpPort_address = "http://localhost:2023/WS/Service";

    public java.lang.String getServiceImpPortAddress() {
        return ServiceImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceImpPortWSDDServiceName = "ServiceImpPort";

    public java.lang.String getServiceImpPortWSDDServiceName() {
        return ServiceImpPortWSDDServiceName;
    }

    public void setServiceImpPortWSDDServiceName(java.lang.String name) {
        ServiceImpPortWSDDServiceName = name;
    }

    public crud.interfaces.Operations getServiceImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiceImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceImpPort(endpoint);
    }

    public crud.interfaces.Operations getServiceImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            crud.service.imp.ServiceImpPortBindingStub _stub = new crud.service.imp.ServiceImpPortBindingStub(portAddress, this);
            _stub.setPortName(getServiceImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceImpPortEndpointAddress(java.lang.String address) {
        ServiceImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (crud.interfaces.Operations.class.isAssignableFrom(serviceEndpointInterface)) {
                crud.service.imp.ServiceImpPortBindingStub _stub = new crud.service.imp.ServiceImpPortBindingStub(new java.net.URL(ServiceImpPort_address), this);
                _stub.setPortName(getServiceImpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServiceImpPort".equals(inputPortName)) {
            return getServiceImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://imp.service.crud/", "ServiceImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://imp.service.crud/", "ServiceImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceImpPort".equals(portName)) {
            setServiceImpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
