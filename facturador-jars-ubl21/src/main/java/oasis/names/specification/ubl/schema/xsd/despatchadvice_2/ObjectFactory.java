//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.05.07 a las 10:36:18 AM COT 
//


package oasis.names.specification.ubl.schema.xsd.despatchadvice_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.despatchadvice_2 package. 
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

    private final static QName _DespatchAdvice_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:DespatchAdvice-2", "DespatchAdvice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.despatchadvice_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DespatchAdviceType }
     * 
     */
    public DespatchAdviceType createDespatchAdviceType() {
        return new DespatchAdviceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchAdviceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DespatchAdviceType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:DespatchAdvice-2", name = "DespatchAdvice")
    public JAXBElement<DespatchAdviceType> createDespatchAdvice(DespatchAdviceType value) {
        return new JAXBElement<DespatchAdviceType>(_DespatchAdvice_QNAME, DespatchAdviceType.class, null, value);
    }

}
