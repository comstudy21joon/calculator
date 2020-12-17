package sig.oss.calc;

public class Calc {
	private int r;
	
    public void add(int x, int y) {
        r = x+y;
    }
    
    public void sub(int x, int y) {
    	r = x-y;
    }
    
    public int getResult() {
    	return r;
    }
}
