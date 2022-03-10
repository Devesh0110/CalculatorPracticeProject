public class Test {
	float a;
	float b;
	Test(float a, float b){
		this.a=a;
		this.b=b;
	}
	public float add() {
		return a+b;
	}
	public float substract() {
		if(a>b) {
			return a-b;
		}
		else {
			return b-a;
		}
	}
	public int multiply() {
		return (int)(a*b);
	}
	public float divide() {
		return a/b;
	}
}
