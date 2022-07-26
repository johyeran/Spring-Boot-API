package com.test.restapi.board;

import com.test.restapi.board.application.BoardCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1")
public class BoardCRUDController {
    private final BoardCRUDService boardCRUDService;

    @Autowired
    public BoardCRUDController(final BoardCRUDService boardCRUDService) {
        this.boardCRUDService = boardCRUDService;
    }
}
