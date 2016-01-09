package anno.test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	/**
	 * ��ɫö��ֵ
	 * 
	 * @author WDZ
	 */
	public enum Color {
		BLUE, RED, GREEN
	}
	
	/**
	 * ��ɫ����
	 * @author WDZ
	 * */
	Color fruitColor() default Color.BLUE;
}
