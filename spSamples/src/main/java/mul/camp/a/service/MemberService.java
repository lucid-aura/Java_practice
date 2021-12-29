package mul.camp.a.service;

import mul.camp.a.dto.MemberDto;

public interface MemberService {

	int signup(MemberDto dto);
	String checkID(MemberDto dto);

}
