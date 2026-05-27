package com.example.session7.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ApiResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private HttpStatusCode statusCode;


}
