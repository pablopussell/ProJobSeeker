package Resources.css;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<Client> clients = new ArrayList<Client>();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Client carlos = new Client();
		carlos.setName("Carlos");
		carlos.setSurName("Gil");
		carlos.setDOB(formatter.parse("26/03/1974"));
		clients.add(carlos);
		
		Client jose = new Client();
		carlos.setName("Jose");
		carlos.setSurName("Huerta");
		carlos.setDOB(formatter.parse("26/03/1970"));
		clients.add(jose);
		
		Collections.sort(clients);

	}

}
