package control;

import dao.DAO;
import entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "changepass", value = "/changepass")
public class ChangePassControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("changepass.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String oldPass = request.getParameter("old-pass");
        String newPass = request.getParameter("new-pass");
        String reNewPass = request.getParameter("re-newpass");

        DAO dao = new DAO();
        User u = dao.login(email, oldPass);
        if(u == null) {
            request.setAttribute("mess", "khong ton tai");
            request.getRequestDispatcher("changepass.jsp").forward(request, response);
        } else {
            if(newPass.equals(reNewPass)){
                dao.changePass(email, newPass);
                User user = dao.login(email, newPass);
                HttpSession session = request.getSession();
                session.setAttribute("acc", user);
                response.sendRedirect("home");
            } else {
                request.setAttribute("mess2", "nhap sai mk");
                request.getRequestDispatcher("changepass.jsp").forward(request, response);
            }
        }
    }
}
