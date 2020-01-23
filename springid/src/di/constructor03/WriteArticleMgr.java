package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr{
	
	private IArticleDAO articleDAO; //�̰͸� ������ null�̱� ������. �ܺο��� �޾ƿ;� ��.
									//�����̳ʰ� �������ִ� ���� ���� �� �ְ� �����ڸ� �����.
	
	
	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}


	@Override
	public void write(ArticleDTO article) {
		articleDAO.insert(article);
	}

}
