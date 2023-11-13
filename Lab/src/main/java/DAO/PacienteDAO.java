/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.ConnectionJBDC;
import Paciente.entity.Paciente;
import View.DadosPaciente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class PacienteDAO {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    
    public void cadastrarPaciente(Paciente p) {
      
        
        String sql = "INSERT INTO dadospaciente (nome, tpSangue, datanascimento) VALUES (?,?,?)";

        PreparedStatement ps;
        
        try {
            ps = ConnectionJBDC.getConn().prepareStatement(sql);        
            ps.setString(1, p.getNome());              
            ps.setString(2, p.getTpSangue());
            ps.setInt(3,p.getIdade());
           

            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao enviar os dados para o BD");
        }

    }
;

}
