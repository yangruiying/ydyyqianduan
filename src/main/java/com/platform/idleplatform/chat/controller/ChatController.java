package com.platform.idleplatform.chat.controller;

import com.platform.idleplatform.chat.entity.ChatInfo;
import com.platform.idleplatform.chat.service.ChatService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/chat")
public class ChatController {
    @Resource
    public ChatService chatService;

    @RequestMapping("/addChat")
    public AppResponse addChat(ChatInfo chatInfo){
        return chatService.addChat(chatInfo);
    }

    @RequestMapping("/chatList")
    public AppResponse chatList(String userId){
        return chatService.chatList(userId);
    }

    @RequestMapping("/chatRecard")
    public AppResponse chatRecard(ChatInfo chatInfo){
        return chatService.chatRecard(chatInfo);
    }
}
