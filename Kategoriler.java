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
@Table(name = "kategoriler")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kategoriler.findAll", query = "SELECT k FROM Kategoriler k"),
    @NamedQuery(name = "Kategoriler.findByKategoriId", query = "SELECT k FROM Kategoriler k WHERE k.kategoriId = :kategoriId"),
    @NamedQuery(name = "Kategoriler.findByKategoriAdi", query = "SELECT k FROM Kategoriler k WHERE k.kategoriAdi = :kategoriAdi"),
    @NamedQuery(name = "Kategoriler.findByAciklama", query = "SELECT k FROM Kategoriler k WHERE k.aciklama = :aciklama")})
public class Kategoriler implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kategori_id")
    private Integer kategoriId;
    @Column(name = "kategori_adi")
    private String kategoriAdi;
    @Column(name = "aciklama")
    private String aciklama;

    public Kategoriler() {
    }

    public Kategoriler(Integer kategoriId) {
        this.kategoriId = kategoriId;
    }

    public Integer getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(Integer kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
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
        hash += (kategoriId != null ? kategoriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategoriler)) {
            return false;
        }
        Kategoriler other = (Kategoriler) object;
        if ((this.kategoriId == null && other.kategoriId != null) || (this.kategoriId != null && !this.kategoriId.equals(other.kategoriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carihsp.Kategoriler[ kategoriId=" + kategoriId + " ]";
    }
    
}
