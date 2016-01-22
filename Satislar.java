/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carihsp;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Akcay
 */
@Entity
@Table(name = "satislar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Satislar.findAll", query = "SELECT s FROM Satislar s"),
    @NamedQuery(name = "Satislar.findBySatisId", query = "SELECT s FROM Satislar s WHERE s.satisId = :satisId"),
    @NamedQuery(name = "Satislar.findByMusteriId", query = "SELECT s FROM Satislar s WHERE s.musteriId = :musteriId"),
    @NamedQuery(name = "Satislar.findByUrunId", query = "SELECT s FROM Satislar s WHERE s.urunId = :urunId"),
    @NamedQuery(name = "Satislar.findByAdet", query = "SELECT s FROM Satislar s WHERE s.adet = :adet"),
    @NamedQuery(name = "Satislar.findByTarih", query = "SELECT s FROM Satislar s WHERE s.tarih = :tarih")})
public class Satislar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "satis_id")
    private Integer satisId;
    @Column(name = "musteri_id")
    private Integer musteriId;
    @Column(name = "urun_id")
    private Integer urunId;
    @Column(name = "adet")
    private Integer adet;
    @Column(name = "tarih")
    @Temporal(TemporalType.DATE)
    private Date tarih;

    public Satislar() {
    }

    public Satislar(Integer satisId) {
        this.satisId = satisId;
    }

    public Integer getSatisId() {
        return satisId;
    }

    public void setSatisId(Integer satisId) {
        this.satisId = satisId;
    }

    public Integer getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Integer musteriId) {
        this.musteriId = musteriId;
    }

    public Integer getUrunId() {
        return urunId;
    }

    public void setUrunId(Integer urunId) {
        this.urunId = urunId;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (satisId != null ? satisId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Satislar)) {
            return false;
        }
        Satislar other = (Satislar) object;
        if ((this.satisId == null && other.satisId != null) || (this.satisId != null && !this.satisId.equals(other.satisId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carihsp.Satislar[ satisId=" + satisId + " ]";
    }
    
}
