import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import persistence.Company;
import persistence.CompanyDAO;

public class AppMain {
	

	public static void main(String[] args) throws SQLException {
		List<Company> test = new ArrayList<>();


		CompanyDAO cdao = new CompanyDAO("jdbc:mysql://localhost:3306/computer-database-db","root","");
		test=cdao.listAllCompany();
		
		
		 for (Iterator iter = test.iterator(); iter.hasNext();)
	      {
	       String  ch2= (String) iter.next().toString();
	        System.out.println(ch2)  ;
	      }


	}

}
