package com.spring.board.controller;

import java.util.logging.Logger;

import org.eclipse.jdt.internal.compiler.batch.Main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.board.vo.BoardVo;

@Controller

public class BoardController {

   protected static Logger logger = Logger.getLogger(Main.class.getName());
	  
   @RequestMapping("/")
   public String home() {
	   logger.info("인터셉터 테스트");
	   BoardVo boardVo = new BoardVo();
	   boardVo.setB_id("gg");
	   boardVo.setB_name("쥐쥐");
	   System.out.println("no toString : " + boardVo);
	   System.out.println("to String : " + boardVo.toString());
	   return "home";
   }
      
}
