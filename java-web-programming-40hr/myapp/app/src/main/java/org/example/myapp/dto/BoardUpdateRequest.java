package org.example.myapp.dto;

public class BoardUpdateRequest {
    private Long no;
    private String title;
    private String content;

    @Override
    public String toString() {
        return "BoardUpdateRequest{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
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
}
