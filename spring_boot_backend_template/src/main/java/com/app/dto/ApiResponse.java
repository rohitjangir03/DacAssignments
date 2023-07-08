package com.app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponse {
     private String mesg;
     
     public ApiResponse(String mesg) {
    	 super();
    	 this.mesg=mesg;
     }
}
