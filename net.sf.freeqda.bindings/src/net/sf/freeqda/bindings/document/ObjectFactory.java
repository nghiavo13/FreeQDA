/*******************************************************************************
 * FreeQDA,  a software for professional qualitative research data 
 * analysis, such as interviews, manuscripts, journal articles, memos
 * and field notes.
 *
 * Copyright (C) 2011 Dirk Kitscha, Jörg große Schlarmann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.01 at 07:29:36 PM MEZ 
//


package net.sf.freeqda.bindings.document;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sf.net.freeqda.bindings.document package. 
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

    private final static QName _FQDADocument_QNAME = new QName("http://freeqda.sf.net/FQDADocument", "FQDADocument"); //$NON-NLS-1$ //$NON-NLS-2$

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sf.net.freeqda.bindings.document
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppliedTagsListType }
     * 
     */
    public AppliedTagsListType createAppliedTagsListType() {
        return new AppliedTagsListType();
    }

    /**
     * Create an instance of {@link AppliedTagType }
     * 
     */
    public AppliedTagType createAppliedTagType() {
        return new AppliedTagType();
    }

    /**
     * Create an instance of {@link FontType }
     * 
     */
    public FontType createFontType() {
        return new FontType();
    }

    /**
     * Create an instance of {@link FQDADocumentType }
     * 
     */
    public FQDADocumentType createFQDADocumentType() {
        return new FQDADocumentType();
    }

    /**
     * Create an instance of {@link StyleRangeType }
     * 
     */
    public StyleRangeType createStyleRangeType() {
        return new StyleRangeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQDADocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://freeqda.sf.net/FQDADocument", name = "FQDADocument")
    public JAXBElement<FQDADocumentType> createFQDADocument(FQDADocumentType value) {
        return new JAXBElement<FQDADocumentType>(_FQDADocument_QNAME, FQDADocumentType.class, null, value);
    }

}
