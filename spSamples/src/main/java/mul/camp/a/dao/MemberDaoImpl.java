package mul.camp.a.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mul.camp.a.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession session;
	String ns = "Member.";
	
	@Override
	public int signup(MemberDto dto) {
		int result = session.insert(ns + "signup", dto);
		return result;
	}

	@Override
	public String checkID(MemberDto dto) {
		String result = Integer.toString(session.selectOne(ns+"checkID", dto));
		return result;
	}
}
