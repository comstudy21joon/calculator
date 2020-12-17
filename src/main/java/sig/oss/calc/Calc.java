package sig.oss.calc;

public class Calc {
	private int r;
	
    public void add(int x, int y) {
        r = x+y;
    } // add method 주석문 추가
    
    public void sub(int x, int y) {
    	r = x-y;
    } // substraction method 주석문 추가
    
    public int getResult() {
    	return r;
    }
}
