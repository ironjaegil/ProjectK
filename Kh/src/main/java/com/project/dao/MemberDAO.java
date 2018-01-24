package com.project.dao;
 
import java.util.List;
import java.util.Map;

import com.project.cmd.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember(MemberVO vo);
}


