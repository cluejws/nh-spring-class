package org.example.myapp.dto;

import java.time.LocalDateTime;

public class BoardSummaryDto {
    private Long no;
    private String title;
    private int viewCount;
    private LocalDateTime createdDate;

    @Override
    public String toString() {
        return "BoardSummaryDto{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", viewCount=" + viewCount +
                ", createdDate=" + createdDate +
                '}';
    }

    // Getter/Setter 메서드 자동 생성
    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
