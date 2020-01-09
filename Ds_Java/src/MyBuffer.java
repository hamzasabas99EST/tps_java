import java.util.LinkedList;

public class MyBuffer {
       private int size=6;
		private LinkedList<String> data=new LinkedList<String>(); 
		
		public MyBuffer(int size) {
			this.size=size;
		}
		
		public void addWord(String mot) {
			//if(data.size()<size) 
			data.add(mot);
			
		}
		
		public LinkedList<String> getList(){
			return data;
		}
		
		public String getWord() {
			return data.removeLast();
		}
}
