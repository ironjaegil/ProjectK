package com.project.service;
 
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
 
import org.springframework.stereotype.Service;
 
import com.project.dao.MemberDAO;
import com.project.cmd.MemberVO;
 
@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberVO> selectMember(MemberVO vo) {
 
        return dao.selectMember(vo);
    }
}


