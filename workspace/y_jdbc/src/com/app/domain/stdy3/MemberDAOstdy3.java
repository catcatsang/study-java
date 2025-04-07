package com.app.domain.stdy3;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.stdy4.memberDAOstdy4;
import com.app.domain.vo.MemberVO;
import com.app.jdbc.configuration.Configuration;

public class MemberDAOstdy3 {

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	회원가입
	public void insert(MemberVO memberVO) {
		String query = "INSERT INTO TBL_MEMBER "
				+ "(ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER) "
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?, ?)";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, memberVO.getEmail());
			preparedStatement.setString(2, memberVO.getPassword());
			preparedStatement.setString(3, memberVO.getName());
			preparedStatement.setInt(4, memberVO.getAge());
			preparedStatement.setString(5, memberVO.getGender());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

	}

//	로그인 
	public MemberVO SelectByMemberEmailAndMemberPassword(MemberVO memberVO) {
		MemberVO member = null;
		String query = "SELECT " + "ID, MEMBER_EMAIL, MEMBER_PASSWORD, "
				+ "MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE " + "FROM TBL_MEMBER \"\r\n"
				+ "WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, memberVO.getEmail());
			preparedStatement.setString(2, memberVO.getPassword());

			resultSet = preparedStatement.executeQuery();
//			
			if (resultSet.next()) {
				member = new MemberVO();
//				"ID, MEMBER_EMAIL, MEMBER_PASSWORD, "
//				+ "MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE "
				member.setId(resultSet.getLong(1));
				member.setEmail(resultSet.getString(2));
				member.setPassword(resultSet.getString(3));
				member.setName(resultSet.getString(4));
				member.setAge(resultSet.getInt(5));
				member.setCreated_date(resultSet.getString(6));
				member.setUpdated_date(resultSet.getString(7));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return member;

	}

//	아이디로 회원정보 조회
	public MemberVO insert(Long id) {
		MemberVO member = null;
		String query = "SELECT " + "ID, MEMBER_EMAIL, MEMBER_PASSWORD, "
				+ "MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE " + "FROM TBL_MEMBER "
				+ "WHERE ID = ?";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				member = new MemberVO();

				member.setEmail(resultSet.getString(1));
				member.setPassword(resultSet.getString(2));
				member.setName(resultSet.getString(3));
				member.setAge(resultSet.getInt(4));
				member.setGender(resultSet.getString(5));
				member.setCreated_date(resultSet.getString(6));
				member.setUpdated_date(resultSet.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return member;
	}

//	조회후 수정
	public void UPDATE(MemberVO memberVO) {
		String query = "UPDATE TBL_MEMBER " + "SET MEMBER_NAME = ?, MEMBER_AGE = ?, MEMBER_GENDER = ? "
				+ "WHERE ID = ?";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, memberVO.getName());
			preparedStatement.setInt(2, memberVO.getAge());
			preparedStatement.setString(3, memberVO.getGender());
			preparedStatement.setLong(4, memberVO.getId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	삭제하기

	public void DELETE(Long id) {
		String query = "DELETE FROM TBL_MEMBER " + "WHERE ID = ?";

		connection = Configuration.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	전체조회
	public List<MemberVO> allselect() {
		
		MemberVO member = null;

		List<MemberVO> memberList = new ArrayList<MemberVO>();

		String query = "SELECT * " + "FROM TBL_MEMBER";

		connection = Configuration.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				member = new MemberVO();

				member.setId(resultSet.getLong(1));
				member.setEmail(resultSet.getString(2));
				member.setPassword(resultSet.getString(3));
				member.setName(resultSet.getString(4));
				member.setAge(resultSet.getInt(5));
				member.setGender(resultSet.getString(6));
				member.setCreated_date(resultSet.getString(7));
				member.setUpdated_date(resultSet.getString(8));

				memberList.add(member);

			}
		} catch (SQLException e) {
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return memberList;
	}
//	아이디 중복 검사 , 매개변수로 가져오는 아이디 조회

//  전체 회원 조회(while문 돌려야댐)
//  특정 member 객체가 아닌 전체 회원을 볼 것이기 때문에 매개변수가 필요없음.
     public List<MemberVO> selectAllMembers() {
        MemberVO member = null;
        List<MemberVO> memberList = new ArrayList<MemberVO>();
        String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, "
              + "MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE "
              + "FROM TBL_MEMBER";  
     
        connection = Configuration.getConnection();
        
        try {
        preparedStatement = connection.prepareStatement(query);
        
        resultSet = preparedStatement.executeQuery();
        
//        결과가 있을 경우에 반복하여 회원 정보 리스트에 추가
        while(resultSet.next()) {
            member = new MemberVO();
           
            member.setId(resultSet.getLong(1));   // id
              member.setMemberEmail(resultSet.getString(2));   // 이메일
              member.setMemberPassword(resultSet.getString(3));   // 비밀번호
              member.setMemberName(resultSet.getString(4));   // 이름
              member.setMemberAge(resultSet.getInt(5));   // 나이
              member.setMemberGender(resultSet.getString(6));   // 성별
              member.setCreatedDate(resultSet.getString(7));   // 생성 날짜
              member.setUpdatedDate(resultSet.getString(8));   // 수정 날짜
              
              memberList.add(member);   // 반복하여 member 객체를 memberList에 추가한다.
        }
     } catch (SQLException e) {
        e.printStackTrace();
     } finally {
        try {
           if(resultSet != null) {
              resultSet.close();
           }
           if(preparedStatement != null) {
              preparedStatement.close();
           }
           if(connection != null) {
              connection.close();
           }
        } catch (SQLException e) {
           throw new RuntimeException();
        }
     }
        return memberList;
     }
}
