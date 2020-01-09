import java.io.*;

public class Lecteur extends Thread{
	private String fileName;
	private String threadName;
	private MyBuffer buff;
	 BufferedInputStream butt;
	 File file;
	 FileInputStream fis;
	
	
	public Lecteur(String threadName,String fileName,MyBuffer buff) {
		
		this.threadName=threadName;
		this.fileName=fileName;
		this.buff=buff;
	
	}
	
	
	
	public String readWord() throws IOException {
		
		fis=new FileInputStream(file);
		String  word="";
		
		butt =new BufferedInputStream(fis);
		
		byte[] byt = new byte[5];
		int bytesRead = 0;
		
		while ((bytesRead = butt.read(byt)) != -1) {
			System.out.println(new String(byt, 0, bytesRead));
		}
		return word;
		
	}



	@Override
	public void run() {
		try {
			while(true) {
				
					Thread.sleep(100);
					String w = readWord();
					buff.addWord(w);
				
				
				Thread.sleep(300);
			}
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
