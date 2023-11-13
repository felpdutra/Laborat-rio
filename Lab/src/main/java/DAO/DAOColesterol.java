/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectionJBDC;
import Paciente.entity.Colesterol;
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
public class DAOColesterol {
    
    public void salvarColesterol(Paciente paciente, Colesterol colesterol) {
        
        String sql = "INSERT INTO dadosexamecolesterol (nome, tpsangue, idade, quantidadeColesterolHDL, quantidadeColesterolLDL) VALUES (?,?,?,?,?)";
    
        PreparedStatement ps;
        
        try {
            ps = ConnectionJBDC.getConn().prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getTpSangue());
            
            //Formatando DATA para enviar para o BANCO DE DADOS
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getTpSangue()); 
            ps.setInt(3, paciente.getIdade());         
            ps.setInt(4,colesterol.getHDL());
            ps.setInt(5,colesterol.getLDL());
            
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível enviar dados para o BD.");
            
        }
        
        JOptionPane.showMessageDialog(null, "Exame salvo.");
        
    };
    
    public Consulta buscarExameColesterol(String nome){
        
        Consulta consulta = new Consulta();
        String sql = "SELECT nome, tpsangue, idade, quantidadeColesterolHDL, quantidadeColesterolLDL FROM dadosexamecolesterol WHERE nome = ?";
        
        PreparedStatement ps;
        ResultSet rs;
        
        try {
            ps = ConnectionJBDC.getConn().prepareStatement(sql);
            ps.setString(1, nome);
            
            rs = ps.executeQuery();
            if(rs.next()){
                consulta.setNomeConsulta(rs.getString("nome"));
                consulta.setTpSangueConsulta(rs.getString("tpsangue"));
                consulta.setidadeConsulta(rs.getInt("idade"));
                consulta.setQtdColesterolHDLConsulta(rs.getInt("quantidadeColesterolHDL"));
                consulta.setQtdColesterolLDLConsulta(rs.getInt("quantidadeColesterolLDL"));
                
                return consulta;
            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            return null;
        }
        
        
        
    };
    
    
    
    
    
    
    
    
    
    
    
    
    
}
