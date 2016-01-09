package anno.test;

import java.util.ArrayList;
import java.util.List;

public class FruitService {
	
	@SuppressWarnings(value={"rawtypes", "unchecked"})
	public static List<Fruit> getFruitList() {
		List<Fruit> fruitList = new ArrayList();
		return fruitList;
	}
	
	
	/**
	 * 1.deprecation��ʹ���˲��޳�ʹ�õ���򷽷�ʱ�ľ��棻
     * 2.unchecked��ִ����δ����ת��ʱ�ľ��棬���統ʹ�ü���ʱû���÷��� (Generics) ��ָ�����ϱ��������; 
     * 3.fallthrough���� Switch �����ֱ��ͨ����һ�������û�� Break ʱ�ľ���;
     * 4.path������·����Դ�ļ�·�������в����ڵ�·��ʱ�ľ���; 
     * 5.serial�����ڿ����л�������ȱ�� serialVersionUID ����ʱ�ľ���; 
     * 6.finally���κ� finally �Ӿ䲻���������ʱ�ľ���; 
     * 7.all������������������ľ��档
	 * */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Fruit> fruitList = new ArrayList<Fruit>();
	}

}
