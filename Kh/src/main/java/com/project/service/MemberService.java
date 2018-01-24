package com.project.service;
 
import java.util.List;
import java.util.Map;

import com.project.cmd.MemberVO;
 
public interface MemberService {
    
    public List<MemberVO> selectMember(MemberVO vo);
//    public List<Map<String,Object>> selectMember1();
}

