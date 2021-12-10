package com.ktds.questionformentoring.comment.service;

import com.ktds.questionformentoring.comment.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper boardMapper;

    @Override
    public String testSelect() {
        return boardMapper.testSelect();
    }
}
