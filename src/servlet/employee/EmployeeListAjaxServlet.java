package servlet.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EmployeeDAO;
import model.entity.EmployeeBean;

/**
 * Servlet implementation class EmployeeListAjaxServlet
 */
@WebServlet("/employee-list-ajax-servlet")
public class EmployeeListAjaxServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeListAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        // response.getWriter().append("Served at: ").append(request.getContextPath());

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // Ajaxで渡されたテキストボックスの値を変数に格納
        String employeeCode = request.getParameter("employeeCode");

        EmployeeDAO dao = new EmployeeDAO();
        EmployeeBean employee = new EmployeeBean();
        try {
            employee = dao.select(employeeCode);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 返却値に設定
        PrintWriter out = response.getWriter();
        out.print(employee.getLastName());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
