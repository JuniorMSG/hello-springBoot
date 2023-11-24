package com.example.sample.controller;

import com.example.sample.dto.MemberDtoGeneral;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    // RequestMapping으로 구현
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        // Sample URL http://localhost:8080/api/v1/get-api/hello
        return "Hello World";
    }


    // 매개 변수가 없는 GET 메서드
    @GetMapping(value = "/name")
    public String getName() {
        // Sample URL http://localhost:8080/api/v1/get-api/name
        return "Hello Name";
    }

    // @PathVariable 활용한 구현 -1
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable(@PathVariable String variable) {
        // Sample URL http://localhost:8080/api/v1/get-api/variable1/123123
        return variable;
    }


    /*
     * @PathVariable 활용한 구현 -2
     * http://localhost:8080/api/v1/get-api/variable2/123123
     */
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        // Sample URL
        return var;
    }


    /*
     * @RequestParam 활용한 구현 - 1
     * http://localhost:8080/api/v1/get-api/request1?name=value&email=avalue&organization=value3
     */
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }


    /*
     * @RequestParam 활용한 구현 - 2
     * http://localhost:8080/api/v1/get-ap2/request2?name=value&email=avalue&organization=value3
     */
    @GetMapping(value = "/request2")
    public String getRequestParam2(
            @RequestParam HashMap<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }
    /*
     * @RequestParam 활용한 구현 - 3
     * http://localhost:8080/api/v1/get-ap2/request3?name=value&email=avalue&organization=value3
     */
    @GetMapping(value = "/request3")
    public String getRequestParam3(
            MemberDtoGeneral memberDtoGeneral) {
        return memberDtoGeneral.toString();
    }




}
