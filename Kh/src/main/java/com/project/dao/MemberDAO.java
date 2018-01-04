package com.project.dao;
 
import java.util.List;
 
import com.project.cmd.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember();
}


