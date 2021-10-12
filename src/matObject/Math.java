package matObject;

public class Math {
	
	public int sum(int n1,int n2) {
		int result;
		result=n1+n2;
		return result;
	}
	public int sup(int n1,int n2) {
			int result;
			result=n1-n2;
			return result;	
    }
	public int mult(int n1,int n2) {
		int result;
		result=n1*n2;
		return result;
	}
	public double divide(double n1,double n2) {
		double result;
		result=n1/n2;
		return result;
	}
	private double pi;
	public Math() {
		this.pi=3.14785;
	}
	public double getPi() {
        return pi;
	}
    public double areaOfCircle(double r) {
    	return this.getPi()*r*r;
	}	
    public double volumeOfSphere(double r) {
    	return this.getPi()*r*r*r*4/3;
    }   
    public int factoriyel(int f) {
    	int result=1;
    	for(int i=1;i<=f;i++) {
    		result=result*i;
    	}
    	return result;
    }
    public int sumOfSmallNumbers(int a) {
    	int result=0;
    	for(int i=1;i<a;i++) {
    		result+=i;
    	}
        return result;
    }
    public int sumOfBetweenNumbers(int a,int b) { 
        int result=0;
        for(int i=a+1;i<b;i++) {
            result+=i;
        }
        return result;
    }
}
