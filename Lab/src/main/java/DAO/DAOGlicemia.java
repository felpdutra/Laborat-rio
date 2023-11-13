/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectionJBDC;
import Paciente.entity.Glicemia;
import Paciente.entity.Paciente;
import View.Consulta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Felype
 */
public class DAOGlicemia {
    
    public void salvarGlicemia(Paciente paciente, Glicemia glicemia) {
        
        String sql = "INSERT INTO dadosexameglicemia (nome, tpSangue, idade, quantidadeGlicemia) VALUES (?,?,?,?)";
    
        PreparedStatement ps;
        
        try {
            ps = ConnectionJBDC.getConn().prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getTpSangue());  
            ps.setInt(3, paciente.getIdade());         
            ps.setInt(4,glicemia.getGlicose());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível enviar dados para o BD.");
            
        }
        
        JOptionPane.showMessageDialog(null, "Exame salvo.");
        
    };
    
    public Consulta buscarExameGlicemia(String nome){
        String sql = "SELECT nome, tpSangue, idade, quantidadeGlicemia FROM dadosexameglicemia WHERE nome = ?";
    
        PreparedStatement ps;
        ResultSet rs;
     
        try {
            Consulta consulta = new Consulta();
            
            
            ps = ConnectionJBDC.getConn().prepareStatement(sql);
            ps.setString(1, nome);
            
            rs= ps.executeQuery();
            
            if(rs.next()){
                 consulta.setNomeConsulta(rs.getString("nome"));
                consulta.setTpSangueConsulta(rs.getString("tpSangue"));
                consulta.setidadeConsulta(rs.getInt("idade"));
                consulta.setQtdGlicemiaConsulta(rs.getInt("quantidadeGlicemia"));
                
                return consulta;
            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            return null;
        }
        
    
    };

    public Consulta buscarExameColesterol(String nomeCon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
