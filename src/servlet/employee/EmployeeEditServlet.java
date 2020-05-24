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

import model.dao.EmployeeDAO;
import model.dao.SectionDAO;
import model.entity.EmployeeBean;
import model.entity.SectionBean;

/**
 * Servlet implementation class EmployeeEditServlet
 */
@WebServlet("/employee-edit-servlet")
public class EmployeeEditServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeEditServlet() {
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
        // DAOの生成
        SectionDAO sectionDao = new SectionDAO();

        // 部署リスト
        List<SectionBean> sectionList = new ArrayList<SectionBean>();

        try {
            // DAOの利用
            EmployeeBean employee = dao.select(employeeCode);
            sectionList = sectionDao.selectAll();

            // リクエストスコープへの属性の設定
            request.setAttribute("employee", employee);
            // 部署リストをリクエストスコープへ設定
            request.setAttribute("sectionList", sectionList);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        // リクエストの転送
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/employee/employee-edit.jsp");
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
