package org.example.myapp.repository;

import org.example.myapp.domain.Board;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Repository // Spring IoC 컨테이너가 관리하는 객체로 설정
public class BoardRepository {
    private final List<Board> list = new ArrayList<>();
    private Long nextNo = 1L; // 게시글 번호를 자동 증가시키기 위한 변수

    public void insert(Board board) {
        board.setNo(nextNo++);
        board.setCreatedDate(LocalDateTime.now());
        list.add(board);
    }

    public List<Board> findAll() {
        return list;
    }

    public Board findByNo(Long no) {
        for (Board board : list) {
            if (board.getNo().equals(no)) {
                return board;
            }
        }

        return null;
    }

    public void update(Board board) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNo().equals(board.getNo())) {
                list.set(i, board);
                return;
            }
        }
    }

    public void delete(Long no) {
        /*
        * Iterator<Board> iterator = list.iterator();
        * while (iterator.hasNext()) {
        *     Board board = iterator.next();
        *     if (board.getNo().equals(no)) {
        *         iterator.remove(board);
        *         return;
        *     }
        * }
        * */
        list.removeIf(board-> board.getNo().equals(no));
    }

    public int count() {
        return list.size();
    }
}
