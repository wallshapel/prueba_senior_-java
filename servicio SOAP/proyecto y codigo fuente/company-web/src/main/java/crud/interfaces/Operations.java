/**
 * Operations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crud.interfaces;

public interface Operations extends java.rmi.Remote {
    public java.lang.String update(java.lang.Long arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.Double arg8) throws java.rmi.RemoteException, crud.interfaces.ParseException;
    public java.lang.String delete(java.lang.Long arg0) throws java.rmi.RemoteException;
    public java.lang.String insert(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.Double arg7) throws java.rmi.RemoteException, crud.interfaces.ParseException;
    public crud.interfaces.Employee[] findAll() throws java.rmi.RemoteException;
    public crud.interfaces.Employee findById(java.lang.Long arg0) throws java.rmi.RemoteException;
}
