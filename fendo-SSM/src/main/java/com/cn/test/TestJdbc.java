package com.cn.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

import com.cn.utils.JDBCUtil;



public class TestJdbc {
	
	@Test
	public void test(){
		Connection conn=JDBCUtil.getConnection();
		System.out.println(conn);
		Statement st=null;
		ResultSet rs=null;
		try{
			
			st= conn.createStatement();
			rs=st.executeQuery("select * from user");
			while(rs.next()){
				String name=rs.getString("username");
				System.out.println(name);
				
			} 
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	
	
}
