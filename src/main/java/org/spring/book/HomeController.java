package org.spring.book;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/*")
public class HomeController {
	@GetMapping("/")
    public String base(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        // 기존 "home.jsp"에서 변경
        // */* 형태로 페이지를 요청하였으므로,
        // tiles.xml 설정에 의해 content로 전송 됨.
        return "base";
    }
    
	@GetMapping("/home")
    public String home(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        // 기존 "home.jsp"에서 변경
        // */* 형태로 페이지를 요청하였으므로,
        // tiles.xml 설정에 의해 content로 전송 됨.
        return "home.tiles";
    }
    
	@GetMapping("/index")
    public String index(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate);
        // 기존 "home.jsp"에서 변경
        // */* 형태로 페이지를 요청하였으므로,
        // tiles.xml 설정에 의해 content로 전송 됨.
        return "index.tiles";
    }
}