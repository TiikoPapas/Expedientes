/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author tiiko
 */
@Entity
@Table(name = "medico", catalog = "cia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Medico_1.findAll", query = "SELECT m FROM Medico_1 m"),
    @NamedQuery(name = "Medico_1.findByIdMedico", query = "SELECT m FROM Medico_1 m WHERE m.idMedico = :idMedico"),
    @NamedQuery(name = "Medico_1.findByMNombre", query = "SELECT m FROM Medico_1 m WHERE m.mNombre = :mNombre"),
    @NamedQuery(name = "Medico_1.findByMAPaterno", query = "SELECT m FROM Medico_1 m WHERE m.mAPaterno = :mAPaterno"),
    @NamedQuery(name = "Medico_1.findByMAMaterno", query = "SELECT m FROM Medico_1 m WHERE m.mAMaterno = :mAMaterno"),
    @NamedQuery(name = "Medico_1.findByEspecialidad", query = "SELECT m FROM Medico_1 m WHERE m.especialidad = :especialidad"),
    @NamedQuery(name = "Medico_1.findByCedula", query = "SELECT m FROM Medico_1 m WHERE m.cedula = :cedula")})
public class Medico_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMedico")
    private Integer idMedico;
    @Basic(optional = false)
    @Column(name = "mNombre")
    private String mNombre;
    @Basic(optional = false)
    @Column(name = "mAPaterno")
    private String mAPaterno;
    @Basic(optional = false)
    @Column(name = "mAMaterno")
    private String mAMaterno;
    @Basic(optional = false)
    @Column(name = "especialidad")
    private String especialidad;
    @Basic(optional = false)
    @Column(name = "cedula")
    private String cedula;

    public Medico_1() {
    }

    public Medico_1(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Medico_1(Integer idMedico, String mNombre, String mAPaterno, String mAMaterno, String especialidad, String cedula) {
        this.idMedico = idMedico;
        this.mNombre = mNombre;
        this.mAPaterno = mAPaterno;
        this.mAMaterno = mAMaterno;
        this.especialidad = especialidad;
        this.cedula = cedula;
    }

    Medico_1(String nombre, String aPaterno, String aMaterno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Medico_1(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        Integer oldIdMedico = this.idMedico;
        this.idMedico = idMedico;
        changeSupport.firePropertyChange("idMedico", oldIdMedico, idMedico);
    }

    public String getMNombre() {
        return mNombre;
    }

    public void setMNombre(String mNombre) {
        String oldMNombre = this.mNombre;
        this.mNombre = mNombre;
        changeSupport.firePropertyChange("MNombre", oldMNombre, mNombre);
    }

    public String getMAPaterno() {
        return mAPaterno;
    }

    public void setMAPaterno(String mAPaterno) {
        String oldMAPaterno = this.mAPaterno;
        this.mAPaterno = mAPaterno;
        changeSupport.firePropertyChange("MAPaterno", oldMAPaterno, mAPaterno);
    }

    public String getMAMaterno() {
        return mAMaterno;
    }

    public void setMAMaterno(String mAMaterno) {
        String oldMAMaterno = this.mAMaterno;
        this.mAMaterno = mAMaterno;
        changeSupport.firePropertyChange("MAMaterno", oldMAMaterno, mAMaterno);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        String oldEspecialidad = this.especialidad;
        this.especialidad = especialidad;
        changeSupport.firePropertyChange("especialidad", oldEspecialidad, especialidad);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        String oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedico != null ? idMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico_1)) {
            return false;
        }
        Medico_1 other = (Medico_1) object;
        if ((this.idMedico == null && other.idMedico != null) || (this.idMedico != null && !this.idMedico.equals(other.idMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.Medico_1[ idMedico=" + idMedico + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
