package org.example.myapp.dto;

import java.time.LocalDateTime;

public class BoardDetailDto {
    private Long no;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private int viewCount;

    @Override
    public String toString() {
        return "BoardDetailDto{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", viewCount=" + viewCount +
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
