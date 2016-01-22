/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carihsp;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Akcay
 */
@Entity
@Table(name = "kullanicilar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kullanicilar.findAll", query = "SELECT k FROM Kullanicilar k"),
    @NamedQuery(name = "Kullanicilar.findByKulId", query = "SELECT k FROM Kullanicilar k WHERE k.kulId = :kulId"),
    @NamedQuery(name = "Kullanicilar.findByAdi", query = "SELECT k FROM Kullanicilar k WHERE k.adi = :adi"),
    @NamedQuery(name = "Kullanicilar.findBySoyadi", query = "SELECT k FROM Kullanicilar k WHERE k.soyadi = :soyadi"),
    @NamedQuery(name = "Kullanicilar.findByMail", query = "SELECT k FROM Kullanicilar k WHERE k.mail = :mail"),
    @NamedQuery(name = "Kullanicilar.findByTelefon", query = "SELECT k FROM Kullanicilar k WHERE k.telefon = :telefon"),
    @NamedQuery(name = "Kullanicilar.findByKulAdi", query = "SELECT k FROM Kullanicilar k WHERE k.kulAdi = :kulAdi"),
    @NamedQuery(name = "Kullanicilar.findBySifre", query = "SELECT k FROM Kullanicilar k WHERE k.sifre = :sifre")})
public class Kullanicilar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kul_id")
    private Integer kulId;
    @Column(name = "adi")
    private String adi;
    @Column(name = "soyadi")
    private String soyadi;
    @Column(name = "mail")
    private String mail;
    @Column(name = "telefon")
    private String telefon;
    @Column(name = "kul_adi")
    private String kulAdi;
    @Column(name = "sifre")
    private String sifre;

    public Kullanicilar() {
    }

    public Kullanicilar(Integer kulId) {
        this.kulId = kulId;
    }

    public Integer getKulId() {
        return kulId;
    }

    public void setKulId(Integer kulId) {
        this.kulId = kulId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getKulAdi() {
        return kulAdi;
    }

    public void setKulAdi(String kulAdi) {
        this.kulAdi = kulAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kulId != null ? kulId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kullanicilar)) {
            return false;
        }
        Kullanicilar other = (Kullanicilar) object;
        if ((this.kulId == null && other.kulId != null) || (this.kulId != null && !this.kulId.equals(other.kulId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carihsp.Kullanicilar[ kulId=" + kulId + " ]";
    }
    
}
