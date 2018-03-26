
package my.web.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.web.services package. 
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

    private final static QName _FileSize_QNAME = new QName("http://services.web.my/", "fileSize");
    private final static QName _FileSizeResponse_QNAME = new QName("http://services.web.my/", "fileSizeResponse");
    private final static QName _FileSizeFileContents_QNAME = new QName("", "fileContents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.web.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileSize }
     * 
     */
    public FileSize createFileSize() {
        return new FileSize();
    }

    /**
     * Create an instance of {@link FileSizeResponse }
     * 
     */
    public FileSizeResponse createFileSizeResponse() {
        return new FileSizeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.my/", name = "fileSize")
    public JAXBElement<FileSize> createFileSize(FileSize value) {
        return new JAXBElement<FileSize>(_FileSize_QNAME, FileSize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.my/", name = "fileSizeResponse")
    public JAXBElement<FileSizeResponse> createFileSizeResponse(FileSizeResponse value) {
        return new JAXBElement<FileSizeResponse>(_FileSizeResponse_QNAME, FileSizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fileContents", scope = FileSize.class)
    public JAXBElement<byte[]> createFileSizeFileContents(byte[] value) {
        return new JAXBElement<byte[]>(_FileSizeFileContents_QNAME, byte[].class, FileSize.class, ((byte[]) value));
    }

}
