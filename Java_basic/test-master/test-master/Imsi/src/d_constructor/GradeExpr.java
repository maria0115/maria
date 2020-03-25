package d_constructor;

public class GradeExpr {

	int[] jumsu = new int[] {};


	public void GradeExpr(int jumsu[]) {
	
		
	}
	
	
	public double getAverage() {
		
		double avg = 0;
		for(int i=0 ; i<jumsu.length ; i++) {
			int total = 0;
			total += jumsu[i];
			
			avg = (double)total/jumsu.length;
		}
		return avg;
		
		
	}
	
	public int getTotal() {
		int total = 0;
		for(int i=0 ; i<jumsu.length ; i++) {
			
			total += jumsu[i];
		}
		return total;
		
	}
	
	public int getGoodScore() {
		int goodscore = 0; 
		for(int i=0; i<jumsu.length ; i++) {
			
			if(goodscore<jumsu[i]) {
				goodscore = jumsu[i];
			}
			
		}
		return goodscore;
		
	}
	
	public int getBadScore() {
		
		int badscore = 0;
		for(int i=0 ; i<jumsu.length ; i++) {
			
			if(badscore>jumsu[i]) {
				badscore=jumsu[i];
			}
			
		}
		return badscore;
		
	}
	
	
	
	
	
	
}
