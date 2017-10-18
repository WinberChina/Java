package chapters.polymorphism;

import java.util.Arrays;

public class CountTimes {
	/*
	 * public static void main(String[] args) { Scanner input = new
	 * Scanner(System.in); System.out.println("请输入考试成绩信息：");
	 * 
	 * // 变量保存成绩 int score = input.nextInt();
	 * 
	 * // 变量保存加分次数 int count = 0;
	 * 
	 * // 打印输出加分前成绩 System.out.println("加分前成绩：" + score);
	 * 
	 * // 只要成绩小于60，就循环执行加分操作，并统计加分次数 while (score <= 60) { score++; count++; }
	 * // 打印输出加分后成绩，以及加分次数 System.out.println("加分后成绩：" + score);
	 * System.out.println("共加了" + count + "次"); }
	 */
	/*
	 * public static void main(String[] args) {
	 * 
	 * // 定义一个整型数组，并赋初值 int[] nums = new int[] { 61, 23, 4, 74, 13, 148, 20 };
	 * 
	 * int max = nums[0]; // 假定最大值为数组中的第一个元素 int min = nums[0]; //
	 * 假定最小值为数组中的第一个元素 double sum = 0;// 累加值 double avg = 0;// 平均值
	 * 
	 * for (int i = 0; i < nums.length; i++) { // 循环遍历数组中的元素 //
	 * 如果当前值大于max，则替换max的值 if (nums[i] > max) { max = nums[i]; } //
	 * 如果当前值小于min，则替换min的值 if (nums[i] < min) { min = nums[i]; } // 累加求和 sum +=
	 * nums[i]; }
	 * 
	 * // 求平均值 avg = sum / nums.length; System.out.println("数组中的最大值：" + max);
	 * System.out.println("数组中的最小值：" + min); System.out.println("数组中的平均值：" +
	 * avg); }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * // 定义一个整型数组，保存成绩信息 int[] scores = { 89, 72, 64, 58, 93 };
	 * 
	 * // 对Arrays类对数组进行排序 Arrays.sort(scores);
	 * 
	 * // 使用foreach遍历输出数组中的元素 for (int score : scores) {
	 * System.out.println(score); } }
	 */

	/*
	 * // 完成 main 方法 public static void main(String[] args) {
	 * 
	 * // 创建对象，对象名为hello CountTimes hello = new CountTimes();
	 * 
	 * // 调用方法并将返回值保存在变量中 int maxScore = hello.getMaxAge();
	 * 
	 * // 输出最大年龄 System.out.println("最大年龄为：" + maxScore); }
	 * 
	 * 
	 * 功能：输出学生年龄的最大值 定义一个无参的方法，返回值为年龄的最大值 参考步骤： 1、定义一个整形数组 ages ，保存学生年龄，数组元素依次为
	 * 18 ,23 ,21 ,19 ,25 ,29 ,17 2、定义一个整形变量 max ,保存学生最大年龄，初始时假定数组中的第一个元素为最大值
	 * 3、使用 for 循环遍历数组中的元素，并与假定的最大值比较，如果比假定的最大值要大，则替换当前的最大值 4、使用 return 返回最大值
	 * 
	 * public int getMaxAge() {
	 * 
	 * int[] ages = new int[] { 18, 23, 21, 19, 25, 29, 17 }; int max = ages[0];
	 * for (int age : ages) { if (age > max) { max = age; } }
	 * 
	 * return max; }
	 */

	public static void main(String[] args) {

		// 创建对象，对象名为hello
		HelloWorld hello = new HelloWorld();

		// 调用方法并将返回值保存在变量中
		int[] nums = hello.getArray(8);

		// 将数组转换为字符串并输出
		System.out.println(Arrays.toString(nums));
	}

	/*
	 * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
	 * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
	 */
	public int[] getArray(int length) {
		// 定义指定长度的整型数组
		int[] nums = new int[length];

		// 循环遍历数组赋值
		for (int i = 0; i < nums.length; i++) {

			// 产生一个100以内的随机数，并赋值给数组的每个成员 
			nums[i] = (int)(Math.random() * 100);

		}
		return nums; // 返回赋值后的数组
	}
}
