package anno.test;

import java.lang.reflect.Field;

public class FruitInfoUtil {
	public static void getFruitInfo(Class clazz) {
		String strFruitName = "水果的名字：";
		String strFruitColor = "水果的颜色：";
		String strFruitProvider = "水果的供应商信息：";
		
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
				strFruitProvider += "供应商编号：" + fruitProvider.id() + ", 供应商姓名：" + fruitProvider.name() + ", 供应商地址：" + fruitProvider.address();
				System.out.println(strFruitProvider);
			}
		}
	}
}
