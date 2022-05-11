package j21_데이터베이스.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.HashMap;

import db.DBConnectionMgr;
import j21_데이터베이스.dto.User;
import j21_데이터베이스.dto.UserDtl;
import j21_데이터베이스.dto.UserMst;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserDao {
	private final DBConnectionMgr pool;
	
	public ArrayList<UserMst> getUserMstAll(){
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<UserMst> userMstList = new ArrayList<UserMst>();
		
		try {
			con = pool.getConnection();
			sql = "SELECT\r\n"
					+ "	*\r\n"
					+ "FROM\r\n"
					+ "	user_mst";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserMst um = UserMst.builder()
						.usercode(rs.getInt(1))
						.email(rs.getString(2))
						.name(rs.getString(3))
						.username(rs.getString(4))
						.password(rs.getString(5))
						.create_date(rs.getTimestamp(6).toLocalDateTime())
						.update_date(rs.getTimestamp(7).toLocalDateTime())
						.build();
				
				userMstList.add(um);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return userMstList;
	}
	public ArrayList<UserDtl> getUserDtlAll(){
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<UserDtl> userDtlList = new ArrayList<UserDtl>();
		
		try {
			con = pool.getConnection();
			sql = "select * from user_dtl";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserDtl ud = UserDtl.builder()
						.usercode(rs.getInt(1))
						.address(rs.getString(2))
						.phone(rs.getString(3))
						.gender(rs.getInt(4))
						.create_date(rs.getTimestamp(5).toLocalDateTime())
						.update_date(rs.getTimestamp(6).toLocalDateTime())
						.build();
				
				userDtlList.add(ud);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return userDtlList;
	}
	
	public HashMap<String, User> getUserByUsername(String username) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		HashMap<String, User> userMap = new HashMap<String, User>();
		
		try {
			con = pool.getConnection();
			sql = "SELECT\r\n"
					+ "	*\r\n"
					+ "FROM\r\n"
					+ "	user_mst um\r\n"
					+ "	LEFT OUTER JOIN user_dtl ud ON(ud.usercode = um.usercode)\r\n"
					+ "WHERE\r\n"
					+ "	um.username = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			rs = pstmt.executeQuery();
			
			
			
			try {
				rs.next();
				UserMst um = UserMst.builder()
						.usercode(rs.getInt(1))
						.email(rs.getString(2))
						.name(rs.getString(3))
						.username(rs.getString(4))
						.password(rs.getString(5))
						.create_date(rs.getTimestamp(6).toLocalDateTime())
						.update_date(rs.getTimestamp(7).toLocalDateTime())
						.build();
				
				UserDtl ud = UserDtl.builder()
						.usercode(rs.getInt(8))
						.address(rs.getString(9))
						.phone(rs.getString(10))
						.gender(rs.getInt(11))
						.create_date(rs.getTimestamp(12).toLocalDateTime())
						.update_date(rs.getTimestamp(13).toLocalDateTime())
						.build();
				
				userMap.put("um", um);
				userMap.put("ud", ud);
						
			}catch (SQLDataException e) {
				System.out.println("해당 username으로 데이터를 찾을 수 없습니다.");
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(rs.getInt(1));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return userMap;
	}
	
	public int inserUserMst(ArrayList<UserMst> userList) {
		StringBuilder sqlBuilder = new StringBuilder();
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = pool.getConnection();
			
			sqlBuilder.append("INSERT INTO\r\n"
							+ "	user_mst\r\n"
							+ "VALUES\r\n");
			
			for(int i = 0; i < userList.size(); i++) {
				
				sqlBuilder.append("(\r\n"
						+ "	0,\r\n"
						+ "	?,\r\n"
						+ "	?,\r\n"
						+ "	?,\r\n"
						+ "	?,\r\n"
						+ "	NOW(),\r\n"
						+ "	NOW()\r\n"
						+ "),");
			}
			
			sqlBuilder.delete(sqlBuilder.length() - 1, sqlBuilder.length());
			
			pstmt = con.prepareStatement(sqlBuilder.toString());
			
			for(int i = 0; i < userList.size(); i++) {
				pstmt.setString((i * 4) + 1, userList.get(i).getEmail());
				pstmt.setString((i * 4) + 2, userList.get(i).getName());
				pstmt.setString((i * 4) + 3, userList.get(i).getUsername());
				pstmt.setString((i * 4) + 4, userList.get(i).getPassword());
			}
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
	}
	
	public int updateUserDtl(String username, UserDtl userDtl) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = pool.getConnection();
			sql = "UPDATE\r\n"
					+ "	user_dtl\r\n"
					+ "SET\r\n"
					+ "	address = ?,\r\n"
					+ "	phone = ?,\r\n"
					+ "	gender = ?\r\n"
					+ "WHERE\r\n"
					+ "	usercode = (select\r\n"
					+ "						usercode\r\n"
					+ "					from\r\n"
					+ "						user_mst\r\n"
					+ "					where\r\n"
					+ "						username = ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userDtl.getAddress());
			pstmt.setString(2, userDtl.getPhone());
			pstmt.setInt(3, userDtl.getGender());
			pstmt.setString(4, username);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return result;
	}
}








