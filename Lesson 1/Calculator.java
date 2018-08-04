public class Calculator {	
	public static void main(String[] args) {
		int firstVar = 17;
		int secondVar = 5;
		double result = 1;
		String sign = "%";

		if (sign=="+"){
			result = firstVar + secondVar;
		
			} else if (sign=="-"){
				result = firstVar - secondVar;
				
				} else if (sign=="*"){
					result = firstVar * secondVar;
					
					}else if (sign=="/"){
						result = (double)firstVar / secondVar;
						
						}else if (sign=="^"){
							for (int i=1; i<=secondVar;i++){
								result = result*firstVar;
								}
							}else if (sign=="%"){
								while (firstVar >=secondVar){
									result = firstVar - secondVar;
									firstVar = firstVar - secondVar;
									}
								}
		System.out.println(result);
	}
}