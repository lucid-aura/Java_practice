package mul.camp.a.service;

import java.util.List;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

public interface BbsService {

	
	List<BbsDto> bbslist(BbsParam param);

	int bbswrite(BbsDto bbs);

	BbsDto getBbs(int seq);

	int bbscountUp(int seq);
	
	void reply(BbsDto dto);

	int bbsupdate(BbsDto bbs);

	int bbsdelete(int seq);

}
