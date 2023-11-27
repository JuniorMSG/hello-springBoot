package com.example.sample.controller;

import com.example.sample.dto.MemberDtoGeneral;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    /**
     * @PathVariable 활용한 구현 -1
     * http://localhost:8080/api/v1/post-api/example
     **/
    @DeleteMapping(value = "/{memberId}")
    public String DeleteVariable(@PathVariable String memberId) {
        return memberId;
    }

    @DeleteMapping(value = "/member_request")
    public String deleteMemberRequest(@RequestParam String email) {
        return "email : " + email;
    }


}