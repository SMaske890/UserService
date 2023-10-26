package com.user.service.UserService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

/*Payload refers to the data or information that is sent by the client in a request to
the server or the data that is returned by the server in response to a request.*/
public class ApiResponse {

    private  String message;
    private  boolean success;
    private HttpStatus status;
}
