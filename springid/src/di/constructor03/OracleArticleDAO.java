package di.constructor03;

public class OracleArticleDAO implements IArticleDAO{

	@Override
	public void insert(ArticleDTO article) {
		System.out.println("이거슨 오라클 insert 메서드이오");
	}

}
