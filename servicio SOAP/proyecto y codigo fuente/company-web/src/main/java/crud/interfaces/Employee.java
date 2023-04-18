/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package crud.interfaces;

public class Employee  implements java.io.Serializable {
    private java.lang.String age;

    private java.lang.String bind_date;

    private java.lang.String bindingTime;

    private java.lang.String birthdate;

    private java.lang.String doc;

    private java.lang.String doc_type;

    private java.lang.Long id;

    private java.lang.String last_name;

    private java.lang.String name;

    private java.lang.String position;

    private java.lang.Double salary;

    public Employee() {
    }
    public Employee(java.lang.Long id) {
    	this.id = id;
    }
    public Employee(
    		java.lang.String name,
    		java.lang.String last_name,
    		java.lang.String doc,
            java.lang.String doc_type,
            java.lang.String birthdate,
            java.lang.String bind_date,   
            java.lang.String position,
            java.lang.Double salary) {
           this.bind_date = bind_date;
           this.birthdate = birthdate;
           this.doc = doc;
           this.doc_type = doc_type;
           this.last_name = last_name;
           this.name = name;
           this.position = position;
           this.salary = salary;
    }
    public Employee(
    		java.lang.Long id,
    		java.lang.String name,
    		java.lang.String last_name,
    		java.lang.String doc,
            java.lang.String doc_type,
            java.lang.String birthdate,
            java.lang.String bind_date,   
            java.lang.String position,
            java.lang.Double salary) {
    	   this.id = id;
           this.bind_date = bind_date;
           this.birthdate = birthdate;
           this.doc = doc;
           this.doc_type = doc_type;
           this.last_name = last_name;
           this.name = name;
           this.position = position;
           this.salary = salary;
    }
    public Employee(
    		java.lang.String name,
    		java.lang.String last_name,
    		java.lang.String doc,
            java.lang.String doc_type,
            java.lang.String birthdate,
            java.lang.String bind_date,   
            java.lang.String position,
            java.lang.Double salary,
            java.lang.String age,           
            java.lang.String bindingTime) {
           this.age = age;
           this.bind_date = bind_date;
           this.bindingTime = bindingTime;
           this.birthdate = birthdate;
           this.doc = doc;
           this.doc_type = doc_type;
           this.last_name = last_name;
           this.name = name;
           this.position = position;
           this.salary = salary;
    }
    public Employee(
    		java.lang.Long id,
    		java.lang.String name,
    		java.lang.String last_name,
    		java.lang.String doc,
            java.lang.String doc_type,
            java.lang.String birthdate,
            java.lang.String bind_date,   
            java.lang.String position,
            java.lang.Double salary,
            java.lang.String age,           
            java.lang.String bindingTime) {
           this.age = age;
           this.bind_date = bind_date;
           this.bindingTime = bindingTime;
           this.birthdate = birthdate;
           this.doc = doc;
           this.doc_type = doc_type;
           this.id = id;
           this.last_name = last_name;
           this.name = name;
           this.position = position;
           this.salary = salary;
    }


    /**
     * Gets the age value for this Employee.
     * 
     * @return age
     */
    public java.lang.String getAge() {
        return age;
    }


    /**
     * Sets the age value for this Employee.
     * 
     * @param age
     */
    public void setAge(java.lang.String age) {
        this.age = age;
    }


    /**
     * Gets the bind_date value for this Employee.
     * 
     * @return bind_date
     */
    public java.lang.String getBind_date() {
        return bind_date;
    }


    /**
     * Sets the bind_date value for this Employee.
     * 
     * @param bind_date
     */
    public void setBind_date(java.lang.String bind_date) {
        this.bind_date = bind_date;
    }


    /**
     * Gets the bindingTime value for this Employee.
     * 
     * @return bindingTime
     */
    public java.lang.String getBindingTime() {
        return bindingTime;
    }


    /**
     * Sets the bindingTime value for this Employee.
     * 
     * @param bindingTime
     */
    public void setBindingTime(java.lang.String bindingTime) {
        this.bindingTime = bindingTime;
    }


    /**
     * Gets the birthdate value for this Employee.
     * 
     * @return birthdate
     */
    public java.lang.String getBirthdate() {
        return birthdate;
    }


    /**
     * Sets the birthdate value for this Employee.
     * 
     * @param birthdate
     */
    public void setBirthdate(java.lang.String birthdate) {
        this.birthdate = birthdate;
    }


    /**
     * Gets the doc value for this Employee.
     * 
     * @return doc
     */
    public java.lang.String getDoc() {
        return doc;
    }


    /**
     * Sets the doc value for this Employee.
     * 
     * @param doc
     */
    public void setDoc(java.lang.String doc) {
        this.doc = doc;
    }


    /**
     * Gets the doc_type value for this Employee.
     * 
     * @return doc_type
     */
    public java.lang.String getDoc_type() {
        return doc_type;
    }


    /**
     * Sets the doc_type value for this Employee.
     * 
     * @param doc_type
     */
    public void setDoc_type(java.lang.String doc_type) {
        this.doc_type = doc_type;
    }


    /**
     * Gets the id value for this Employee.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Employee.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the last_name value for this Employee.
     * 
     * @return last_name
     */
    public java.lang.String getLast_name() {
        return last_name;
    }


    /**
     * Sets the last_name value for this Employee.
     * 
     * @param last_name
     */
    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }


    /**
     * Gets the name value for this Employee.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Employee.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the position value for this Employee.
     * 
     * @return position
     */
    public java.lang.String getPosition() {
        return position;
    }


    /**
     * Sets the position value for this Employee.
     * 
     * @param position
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }


    /**
     * Gets the salary value for this Employee.
     * 
     * @return salary
     */
    public java.lang.Double getSalary() {
        return salary;
    }


    /**
     * Sets the salary value for this Employee.
     * 
     * @param salary
     */
    public void setSalary(java.lang.Double salary) {
        this.salary = salary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            ((this.bind_date==null && other.getBind_date()==null) || 
             (this.bind_date!=null &&
              this.bind_date.equals(other.getBind_date()))) &&
            ((this.bindingTime==null && other.getBindingTime()==null) || 
             (this.bindingTime!=null &&
              this.bindingTime.equals(other.getBindingTime()))) &&
            ((this.birthdate==null && other.getBirthdate()==null) || 
             (this.birthdate!=null &&
              this.birthdate.equals(other.getBirthdate()))) &&
            ((this.doc==null && other.getDoc()==null) || 
             (this.doc!=null &&
              this.doc.equals(other.getDoc()))) &&
            ((this.doc_type==null && other.getDoc_type()==null) || 
             (this.doc_type!=null &&
              this.doc_type.equals(other.getDoc_type()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.last_name==null && other.getLast_name()==null) || 
             (this.last_name!=null &&
              this.last_name.equals(other.getLast_name()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.salary==null && other.getSalary()==null) || 
             (this.salary!=null &&
              this.salary.equals(other.getSalary())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        if (getBind_date() != null) {
            _hashCode += getBind_date().hashCode();
        }
        if (getBindingTime() != null) {
            _hashCode += getBindingTime().hashCode();
        }
        if (getBirthdate() != null) {
            _hashCode += getBirthdate().hashCode();
        }
        if (getDoc() != null) {
            _hashCode += getDoc().hashCode();
        }
        if (getDoc_type() != null) {
            _hashCode += getDoc_type().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLast_name() != null) {
            _hashCode += getLast_name().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getSalary() != null) {
            _hashCode += getSalary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Employee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://interfaces.crud/", "employee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bind_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bind_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "birthdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doc_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doc_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "salary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
