package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AreaAdvice {


	void Cir(JoinPoint joinPoint) {
		System.out.println("Circle:"+joinPoint.getSignature().toShortString());
	}
	
	/*
	 * void Cir2(JoinPoint joinPoint) {
	 * System.out.println("Circle2:"+joinPoint.getSignature().toShortString()); }
	 * 
	 * void Sq(JoinPoint joinPoint) {
	 * System.out.println("Square:"+joinPoint.getSignature().toShortString()); }
	 * 
	 * void Sq2(JoinPoint joinPoint) {
	 * System.out.println("Square2:"+joinPoint.getSignature().toShortString()); }
	 * 
	 * void Tri(JoinPoint joinPoint) {
	 * System.out.println("Triangle:"+joinPoint.getSignature().toShortString()); }
	 * 
	 * void Tri2(JoinPoint joinPoint) {
	 * System.out.println("Triangle2:"+joinPoint.getSignature().toShortString()); }
	 * 
	 */
}
