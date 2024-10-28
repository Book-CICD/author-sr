package com.example.Author_info.Fegin;


import com.example.Author_info.Client.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "book-service", url = "http://book-sr:5959/api/book")
public interface BookClient {
    @GetMapping("/books/authur/{authurId}")
    List<Book> getBookByAuthur(@PathVariable String authurId);
}
