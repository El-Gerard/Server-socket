package ServerContoller;

public class Calculator {
	
	private String calc = "";
	
	public Calculator (String a) {
		
		this.calc = a;
	}
	
	public void Calcular() {
		
		char num1 = calc.charAt(0);
		char num2 = calc.charAt(1);
		
		int Xnum1 = num1 - '0';
		int Xnum2 = num2 - '0';
		
		int suma = Xnum1 + Xnum2;
		
		Sender send = new Sender(suma);
//		System.out.println(Xnum1);
//		System.out.println(Xnum2);
//		System.out.println("la suma es: "+suma);		
	}
}
