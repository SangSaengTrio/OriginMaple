package com.maple.originmapleapp.service.impl;

import com.maple.originmapleapp.entity.BoardEntity;
import com.maple.originmapleapp.repository.BoardRepository;
import com.maple.originmapleapp.service.BoardService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


@Service
@Transactional(readOnly = true)
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }


    @Override
    public List<BoardEntity> getBoardListAll() {
        return boardRepository.findAll();
    }

    @Override
    public BoardEntity boardInsert(BoardEntity boardEntity) {
        return boardRepository.save(boardEntity);
    }


}
