package com.project.springbootstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이 클래스는 컨트롤러로 사용자의 요청을 받는 기능을 함
@ResponseBody  // 이 클래스는 응답을 줄 때 page가 아니라 입력값 그대로 보내줌
public class TestController {

    @GetMapping("/{name}/{message}") // 요청 예시 : IP주소 / 강태우 / 스윽 몰래 들어와본다
    public String helloMan(@PathVariable(name = "name") String name, @PathVariable(name = "message") String message) {
        System.out.println(name + "님이 접속했습니다. 메세지 : " + message);
        return "반갑습니다." + name + "님!";
    }
}
