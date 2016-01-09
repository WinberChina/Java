package anno.test;

import java.lang.reflect.Method;

public class BuisinessLogic {
	@Todo(priority = Todo.Priority.MEDIUM, author = "Yashwant", status = Todo.Status.STARTED)
	public void incompleteMethod() {
	}
	public static void main(String[] args) {
		Class<BuisinessLogic> businessClass = BuisinessLogic.class;
		for(Method method : businessClass.getMethods()) {
			Todo todoAnnotation = (Todo)method.getAnnotation(Todo.class);
			if(todoAnnotation != null) {
				System.out.println(" Method name : " + method.getName());
				System.out.println(" Author : " + todoAnnotation.author());
				System.out.println(" Priority : " + todoAnnotation.priority());
				System.out.println(" Status : " + todoAnnotation.status());
			}
		}
	}
}
