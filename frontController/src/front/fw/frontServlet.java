package front.fw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.ProductList;

//��� ��û�� FrontServlet�� ���� ���� �� �ֵ��� ����
@WebServlet(name="front",urlPatterns= {"*.do","*.jsp","*.html"})
public class frontServlet extends HttpServlet {
//��� ��û�� �� ������ �޾ƾ� ���� ������ �����ϴ�.
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//1. ��û ������ �м��ؼ� ���� - � path�� ��û����???
		System.out.println("��û�ޱ�");
		System.out.println("request.getContextPath()�޼���: "+request.getContextPath());
		System.out.println("request.getRequestURI()�޼���: "+request.getRequestURI());
		
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring(contextPath.length()); //path �̾Ƴ���
		System.out.println("Path: "+path);
		
		//������ ��û path�� ��ϵǾ� �ִ� ������ Ŭ���� ������ ã�ƿ��� �۾�
		//RequestMappig ��ü�� �Ƿ�=> RequestMapping ��ü�� �޼ҵ带 ȣ��
		//							���� ������ ��ü�� ã�Ƽ� ����
		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path);
		//Action action = new ProductList();
		
		//Action��ü�� �޼ҵ带 ȣ��
		//ProductList.run(request, response);
		action.run(request, response);
		
		//run�޼ҵ��� �������� �޾Ƽ� ����view�� ã�´�.
		
		//���� view�� forward or redirect
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
