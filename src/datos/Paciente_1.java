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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author tiiko
 */
@Entity
@Table(name = "paciente", catalog = "cia", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paciente_1.findAll", query = "SELECT p FROM Paciente_1 p"),
    @NamedQuery(name = "Paciente_1.findByIdPaciente", query = "SELECT p FROM Paciente_1 p WHERE p.idPaciente = :idPaciente"),
    @NamedQuery(name = "Paciente_1.findByNombre", query = "SELECT p FROM Paciente_1 p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Paciente_1.findByAPaterno", query = "SELECT p FROM Paciente_1 p WHERE p.aPaterno = :aPaterno"),
    @NamedQuery(name = "Paciente_1.findByAMaterno", query = "SELECT p FROM Paciente_1 p WHERE p.aMaterno = :aMaterno"),
    @NamedQuery(name = "Paciente_1.findByFNacimiento", query = "SELECT p FROM Paciente_1 p WHERE p.fNacimiento = :fNacimiento"),
    @NamedQuery(name = "Paciente_1.findByEdad", query = "SELECT p FROM Paciente_1 p WHERE p.edad = :edad"),
    @NamedQuery(name = "Paciente_1.findByDireccion", query = "SELECT p FROM Paciente_1 p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Paciente_1.findByTelefono", query = "SELECT p FROM Paciente_1 p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Paciente_1.findByFCardiaca", query = "SELECT p FROM Paciente_1 p WHERE p.fCardiaca = :fCardiaca"),
    @NamedQuery(name = "Paciente_1.findByFRespiratoria", query = "SELECT p FROM Paciente_1 p WHERE p.fRespiratoria = :fRespiratoria"),
    @NamedQuery(name = "Paciente_1.findByPSistolica", query = "SELECT p FROM Paciente_1 p WHERE p.pSistolica = :pSistolica"),
    @NamedQuery(name = "Paciente_1.findByPDiastolica", query = "SELECT p FROM Paciente_1 p WHERE p.pDiastolica = :pDiastolica"),
    @NamedQuery(name = "Paciente_1.findByTemperatura", query = "SELECT p FROM Paciente_1 p WHERE p.temperatura = :temperatura"),
    @NamedQuery(name = "Paciente_1.findByCodDiag", query = "SELECT p FROM Paciente_1 p WHERE p.codDiag = :codDiag"),
    @NamedQuery(name = "Paciente_1.findByTipo", query = "SELECT p FROM Paciente_1 p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Paciente_1.findByIdMedico", query = "SELECT p FROM Paciente_1 p WHERE p.idMedico = :idMedico"),
    @NamedQuery(name = "Paciente_1.findByMedicoidMedico", query = "SELECT p FROM Paciente_1 p WHERE p.medicoidMedico = :medicoidMedico")})
