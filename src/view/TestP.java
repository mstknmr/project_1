package view;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.RecipeController;
import model.Recipe;

@WebServlet("/TestP")
public class TestP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestP() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RecipeController controller = new RecipeController();
		ArrayList<Recipe> recipes = controller.findAll();
		for(Recipe recipe : recipes) {
			System.out.println(recipe.toString());
		}

		// 呼び出し元Jspからデータ受け取り
		request.setCharacterEncoding("UTF8");
		String jsp = request.getParameter("fromJsp");

		// 呼び出し先Jspに渡すデータセット
		request.setAttribute("fromServlet", jsp + " + サーブレットで追加");

		request.setAttribute("recipes", recipes);

		// result.jsp にページ遷移
		RequestDispatcher dispatch = request.getRequestDispatcher("result.jsp");
		dispatch.forward(request, response);
	}
}