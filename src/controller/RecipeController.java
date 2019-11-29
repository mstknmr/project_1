package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Recipe;

public class RecipeController {

	public ArrayList<Recipe> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "select * from recipe";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			ArrayList<Recipe> recipes = new ArrayList<>();
			while(rs.next()) {
				Recipe recipe = new Recipe();
				recipe.setId(rs.getInt("id"));
				recipe.setImgId(rs.getString("imgid"));
				recipe.setName(rs.getString("name"));
				recipe.setTyoumiryou(rs.getString("tyoumiryou").split(","));
				recipe.setZairyou(rs.getString("zairyou").split(","));
				recipes.add(recipe);
			}
			System.out.println(recipes.toString());
			return recipes;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBManager.closeConnection(con);
		}
		return null;
		
	}
}
