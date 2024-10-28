package com.example.Author_info.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {

    private String authorId;
    private String name;
    private String  email;
    private long phoneNo;
    private List bookList;
}