public class Paciente_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPaciente")
    private Integer idPaciente;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "aPaterno")
    private String aPaterno;
    @Basic(optional = false)
    @Column(name = "aMaterno")
    private String aMaterno;
    @Basic(optional = false)
    @Column(name = "fNacimiento")
    private String fNacimiento;
    @Basic(optional = false)
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Lob
    @Column(name = "antPersonales")
    private String antPersonales;
    @Basic(optional = false)
    @Column(name = "fCardiaca")
    private String fCardiaca;
    @Basic(optional = false)
    @Column(name = "fRespiratoria")
    private String fRespiratoria;
    @Basic(optional = false)
    @Column(name = "pSistolica")
    private String pSistolica;
    @Basic(optional = false)
    @Column(name = "pDiastolica")
    private String pDiastolica;
    @Basic(optional = false)
    @Column(name = "temperatura")
    private String temperatura;
    @Basic(optional = false)
    @Lob
    @Column(name = "padActual")
    private String padActual;
    @Basic(optional = false)
    @Lob
    @Column(name = "expFisica")
    private String expFisica;
    @Lob
    @Column(name = "evolucion")
    private String evolucion;
    @Lob
    @Column(name = "estGabinete")
    private String estGabinete;
    @Basic(optional = false)
    @Lob
    @Column(name = "diagnostico")
    private String diagnostico;
    @Basic(optional = false)
    @Lob
    @Column(name = "tratamiento")
    private String tratamiento;
    @Column(name = "codDiag")
    private String codDiag;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "idMedico")
    private int idMedico;
    @Basic(optional = false)
    @Column(name = "medico_idMedico")
    private int medicoidMedico;

    public Paciente_1() {
    }

    public Paciente_1(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Paciente_1(Integer idPaciente, String nombre, String aPaterno, String aMaterno, String fNacimiento, int edad, String direccion, String telefono, String antPersonales, String fCardiaca, String fRespiratoria, String pSistolica, String pDiastolica, String temperatura, String padActual, String expFisica, String diagnostico, String tratamiento, String tipo, int idMedico, int medicoidMedico) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.fNacimiento = fNacimiento;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.antPersonales = antPersonales;
        this.fCardiaca = fCardiaca;
        this.fRespiratoria = fRespiratoria;
        this.pSistolica = pSistolica;
        this.pDiastolica = pDiastolica;
        this.temperatura = temperatura;
        this.padActual = padActual;
        this.expFisica = expFisica;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.tipo = tipo;
        this.idMedico = idMedico;
        this.medicoidMedico = medicoidMedico;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        Integer oldIdPaciente = this.idPaciente;
        this.idPaciente = idPaciente;
        changeSupport.firePropertyChange("idPaciente", oldIdPaciente, idPaciente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public String getAPaterno() {
        return aPaterno;
    }

    public void setAPaterno(String aPaterno) {
        String oldAPaterno = this.aPaterno;
        this.aPaterno = aPaterno;
        changeSupport.firePropertyChange("APaterno", oldAPaterno, aPaterno);
    }

    public String getAMaterno() {
        return aMaterno;
    }

    public void setAMaterno(String aMaterno) {
        String oldAMaterno = this.aMaterno;
        this.aMaterno = aMaterno;
        changeSupport.firePropertyChange("AMaterno", oldAMaterno, aMaterno);
    }

    public String getFNacimiento() {
        return fNacimiento;
    }

    public void setFNacimiento(String fNacimiento) {
        String oldFNacimiento = this.fNacimiento;
        this.fNacimiento = fNacimiento;
        changeSupport.firePropertyChange("FNacimiento", oldFNacimiento, fNacimiento);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        int oldEdad = this.edad;
        this.edad = edad;
        changeSupport.firePropertyChange("edad", oldEdad, edad);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        changeSupport.firePropertyChange("direccion", oldDireccion, direccion);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String oldTelefono = this.telefono;
        this.telefono = telefono;
        changeSupport.firePropertyChange("telefono", oldTelefono, telefono);
    }

    public String getAntPersonales() {
        return antPersonales;
    }

    public void setAntPersonales(String antPersonales) {
        String oldAntPersonales = this.antPersonales;
        this.antPersonales = antPersonales;
        changeSupport.firePropertyChange("antPersonales", oldAntPersonales, antPersonales);
    }

    public String getFCardiaca() {
        return fCardiaca;
    }

    public void setFCardiaca(String fCardiaca) {
        String oldFCardiaca = this.fCardiaca;
        this.fCardiaca = fCardiaca;
        changeSupport.firePropertyChange("FCardiaca", oldFCardiaca, fCardiaca);
    }

    public String getFRespiratoria() {
        return fRespiratoria;
    }

    public void setFRespiratoria(String fRespiratoria) {
        String oldFRespiratoria = this.fRespiratoria;
        this.fRespiratoria = fRespiratoria;
        changeSupport.firePropertyChange("FRespiratoria", oldFRespiratoria, fRespiratoria);
    }

    public String getPSistolica() {
        return pSistolica;
    }

    public void setPSistolica(String pSistolica) {
        String oldPSistolica = this.pSistolica;
        this.pSistolica = pSistolica;
        changeSupport.firePropertyChange("PSistolica", oldPSistolica, pSistolica);
    }

    public String getPDiastolica() {
        return pDiastolica;
    }

    public void setPDiastolica(String pDiastolica) {
        String oldPDiastolica = this.pDiastolica;
        this.pDiastolica = pDiastolica;
        changeSupport.firePropertyChange("PDiastolica", oldPDiastolica, pDiastolica);
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        String oldTemperatura = this.temperatura;
        this.temperatura = temperatura;
        changeSupport.firePropertyChange("temperatura", oldTemperatura, temperatura);
    }

    public String getPadActual() {
        return padActual;
    }

    public void setPadActual(String padActual) {
        String oldPadActual = this.padActual;
        this.padActual = padActual;
        changeSupport.firePropertyChange("padActual", oldPadActual, padActual);
    }

    public String getExpFisica() {
        return expFisica;
    }

    public void setExpFisica(String expFisica) {
        String oldExpFisica = this.expFisica;
        this.expFisica = expFisica;
        changeSupport.firePropertyChange("expFisica", oldExpFisica, expFisica);
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        String oldEvolucion = this.evolucion;
        this.evolucion = evolucion;
        changeSupport.firePropertyChange("evolucion", oldEvolucion, evolucion);
    }

    public String getEstGabinete() {
        return estGabinete;
    }

    public void setEstGabinete(String estGabinete) {
        String oldEstGabinete = this.estGabinete;
        this.estGabinete = estGabinete;
        changeSupport.firePropertyChange("estGabinete", oldEstGabinete, estGabinete);
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        String oldDiagnostico = this.diagnostico;
        this.diagnostico = diagnostico;
        changeSupport.firePropertyChange("diagnostico", oldDiagnostico, diagnostico);
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        String oldTratamiento = this.tratamiento;
        this.tratamiento = tratamiento;
        changeSupport.firePropertyChange("tratamiento", oldTratamiento, tratamiento);
    }

    public String getCodDiag() {
        return codDiag;
    }

    public void setCodDiag(String codDiag) {
        String oldCodDiag = this.codDiag;
        this.codDiag = codDiag;
        changeSupport.firePropertyChange("codDiag", oldCodDiag, codDiag);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        int oldIdMedico = this.idMedico;
        this.idMedico = idMedico;
        changeSupport.firePropertyChange("idMedico", oldIdMedico, idMedico);
    }

    public int getMedicoidMedico() {
        return medicoidMedico;
    }

    public void setMedicoidMedico(int medicoidMedico) {
        int oldMedicoidMedico = this.medicoidMedico;
        this.medicoidMedico = medicoidMedico;
        changeSupport.firePropertyChange("medicoidMedico", oldMedicoidMedico, medicoidMedico);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPaciente != null ? idPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente_1)) {
            return false;
        }
        Paciente_1 other = (Paciente_1) object;
        if ((this.idPaciente == null && other.idPaciente != null) || (this.idPaciente != null && !this.idPaciente.equals(other.idPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.Paciente_1[ idPaciente=" + idPaciente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
