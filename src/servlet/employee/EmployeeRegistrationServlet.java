/*
 * WebApp_Project
 * servlet.EmployeeRegistrationServlet.java
 */
package servlet.employee;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.SectionDAO;
import model.entity.SectionBean;

/**
 * 従業員の登録をするサーブレット
 * @author
 */
@WebServlet("/employee-registration-servlet")
public class EmployeeRegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistrationServlet() {
        super();
    }

    /**
     * GETリクエスト時の処理
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // リクエストオブジェクトのエンコーディング方式の指定
        request.setCharacterEncoding("UTF-8");

        // DAOの生成
        SectionDAO sectionDao = new SectionDAO();

        // 部署リスト
        List<SectionBean> sectionList = new ArrayList<SectionBean>();

        // DAOを利用して、すべての部署リストを取得する
        try {
            sectionList = sectionDao.selectAll();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 部署リストをリクエストスコープへ設定
        request.setAttribute("sectionList", sectionList);

        // リクエストの転送
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/employee-registration.jsp");
        rd.forward(request, response);
    }

    /**
     * POSTリクエスト時の処理
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
