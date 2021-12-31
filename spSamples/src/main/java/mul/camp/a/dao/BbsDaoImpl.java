package mul.camp.a.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

@Repository
public class BbsDaoImpl implements BbsDao {
	
	@Autowired
	SqlSession session;
	
	String ns = "Bbs.";

	@Override
	public List<BbsDto> bbslist(BbsParam param) {
		return session.selectList(ns+"bbslist", param);
	}

	@Override
	public int bbswrite(BbsDto bbs) {
		return session.insert(ns+"bbswrite", bbs);
	}

	@Override
	public BbsDto getBbs(int seq) {
		return session.selectOne(ns+ "getBbs", seq);
	}

	@Override
	public int bbscountUp(int seq) {
		return session.update(ns+ "bbscountup", seq);

	}

	@Override
	public int replyBbsUpdate(BbsDto dto) {
		int n = session.update(ns + "replyBbsUpdate", dto);
		return n;
	}

	@Override
	public int replyBbsInsert(BbsDto dto) {
		int n = session.insert(ns + "replyBbsInsert", dto);
		return n;
	}

	@Override
	public int bbsupdate(BbsDto bbs) {
		return session.update(ns + "bbsupdate", bbs);
	}

	@Override
	public int bbsdelete(int seq) {
		return session.delete(ns + "bbsdelete", seq);
	}

	@Override
	public int bbsdelupdate(int seq) {
		return session.update(ns + "bbsdelete", seq);
	}
}
