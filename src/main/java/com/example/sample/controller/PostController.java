package com.example.sample.controller;

import com.example.sample.dto.MemberDtoGeneral;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    /**
     * RequestMapping 구현
     * http://localhost:8080/api/v1/post-api/example
     **/
    @RequestMapping(value = "/example", method = RequestMethod.POST)
    public String postExample() {
        return "Hello World";
    }


    /**
     * @PostMapping 구현
     * @RequestBody Map<String, Object>
     * http://localhost:8080/api/v1/post-api/member
     **/
    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    /**
     * @PostMapping 구현
     * @RequestBody MemberDtoGeneral
     **/
    @PostMapping(value = "/member1")
    public String postMemberDto1(@RequestBody MemberDtoGeneral memberDtoGeneral) {
        return memberDtoGeneral.toString();
    }
}