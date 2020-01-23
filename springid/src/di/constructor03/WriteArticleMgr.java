package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr{
	
	private IArticleDAO articleDAO; //이것만 있으면 null이기 때문에. 외부에서 받아와야 함.
									//컨테이너가 전달해주는 것을 받을 수 있게 생성자를 만든다.
	
	
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}


	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}

}
