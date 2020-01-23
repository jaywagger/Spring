package di.constructor03;

public class MysqlArticleDAO implements IArticleDAO{

	@Override
	public void insert(ArticleDTO article) {
		System.out.println("이거슨 My SQL insert 메서드이오");
	}

}
