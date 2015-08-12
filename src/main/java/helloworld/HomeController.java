package helloworld;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public @ResponseBody String home(HttpServletResponse response) throws Exception{
//        response.setContentType("text/plain");
//        response.setCharacterEncoding("UTF-8");
//        response.getOutputStream().write("Hello World!".getBytes());
        return "Hello World!";
    }

}