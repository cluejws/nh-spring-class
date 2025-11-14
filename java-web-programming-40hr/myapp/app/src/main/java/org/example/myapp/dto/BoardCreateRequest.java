package org.example.myapp.dto;

public class BoardCreateRequest {
    private String title;
    private String content;

    @Override
    public String toString() {
        return "BoardCreateRequest{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    // Getter/Setter 메서드 자동 생성
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
}
