package chapters.polymorphism;

import java.util.Arrays;

public class CountTimes {
	/*
	 * public static void main(String[] args) { Scanner input = new
	 * Scanner(System.in); System.out.println("�����뿼�Գɼ���Ϣ��");
	 * 
	 * // ��������ɼ� int score = input.nextInt();
	 * 
	 * // ��������ӷִ��� int count = 0;
	 * 
	 * // ��ӡ����ӷ�ǰ�ɼ� System.out.println("�ӷ�ǰ�ɼ���" + score);
	 * 
	 * // ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷִ��� while (score <= 60) { score++; count++; }
	 * // ��ӡ����ӷֺ�ɼ����Լ��ӷִ��� System.out.println("�ӷֺ�ɼ���" + score);
	 * System.out.println("������" + count + "��"); }
	 */
	/*
	 * public static void main(String[] args) {
	 * 
	 * // ����һ���������飬������ֵ int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };
	 * 
	 * int max = nums[0]; // �ٶ����ֵΪ�����еĵ�һ��Ԫ�� int min = nums[0]; //
	 * �ٶ���СֵΪ�����еĵ�һ��Ԫ�� double sum = 0;// �ۼ�ֵ double avg = 0;// ƽ��ֵ
	 * 
	 * for (int i = 0; i < nums.length; i++) { // ѭ�����������е�Ԫ�� //
	 * �����ǰֵ����max�����滻max��ֵ if (nums[i] > max) { max = nums[i]; } //
	 * �����ǰֵС��min�����滻min��ֵ if (nums[i] < min) { min = nums[i]; } // �ۼ���� sum +=
	 * nums[i]; }
	 * 
	 * // ��ƽ��ֵ avg = sum / nums.length; System.out.println("�����е����ֵ��" + max);
	 * System.out.println("�����е���Сֵ��" + min); System.out.println("�����е�ƽ��ֵ��" +
	 * avg); }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * // ����һ���������飬����ɼ���Ϣ int[] scores = { 89, 72, 64, 58, 93 };
	 * 
	 * // ��Arrays�������������� Arrays.sort(scores);
	 * 
	 * // ʹ��foreach������������е�Ԫ�� for (int score : scores) {
	 * System.out.println(score); } }
	 */

	/*
	 * // ��� main ���� public static void main(String[] args) {
	 * 
	 * // �������󣬶�����Ϊhello CountTimes hello = new CountTimes();
	 * 
	 * // ���÷�����������ֵ�����ڱ����� int maxScore = hello.getMaxAge();
	 * 
	 * // ���������� System.out.println("�������Ϊ��" + maxScore); }
	 * 
	 * 
	 * ���ܣ����ѧ����������ֵ ����һ���޲εķ���������ֵΪ��������ֵ �ο����裺 1������һ���������� ages ������ѧ�����䣬����Ԫ������Ϊ
	 * 18 ,23 ,21 ,19 ,25 ,29 ,17 2������һ�����α��� max ,����ѧ��������䣬��ʼʱ�ٶ������еĵ�һ��Ԫ��Ϊ���ֵ
	 * 3��ʹ�� for ѭ�����������е�Ԫ�أ�����ٶ������ֵ�Ƚϣ�����ȼٶ������ֵҪ�����滻��ǰ�����ֵ 4��ʹ�� return �������ֵ
	 * 
	 * public int getMaxAge() {
	 * 
	 * int[] ages = new int[] { 18, 23, 21, 19, 25, 29, 17 }; int max = ages[0];
	 * for (int age : ages) { if (age > max) { max = age; } }
	 * 
	 * return max; }
	 */

	public static void main(String[] args) {

		// �������󣬶�����Ϊhello
		HelloWorld hello = new HelloWorld();

		// ���÷�����������ֵ�����ڱ�����
		int[] nums = hello.getArray(8);

		// ������ת��Ϊ�ַ��������
		System.out.println(Arrays.toString(nums));
	}

	/*
	 * ���ܣ�����ָ�����ȵ�int�����飬������100���������Ϊ�����е�ÿ��Ԫ�ظ�ֵ
	 * ����һ�����δ�����ֵ�ķ�����ͨ��������������ĳ��ȣ����ظ�ֵ�������
	 */
	public int[] getArray(int length) {
		// ����ָ�����ȵ���������
		int[] nums = new int[length];

		// ѭ���������鸳ֵ
		for (int i = 0; i < nums.length; i++) {

			// ����һ��100���ڵ������������ֵ�������ÿ����Ա 
			nums[i] = (int)(Math.random() * 100);

		}
		return nums; // ���ظ�ֵ�������
	}
}
