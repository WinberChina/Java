package anno.test;

import java.lang.reflect.Field;

public class FruitInfoUtil {
	public static void getFruitInfo(Class clazz) {
		String strFruitName = "ˮ�������֣�";
		String strFruitColor = "ˮ������ɫ��";
		String strFruitProvider = "ˮ���Ĺ�Ӧ����Ϣ��";
		
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields) {
			if(field.isAnnotationPresent(FruitName.class)) {
				FruitName fruitName = field.getAnnotation(FruitName.class);
				strFruitName += fruitName.value();
				System.out.println(strFruitName);
			}
			if(field.isAnnotationPresent(FruitColor.class)) {
				FruitColor fruitColor = field.getAnnotation(FruitColor.class);
				strFruitColor += fruitColor.fruitColor();
				System.out.println(strFruitColor);
			}
			if(field.isAnnotationPresent(FruitProvider.class)) {
				FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
				strFruitProvider += "��Ӧ�̱�ţ�" + fruitProvider.id() + ", ��Ӧ��������" + fruitProvider.name() + ", ��Ӧ�̵�ַ��" + fruitProvider.address();
				System.out.println(strFruitProvider);
			}
		}
	}
}
