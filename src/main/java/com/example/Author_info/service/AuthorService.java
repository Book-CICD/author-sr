package com.example.Author_info.service;

import com.example.Author_info.Client.Book;
import com.example.Author_info.Client.FullResponse;
import com.example.Author_info.Fegin.BookClient;
import com.example.Author_info.model.Author;
import com.example.Author_info.repo.AutherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AutherRepo autherRepo;
    @Autowired
    private BookClient bookClient;

    public Author addAuther(Author auther) {

        return autherRepo.save(auther);
    }

    public Author getAuther(String autherId) {
        return autherRepo.findById(autherId).get();
    }

    public FullResponse getBooks(String authorId) {
        Author author = autherRepo.findById(authorId).get();
        List<Book> books=bookClient.getBookByAuthur(authorId);
        FullResponse fullResponse = new FullResponse();
        fullResponse.setAuthorId(author.getAuthorId());
        fullResponse.setName(author.getName());
        fullResponse.setEmail(author.getEmail());
        fullResponse.setPhoneNo(author.getPhoneNo());
        fullResponse.setBookList(books);
        return fullResponse;



    }
}
