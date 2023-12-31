package com.project.jeans.service.mypage;

import com.project.jeans.domain.member.dto.MemberDTO;
import com.project.jeans.domain.mypage.dao.MyPageDAO;
import com.project.jeans.domain.mypage.dto.MyPageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MyPageServiceImpl implements MyPageService {

    @Autowired
    private MyPageDAO myPageDAO;

    @Override
    public int addEvent(MyPageDTO myPageDTO) {
        return myPageDAO.addEvent(myPageDTO);
    }

    @Override
    public List<MyPageDTO> selectEvent(String member_id) {
        return myPageDAO.selectEvent(member_id);
    }

    @Override
    public MemberDTO selectMember(String member_id) {
        return myPageDAO.selectMember(member_id);
    }
    @Override
    public List<MyPageDTO> selectboard(String member_id) {
        return myPageDAO.selectboard(member_id);
    }
    @Override
    public List<MyPageDTO> selectQA(String member_id) {
        return myPageDAO.selectboard(member_id);
    }

    //마이페이지 일정 삭제
    @Override
    public int eventDelete(int mypage_no) {
        return myPageDAO.eventDelete(mypage_no);
    }

    //출석체크
    @Override
    public int addAttend(MyPageDTO myPageDTO){return myPageDAO.addAttend(myPageDTO);}

    //출석체크 불러오기
    @Override
    public MyPageDTO loadAttend(String member_id){return myPageDAO.loadAttend(member_id);}

}
