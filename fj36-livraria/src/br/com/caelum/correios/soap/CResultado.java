/**
 * CResultado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.caelum.correios.soap;

public class CResultado  implements java.io.Serializable {
    private br.com.caelum.correios.soap.CServico[] servicos;

    public CResultado() {
    }

    public CResultado(
           br.com.caelum.correios.soap.CServico[] servicos) {
           this.servicos = servicos;
    }


    /**
     * Gets the servicos value for this CResultado.
     * 
     * @return servicos
     */
    public br.com.caelum.correios.soap.CServico[] getServicos() {
        return servicos;
    }


    /**
     * Sets the servicos value for this CResultado.
     * 
     * @param servicos
     */
    public void setServicos(br.com.caelum.correios.soap.CServico[] servicos) {
        this.servicos = servicos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CResultado)) return false;
        CResultado other = (CResultado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicos==null && other.getServicos()==null) || 
             (this.servicos!=null &&
              java.util.Arrays.equals(this.servicos, other.getServicos())));
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
        if (getServicos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CResultado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cResultado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Servicos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cServico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "cServico"));
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
