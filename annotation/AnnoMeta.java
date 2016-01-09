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
 *  1.CONSTRUCTOR:��������������
	2.FIELD:����������
	3.LOCAL_VARIABLE:���������ֲ�����
	4.METHOD:������������
	5.PACKAGE:����������
	6.PARAMETER:������������
	7.TYPE:���������ࡢ�ӿ�(����ע������) ��enum����
 * */
@Target(ElementType.TYPE)
@interface Table {
	/**
	 * ���ݱ���ע�⣬Ĭ��ֵΪ����
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
 *  1.SOURCE:��Դ�ļ�����Ч����Դ�ļ�������
	2.CLASS:��class�ļ�����Ч����class������
	3.RUNTIME:������ʱ��Ч��������ʱ������
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


