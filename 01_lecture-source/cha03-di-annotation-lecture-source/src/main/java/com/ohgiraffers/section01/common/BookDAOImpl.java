package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component
//@component 의 세분화 어노테이션의 한종류로 DAO 타입의 객체에 사용
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO{

    private final Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1,new BookDTO(1,1234,"혼자공부하는 자바", "조승윤", "한빛출판",new Date()));
        bookList.put(2,new BookDTO(2,5678,"혼자공부하는 자바", "조승윤", "한빛출판",new Date()));

    }

    @Override
    public List<BookDTO> selectBookList() {
        return null;
    }
    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }
}
