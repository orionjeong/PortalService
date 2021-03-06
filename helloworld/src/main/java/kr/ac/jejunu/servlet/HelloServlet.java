package kr.ac.jejunu.servlet;




import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@Slf4j
@WebServlet(urlPatterns="/hello")

public class HelloServlet extends GenericServlet {
    @Override
    public void init() throws ServletException {
        log.info("*************** servlet init ***************");
        super.init();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        log.info("*************** servlet service ***************");
        res.getWriter().println("<h1> HELLO WORLD!!!</h1>");
    }

    @Override
    public void destroy() {
        log.info("*************** servlet destory ***************");
        super.destroy();
    }
}
