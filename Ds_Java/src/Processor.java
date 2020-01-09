import java.util.HashMap;

public class Processor extends Thread{
	private MyBuffer buff;
	private String Pname;
	private HashMap<String,Integer> wordCounts=new HashMap<String,Integer>();
	
	public Processor(String Pname,MyBuffer buff) {
		this.Pname=Pname;
		this.buff=buff;
		
	}
			
	
	
	
	public void processe() {
		String mot=buff.getWord();
		if(wordCounts.containsKey(mot)) {
			wordCounts.replace(mot, wordCounts.get(mot)+1);
		}else wordCounts.put(mot, 1);
		
	}
	
	public HashMap<String,Integer> getWordCounts(){
		return wordCounts;
	}




	@Override
	public void run() {
		 
		 try {
			 processe();
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
