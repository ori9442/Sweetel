package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import util.MemberDAO;
import vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO dao;
	
	@Override
	public int delete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insert(MemberVO vo) {
		return dao.insert(vo);
	}
	@Override
	public List<MemberVO> selectList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberVO selectOne(MemberVO vo) {
		return dao.selectOne(vo);
	}
	@Override
	public int update(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
