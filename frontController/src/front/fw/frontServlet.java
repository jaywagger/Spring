package front.fw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.ProductList;

//모든 요청이 FrontServlet을 통해 들어올 수 있도록 설정
@WebServlet(name="front",urlPatterns= {"*.do","*.jsp","*.html"})
public class frontServlet extends HttpServlet {
//모든 요청을 한 곳에서 받아야 관리 유지가 용이하다.
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//1. 요청 정보를 분석해서 추출 - 어떤 path로 요청할지???
		System.out.println("요청받기");
		System.out.println("request.getContextPath()메서드: "+request.getContextPath());
		System.out.println("request.getRequestURI()메서드: "+request.getRequestURI());
		
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		String path = requestURI.substring(contextPath.length()); //path 뽑아내기
		System.out.println("Path: "+path);
		
		//추출한 요청 path로 등록되어 있는 실행할 클래스 정보를 찾아오는 작업
		//RequestMappig 객체에 의뢰=> RequestMapping 객체의 메소드를 호출
		//							실제 실행할 객체를 찾아서 리턴
		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path);
		//Action action = new ProductList();
		
		//Action객체의 메소드를 호출
		//ProductList.run(request, response);
		action.run(request, response);
		
		//run메소드의 실행결과를 받아서 응답view를 찾는다.
		
		//응답 view로 forward or redirect
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
