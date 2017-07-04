import java.util.List;

import com.project.manager.FileManager;
import com.project.manager.FileManagerImpl;
import com.project.model.Address;

public class Main {

	public static void main(String[] args) {
		FileManager<Address> addrManager = new FileManagerImpl<>("address");
		addrManager.clean();
		Address add1 = new Address("1000N 4th St.", "Fairfield", "52557", "IA");
		addrManager.insert(add1);
		
		List<Address> addresses = addrManager.findAll();
		
		for (Address addr : addresses) {
			System.out.printf("%-15s %-15s %-10s %-5s%n",
				addr.getStreet(), addr.getCity(), addr.getZip(), addr.getState());
		}
	}
}
