package com.project.jeans.domain.board.board4.dao;

import com.project.jeans.domain.board.board1.dto.Board1DTO;
import com.project.jeans.domain.board.board2.dto.Board2DTO;
import com.project.jeans.domain.board.board4.dto.Board4DTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface Board4DAO {

    //게시판 목록 조회(수강생)
    List<Board4DTO> findBoard4All();

    //게시판 목록 조회(강사님)
    List<Board4DTO> findBoard4ByTutor();

    //게시글 5개조회
    List<Board4DTO> findBoard4List();

    //게시글 상세 조회
    Board4DTO findBoard4ByNo(int board4_no);

    //게시글 작성
    int insertBoard4(Map<String, Object> map);

    //게시글 수정
    int updateBoard4(Map<String, Object> map);

    //게시글 삭제
    int deleteBoard4(Map<String, Object> map);
}