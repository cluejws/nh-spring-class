package org.example.myapp.domain;

import java.time.LocalDateTime;

public class Board {
    private Long no;
    private String title;
    private String content;
    private int viewCount;
    private LocalDateTime createdDate;

    // toString() 자동 생성: 디버깅할 때 Board 객체의 내용을 쉽게 확인할 수 있다.
    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
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
}