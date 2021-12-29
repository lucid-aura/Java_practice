package mul.camp.a.dao;

import mul.camp.a.dto.MemberDto;

public interface MemberDao {

	int signup(MemberDto dto);

	String checkID(MemberDto dto);

}
