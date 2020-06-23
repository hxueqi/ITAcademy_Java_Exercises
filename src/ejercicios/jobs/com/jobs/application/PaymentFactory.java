package ejercicios.jobs.com.jobs.application;

import ejercicios.jobs.com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	//Boss: cobren un 50% més del seu salari mensual
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}

	//Employee: cobren el sou mensual aplicant una reducció del 15%
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;
			}
		};
	}

	//Manager: cobren un 10% més del seu salari mensual.
	public static IPaymentRate createPaymentRateManagerEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}

}
