package com.maple.originmapleapp.service;

import com.maple.originmapleapp.entity.BoardEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    List<BoardEntity> getBoardListAll();

    BoardEntity boardInsert(BoardEntity boardEntity);

}
