import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.infosys.config.SpringRootConfig;

public class TestDataSorce {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);

		DataSource ds=ctx.getBean(DataSource.class);
		JdbcTemplate jt= new JdbcTemplate(ds);

		String sql="INSERT INTO user  (`name`, `phone`, `email`, `address`, `loginName`, `password`)values(?,?,?,?,?,?)";
		Object [] param= new Object[] {"Sagar","9028989533","sakulkarni12@gmail.com","Pune","s","pass"};
		jt.update(sql,param);
		System.out.println("--------Sql Exucted------");

	}
}
