package org.dta.br;

import javax.servlet.http.*;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    //GET /demo
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.getWriter().print("Hello from servlet");
    }
}