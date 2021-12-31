package mul.camp.a.dao;

import java.util.List;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

public interface BbsDao {

	List<BbsDto> bbslist(BbsParam param);

	int bbswrite(BbsDto bbs);

	BbsDto getBbs(int seq);

	int bbscountUp(int seq);
	
	int replyBbsUpdate(BbsDto dto);
	int replyBbsInsert(BbsDto dto);

	int bbsupdate(BbsDto bbs);

	int bbsdelete(int seq);

	int bbsdelupdate(int seq);
}
