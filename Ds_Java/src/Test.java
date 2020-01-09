
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyBuffer buff=new MyBuffer(100);
		 Processor p1=new Processor("P1", buff);
		 Processor p2=new Processor("P2", buff);
		 Thread L1 = new Lecteur("L1", "fichier1.txt", buff);
		 Thread L2 = new Lecteur("L2", "fichier2.txt", buff);
		 
		  L1.start();
		   L2.start();	
		 p1.start();
		 p2.start();
	}

}
