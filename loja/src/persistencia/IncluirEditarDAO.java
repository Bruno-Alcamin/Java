package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Pessoas;

public class IncluirEditarDAO {
	
	Pessoas objpes = new Pessoas();
	
	public int Incluir (Pessoas objpes) throws SQLException{
		
		conexao conexao = new conexao();
		
		int registros;
		
		try (PreparedStatement pstmt =  conexao.getConexao().prepareStatement
				("INSERT INTO pessoas (pes_nome, pes_rg, pes_cpg,pes_end,pes_tel,pes_dtcadastro,pes_status)"+
		"VALUES(?,?,?,?,?,?,?)")){
			
			pstmt.setString(1,objpes.getPes_nome().toUpperCase().trim());
			pstmt.setString(2,objpes.getPes_rg().trim());
			pstmt.setString(3,objpes.getPes_cpg().trim());
			pstmt.setString(4,objpes.getPes_end().trim());
			pstmt.setString(5,objpes.getPes_tel().trim());
			pstmt.setString(6,objpes.getPes_dtcadastro().trim());
			pstmt.setInt(7,objpes.getPes_status());
			
			registros = pstmt.executeUpdate();
			
		}
				
		PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
		ResultSet rs = pstmtAux.executeQuery();
		int codigo =0;
		
		if ((registros==1)&&(rs !=null)){
			rs.next();
			codigo = rs.getInt(1);
			return codigo;
		}else{
			return codigo;
		}	
		
	}
	
}
