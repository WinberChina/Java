package anno.test;

class AppleService {
	public void displayName() {
		System.out.println("ˮ���������ǣ�ƻ��");
	}
	
	@Deprecated
	public void showTaste() {
		System.out.println("ˮ����ƻ���ڸ��ǣ�����");
	}
	
	public void showTaste(int typeId){
        if(typeId==1){
            System.out.println("ˮ����ƻ���Ŀڸ��ǣ���ɬ");
        }
        else if(typeId==2){
            System.out.println("ˮ����ƻ���Ŀڸ��ǣ�����");
        }
        else{
            System.out.println("ˮ����ƻ���Ŀڸ��ǣ�����");
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
