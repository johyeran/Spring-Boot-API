package com.test.restapi.board;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping ("/api/v1")
public class BoardCRUDController {
    Map<Integer, Object> boardList = new HashMap<Integer, Object>();

//    @GetMapping("/write")
//    public void SetBoardList(Integer boardIdx, Object boardContents) {
//        this.boardList.put(boardIdx, boardContents);
//    }
}
