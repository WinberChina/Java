package anno.test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

public class AnnoMeta {

}

// @Target
/**
 *  ElementType.
 *  1.CONSTRUCTOR:用于描述构造器
	2.FIELD:用于描述域
	3.LOCAL_VARIABLE:用于描述局部变量
	4.METHOD:用于描述方法
	5.PACKAGE:用于描述包
	6.PARAMETER:用于描述参数
	7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
 * */
@Target(ElementType.TYPE)
@interface Table {
	/**
	 * 数据表明注解，默认值为类名
	 * @return
	 * */
	public String tableName() default "className";
}

@Target(ElementType.FIELD) 
@interface NoDBColumn {
	
}

// @Retention
/**
 *  RetentionPolicy.
 *  1.SOURCE:在源文件中有效（即源文件保留）
	2.CLASS:在class文件中有效（即class保留）
	3.RUNTIME:在运行时有效（即运行时保留）
 * */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Column {
	public String name() default "fieldName";
	public String setFuncName() default "setField";
	public String getFuncName() default "getField";
	public boolean defaultDBValue() default false;
}

@Inherited
@interface Greeting {
	public enum FontColor{BLUE, RED, GREEN};
	String name();
	FontColor fontColr() default FontColor.BLUE;
}


