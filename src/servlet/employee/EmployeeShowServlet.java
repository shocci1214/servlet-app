/*
 * WebApp_Project
 * servlet.employee.EmployeeShow.java
 */
package servlet.employee;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EmployeeDAO;
import model.entity.EmployeeBean;

/**
 * Servlet implementation class EmployeeShowServlet
 */
@WebServlet("/employee-show-servlet")
public class EmployeeShowServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // リクエストオブジェクトのエンコーディング方式の指定
        request.setCharacterEncoding("UTF-8");

        // リクエストパラメータの取得
        String employeeCode = request.getParameter("employee-code");

        // DAOの生成
        EmployeeDAO dao = new EmployeeDAO();

        try {
            // DAOの利用
            EmployeeBean employee = dao.select(employeeCode);

            // リクエストスコープへの属性の設定
            request.setAttribute("employee", employee);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        // リクエストの転送
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/employee/employee-show.jsp");
        rd.forward(request, response);
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
