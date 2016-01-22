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
@Table(name = "urunler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Urunler.findAll", query = "SELECT u FROM Urunler u"),
    @NamedQuery(name = "Urunler.findByUrunId", query = "SELECT u FROM Urunler u WHERE u.urunId = :urunId"),
    @NamedQuery(name = "Urunler.findByAdi", query = "SELECT u FROM Urunler u WHERE u.adi = :adi"),
    @NamedQuery(name = "Urunler.findByKategoriId", query = "SELECT u FROM Urunler u WHERE u.kategoriId = :kategoriId"),
    @NamedQuery(name = "Urunler.findByAlisFyt", query = "SELECT u FROM Urunler u WHERE u.alisFyt = :alisFyt"),
    @NamedQuery(name = "Urunler.findBySatisFyt", query = "SELECT u FROM Urunler u WHERE u.satisFyt = :satisFyt"),
    @NamedQuery(name = "Urunler.findByStok", query = "SELECT u FROM Urunler u WHERE u.stok = :stok"),
    @NamedQuery(name = "Urunler.findByAciklama", query = "SELECT u FROM Urunler u WHERE u.aciklama = :aciklama")})
public class Urunler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "urun_id")
    private Integer urunId;
    @Column(name = "adi")
    private String adi;
    @Column(name = "kategori_id")
    private Integer kategoriId;
    @Column(name = "alis_fyt")
    private String alisFyt;
    @Column(name = "satis_fyt")
    private String satisFyt;
    @Column(name = "stok")
    private Integer stok;
    @Column(name = "aciklama")
    private String aciklama;

    public Urunler() {
    }

    public Urunler(Integer urunId) {
        this.urunId = urunId;
    }

    public Integer getUrunId() {
        return urunId;
    }

    public void setUrunId(Integer urunId) {
        this.urunId = urunId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Integer getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(Integer kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getAlisFyt() {
        return alisFyt;
    }

    public void setAlisFyt(String alisFyt) {
        this.alisFyt = alisFyt;
    }

    public String getSatisFyt() {
        return satisFyt;
    }

    public void setSatisFyt(String satisFyt) {
        this.satisFyt = satisFyt;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (urunId != null ? urunId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Urunler)) {
            return false;
        }
        Urunler other = (Urunler) object;
        if ((this.urunId == null && other.urunId != null) || (this.urunId != null && !this.urunId.equals(other.urunId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carihsp.Urunler[ urunId=" + urunId + " ]";
    }
    
}
