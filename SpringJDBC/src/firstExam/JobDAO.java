package firstExam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("jobdao")
public class JobDAO {
	@Autowired
	JdbcTemplate myTemplate;
	
	//job table�� ���ڵ� ������ �����ϴ� �޼���
	public int count() {
		return myTemplate.queryForObject("select count(*) from jobs",
				Integer.class);
	}
}
