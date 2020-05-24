/*
 * WebApp_Project
 * controller.EmployeeListServlet.java
 */
package servlet.employee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EmployeeDAO;
import model.entity.EmployeeBean;

/**
 * 従業員一覧表示を行うサーブレット
 * @author
 */
@WebServlet("/employee-list-servlet")
public class EmployeeListServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeListServlet() {
        super();
    }

    /**
     * GETリクエスト時の処理
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }

    /**
     * POSTリクエスト時の処理
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // リクエストオブジェクトのエンコーディング方式の指定
        request.setCharacterEncoding("UTF-8");

        // DAOの生成
        EmployeeDAO dao = new EmployeeDAO();

        try {
            // DAOの利用
            List<EmployeeBean> employeeList = dao.selectAll();

            // リクエストスコープへの属性の設定
            request.setAttribute("employeeList", employeeList);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        // リクエストの転送
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/employee/employee-list.jsp");
        rd.forward(request, response);

    }

}
