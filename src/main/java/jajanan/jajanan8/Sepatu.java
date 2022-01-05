/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jajanan.jajanan8;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Isfandiyar
 */
@Entity
@Table(name = "sepatu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sepatu.findAll", query = "SELECT s FROM Sepatu s"),
    @NamedQuery(name = "Sepatu.findByNamaProduk", query = "SELECT s FROM Sepatu s WHERE s.namaProduk = :namaProduk"),
    @NamedQuery(name = "Sepatu.findByIDProduk", query = "SELECT s FROM Sepatu s WHERE s.iDProduk = :iDProduk"),
    @NamedQuery(name = "Sepatu.findByHarga", query = "SELECT s FROM Sepatu s WHERE s.harga = :harga"),
    @NamedQuery(name = "Sepatu.findByMerk", query = "SELECT s FROM Sepatu s WHERE s.merk = :merk")})
public class Sepatu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "NamaProduk")
    private String namaProduk;
    @Id
    @Basic(optional = false)
    @Column(name = "IDProduk")
    private String iDProduk;
    @Column(name = "Harga")
    private String harga;
    @Column(name = "Merk")
    private String merk;

    public Sepatu() {
    }

    public Sepatu(String iDProduk) {
        this.iDProduk = iDProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getIDProduk() {
        return iDProduk;
    }

    public void setIDProduk(String iDProduk) {
        this.iDProduk = iDProduk;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProduk != null ? iDProduk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sepatu)) {
            return false;
        }
        Sepatu other = (Sepatu) object;
        if ((this.iDProduk == null && other.iDProduk != null) || (this.iDProduk != null && !this.iDProduk.equals(other.iDProduk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jajanan.jajanan8.Sepatu[ iDProduk=" + iDProduk + " ]";
    }
    
}
