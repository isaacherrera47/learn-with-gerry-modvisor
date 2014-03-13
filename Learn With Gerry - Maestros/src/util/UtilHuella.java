/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bd.ConexionBD;
import clases.PerfilCarga;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac
 */
public class UtilHuella {

    private DPFPCapture lector;
    private DPFPEnrollment reclutador;
    private DPFPVerification verificador;
    private DPFPTemplate template;
    public static DPFPFeatureSet featureInscripcion;
    public static DPFPFeatureSet featureVerificacion;

    public UtilHuella() {
        lector = DPFPGlobal.getCaptureFactory().createCapture();
        reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
        verificador = DPFPGlobal.getVerificationFactory().createVerification();
    }
    
    public void verificarHuella(){
        try {
            ConexionBD.abrirConexion();
            String sql= "SELECT * FROM huella;";
            PreparedStatement ps= ConexionBD.con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                byte templateBuffer[] = rs.getBytes(2);
                DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
                setTemplate(referenceTemplate);
                DPFPVerificationResult result= verificador.verify(featureVerificacion, getTemplate());
                if(result.isVerified()){
                    String usuario = rs.getString("iduser");
                    ps= ConexionBD.con.prepareCall("cargarperfilhuella(?)");
                    ps.setString(1, usuario);
                    rs= ps.executeQuery();
                    if(rs.first()){
                        
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UtilHuella.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DPFPCapture getLector() {
        return lector;
    }

    public void setLector(DPFPCapture lector) {
        this.lector = lector;
    }

    public DPFPEnrollment getReclutador() {
        return reclutador;
    }

    public void setReclutador(DPFPEnrollment reclutador) {
        this.reclutador = reclutador;
    }

    public DPFPVerification getVerificador() {
        return verificador;
    }

    public void setVerificador(DPFPVerification verificador) {
        this.verificador = verificador;
    }

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        this.template = template;
    }
    
    
}
