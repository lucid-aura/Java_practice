package mul.camp.a.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mul.camp.a.dao.MemberDao;
import mul.camp.a.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao dao;
	
	@Override
	public int signup(MemberDto dto) {
		
		return dao.signup(dto);
	}

	@Override
	public String checkID(MemberDto dto) {
		return dao.checkID(dto);
	}
}
