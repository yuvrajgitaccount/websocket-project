package com.codebuffer.springbootbuffersocket.controllerf;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.codebuffer.springbootbuffersocket.model.Gretting;
import com.codebuffer.springbootbuffersocket.model.HelloMessage;

@Controller
public class Websocketcontroller {
	
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Gretting getmessage(HelloMessage message)
	{
		return new Gretting("hello"+HtmlUtils.htmlEscape(message.getName()));
	}

}
