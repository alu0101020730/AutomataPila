import java.util.ArrayList;
	import java.util.Scanner; 
	import java.io.File; 
	import java.net.URL;

public class Read {


		
		private File file;
		private ArrayList<String[]> elements; 

		public Read() {}

		public Read(String entrada) throws Exception {	
			this.elements = new ArrayList<String[]>();
			URL url = getClass().getResource(entrada);
			this.file = new File(url.getPath()); 
			readFich();
		}
		
		public ArrayList<String[]> getElements(){
			return elements;
		}
	
		public void readFich() throws Exception {
			Scanner scFich = new Scanner(file); 
			String aux = "";
			while(scFich.hasNextLine()) {
				aux = scFich.nextLine();
				if(!aux.contains("#")) 
					elements.add(aux.split(" "));
			}
			for(int i = 0; i < elements.size(); i++) {
				for(int j = 0; j < elements.get(i).length; j++)
					System.out.print(elements.get(i)[j]);
			System.out.println();
			}
					
			scFich.close();	
		}
}