package anno.test;

class AppleService {
	public void displayName() {
		System.out.println("水果的名字是：苹果");
	}
	
	@Deprecated
	public void showTaste() {
		System.out.println("水果的苹果口感是：脆甜");
	}
	
	public void showTaste(int typeId){
        if(typeId==1){
            System.out.println("水果的苹果的口感是：酸涩");
        }
        else if(typeId==2){
            System.out.println("水果的苹果的口感是：绵甜");
        }
        else{
            System.out.println("水果的苹果的口感是：脆甜");
        }
    }
}

public class FruitRun {
	/**
     * @param args
     */
    public static void main(String[] args) {
    	FruitInfoUtil.getFruitInfo(Pear.class);
    }
}
