package com.test.restapi.board.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardDTO {
    private int idx;
    private int userIdx;
    private String title;
    private String contents;
    private String date;

    @Builder
    public BoardDTO(final int idx,
                    final int userIdx,
                    final String title,
                    final String contents,
                    final String date) {
        this.idx = idx;
        this.userIdx = userIdx;
        this.title = title;
        this.contents = contents;
        this.date = date;
    }
}
