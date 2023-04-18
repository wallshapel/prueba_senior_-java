package crud.interfaces;

public class OperationsProxy implements crud.interfaces.Operations {
  private String _endpoint = null;
  private crud.interfaces.Operations operations = null;
  
  public OperationsProxy() {
    _initOperationsProxy();
  }
  
  public OperationsProxy(String endpoint) {
    _endpoint = endpoint;
    _initOperationsProxy();
  }
  
  private void _initOperationsProxy() {
    try {
      operations = (new crud.service.imp.ServiceImpServiceLocator()).getServiceImpPort();
      if (operations != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)operations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)operations)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (operations != null)
      ((javax.xml.rpc.Stub)operations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public crud.interfaces.Operations getOperations() {
    if (operations == null)
      _initOperationsProxy();
    return operations;
  }
  
  public java.lang.String update(java.lang.Long arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.Double arg8) throws java.rmi.RemoteException, crud.interfaces.ParseException{
    if (operations == null)
      _initOperationsProxy();
    return operations.update(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
  }
  
  public java.lang.String delete(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (operations == null)
      _initOperationsProxy();
    return operations.delete(arg0);
  }
  
  public java.lang.String insert(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.Double arg7) throws java.rmi.RemoteException, crud.interfaces.ParseException{
    if (operations == null)
      _initOperationsProxy();
    return operations.insert(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
  }
  
  public crud.interfaces.Employee[] findAll() throws java.rmi.RemoteException{
    if (operations == null)
      _initOperationsProxy();
    return operations.findAll();
  }
  
  public crud.interfaces.Employee findById(java.lang.Long arg0) throws java.rmi.RemoteException{
    if (operations == null)
      _initOperationsProxy();
    return operations.findById(arg0);
  }
  
  
}