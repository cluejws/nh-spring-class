package org.example.myapp.dto;

import java.time.LocalDateTime;

public class BoardResponse {
    private Long no;
    private String title;
    private String content;
    private LocalDateTime createdDate; // 출력할 때 자유롭게 포맷을 제어할 수 있도록 하기 위함
    private int viewCount;

    public static BoardResponse from(BoardDetailDto dto) {
        BoardResponse response = new BoardResponse();
        response.setNo(dto.getNo());
        response.setTitle(dto.getTitle());
        response.setContent(dto.getContent());
        response.setViewCount(dto.getViewCount());
        response.setCreatedDate(dto.getCreatedDate());
        return response;
    }

    public static BoardResponse from(BoardSummaryDto dto) {
        BoardResponse response = new BoardResponse();
        response.setNo(dto.getNo());
        response.setTitle(dto.getTitle());
        response.setViewCount(dto.getViewCount());
        response.setCreatedDate(dto.getCreatedDate());
        return response;
    }

    @Override
    public String toString() {
        return "BoardResponse{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", viewCount=" + viewCount +
                '}';
    }

    // Getter/Setter 메서드 자동 생성
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
