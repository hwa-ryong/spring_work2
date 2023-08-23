package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class AdviceAdvice {

	void beforeee(JoinPoint joinPoint) {
		System.out.println("beforeee:"+joinPoint.getSignature().toShortString());
	}
	//ProceedingJoinPoint는 around에서만 넣을수 있음.
	//void afterrr(ProceedingJoinPoint joinPoint) {
	/*
	 * System.out.println("afterrr:"+joinPoint.getSignature().toShortString()); }
	 */
	void afterrr(JoinPoint joinPoint) {
		System.out.println("afterrr:"+joinPoint.getSignature().toShortString());
	}
	
	void returnnn(JoinPoint joinPoint, Object qq) {
		System.out.println("returnnn:"+joinPoint.getSignature().toShortString()+" => "+qq);
	}
	
	void errrr(JoinPoint joinPoint, Throwable ee) {
		System.out.println("errrr:"+joinPoint.getSignature().toShortString()+ " => "+ee.getMessage());
	}
	
	
}
