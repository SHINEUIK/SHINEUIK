package org.ezen.shin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //들어오는 데이터를 utf-8로해석
        resp.setCharacterEncoding("UTF-8"); //완성되는 html의 인코딩을 utf-8로하겠다
        resp.setContentType("text/html; charset-utf-8"); //브라우저에게 우리가 만들 결과물이 utf-8이라고 알리는 의미


        int dan = Integer.parseInt(req.getParameter("dan"));
        int limit = Integer.parseInt(req.getParameter("limit"));

        resp.getWriter().append("<h1>%d단</h1>\n".formatted(dan));

        for (int i = 1; i <= limit; i++) {
            resp.getWriter().append("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
        }

    }
}
