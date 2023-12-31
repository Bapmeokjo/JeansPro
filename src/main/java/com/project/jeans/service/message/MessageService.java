package com.project.jeans.service.message;

import com.project.jeans.domain.member.dto.MemberDTO;
import com.project.jeans.domain.message.dto.MessageDTO;

import java.util.List;
import java.util.Map;

public interface MessageService {

    /* 메시지 목록 조회(수신함) */
    public List<MessageDTO> selectReceiveMessage(String member_id);

    /* 메시지 목록 조회(발신함) */
    public List<MessageDTO> selectSendMessage(String member_id);

    /* 메시지 상세 조회 */
    public MessageDTO selectMessageDetail(int message_no);

    /* 메시지 작성 (수신자 목록) */
    public List<MemberDTO> selectMessageMemList();

    /* 메시지 작성 (내용)*/
    public int insertContentMessage(Map<String,Object> map);

    /* 메시지 삭제 (수신함) */
    public int deleteReceiveMessage(List<Integer> message_no);

    /* 메시지 삭제 (발신함) */
    public int deleteSendMessage(List<Integer> message_no);

    /* 반별 멤버 조회 */
    public List<MemberDTO> selectMemByClass(String member_class);


}
