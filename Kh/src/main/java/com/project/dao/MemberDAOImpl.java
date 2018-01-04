package com.project.dao;
 
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.project.cmd.MemberVO;
 
@Repository
public class MemberDAOImpl implements MemberDAO {
	 private static final Logger logger = LoggerFactory.getLogger(MemberDAOImpl.class);
    @Inject
    private SqlSession sqlSession;
    
    private static final String Namespace = "com.project.mapper.memberMapper";
    @Override
    public List<MemberVO> selectMember() {
    	System.out.println("aaaaaaaaaaaaaaaa : " + sqlSession);
 
        return sqlSession.selectList(Namespace+".selectMember");
    }
 
}


