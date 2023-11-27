package com.example.sample.controller;

import com.example.sample.dto.MemberDtoGeneral;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    /**
     * @PutMapping 구현
     * @RequestBody Map<String, Object>
     * http://localhost:8080/api/v1/put-api/member
     **/
    @PutMapping(value = "/member")
    public String putMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }


    /**
     * @PutMapping 구현
     * @RequestBody MemberDtoGeneral
     **/
    @PutMapping(value = "/member1")
    public String putMemberDto1(@RequestBody MemberDtoGeneral memberDtoGeneral) {
        System.out.println("12344");
        return memberDtoGeneral.toString();
    }

    /**
     * @PutMapping 구현
     * @RequestBody MemberDtoGeneral
     **/
    @PutMapping(value = "/member2")
    public MemberDtoGeneral putMemberDto2(@RequestBody MemberDtoGeneral memberDtoGeneral) {
        return memberDtoGeneral;
    }


    /**
     * @PutMapping 구현
     * ResponseEntity<MemberDtoGeneral>
     **/
    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDtoGeneral> putMemberDto3(@RequestBody MemberDtoGeneral memberDtoGeneral) {
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(memberDtoGeneral);
    }


}