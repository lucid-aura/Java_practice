package mul.camp.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mul.camp.a.dao.BbsDao;
import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

@Service
public class BbsServiceImpl implements BbsService {

	@Autowired
	BbsDao dao;

	@Override
	public List<BbsDto> bbslist(BbsParam param) {
		return dao.bbslist(param);
	}

	@Override
	public int bbswrite(BbsDto bbs) {
		return dao.bbswrite(bbs);
	}

	@Override
	public BbsDto getBbs(int seq) {
		return dao.getBbs(seq);
	}

	@Override
	public int bbscountUp(int seq) {
		return dao.bbscountUp(seq);
	}

	@Override
	public void reply(BbsDto dto) {
		int n = dao.replyBbsUpdate(dto);
		if (n == 0) {
			System.out.println("replyBbsUpdate Fail");
		}
		
		n = dao.replyBbsInsert(dto);
		if (n == 0) {
			System.out.println("replyBbsInsert Fail");
		}
	}

	@Override
	public int bbsupdate(BbsDto bbs) {
		return dao.bbsupdate(bbs);
	}

	@Override
	public int bbsdelete(int seq) {
		return dao.bbsdelupdate(seq);
	}

}
