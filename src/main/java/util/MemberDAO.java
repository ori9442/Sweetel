package util;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	public static String NAMESPACE = "sweetel.mapper.MemberMapper.";
	
	
	public int insert(MemberVO vo) {
		return sqlSession.insert(NAMESPACE+"insert", vo);
	}
	
	public MemberVO selectOne(MemberVO vo) {
		return sqlSession.selectOne(NAMESPACE+"selectOne", vo);
	}
}
