package Package1;

public class loopcheck {	
	public void doWhilecheck() {
		

		int i=0;
		do {
			System.out.println(+i);
			i=i+1;
			
		} while (i>6);		
	}
	public static void main(String[] args) {
		loopcheck objectLoopcheck =new loopcheck();
		objectLoopcheck.doWhilecheck();
		
	}

}
