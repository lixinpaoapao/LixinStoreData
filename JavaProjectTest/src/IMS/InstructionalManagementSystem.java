package IMS;
import java.util.*;
class Friend{//朋友类
	private String friendID;
	private String otherName;
	public String getFriendID() {
		return friendID;
	}
	public void setFriendID(String friendID) {
		this.friendID = friendID;
	}
	public String getOtherName() {
		return otherName;
	}
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}
}
class Student{
	private String studentID; //定义学生编号属性
	private String psw; //定义密码属性
	private String name; //定义姓名属性
	private String sex; //定义性别属性
	private int age;  //定义年龄属性
	private String phone;  //定义电话属性
	private String address; //定义地址属性
	Friend[] f = new Friend[50];	
 	public Student(){ //构造函数,自动生成学生编号
		Data.cnt++;
		if(Data.cnt<10){
			this.studentID = "012430" + Data.cnt;
		}
		else{
			this.studentID = "01243" + Data.cnt;
		}
	}
 	//构造函数用于初始化
 	public Student(String psw,String name,String sex,int age,String phone,String address){
 		this();
 		this.psw = psw;
 		this.name = name;
 		this.sex = sex;
 		this.age = age;
 		this.phone = phone;
 		this.address = address;
 	}
 	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		if(studentID.length()==7) //默认学号长度为7
			this.studentID = studentID;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		if(psw.length()>=6)//默认密码长度大于6位
			this.psw = psw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0) //年龄需要大于0
			this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if(phone.length()==8)//电话号码默认为8位
			this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void showInfomationByTeach(){ //显示学生信息,由老师查询
		System.out.printf(this.getStudentID() +"\t"+ this.getName() +"\t"+ this.getPsw() +"\t"+
				this.getSex() + "\t"+ this.getAge() +"\t"+ this.getPhone() +"\t"+ 
				this.getAddress() + "\n");
		
	}
	public void showInfomationByStudent(){ //显示学生信息,由学生查询
		System.out.printf(this.getStudentID() +"\t"+ this.getName() +"\t"+
				this.getSex() + "\t"+ this.getAge() +"\t"+ this.getPhone() +"\t"+ 
				this.getAddress() + "\n");
	}
	public void queryAll(){ //查询所有同学信息
		Methor methor = new Methor();
		methor.queryAll(this);
	}
	public void queryByStudentID(String studentID){ //按学生编号查询
		Methor methor = new Methor();
		methor.queryByStudentID(this, studentID);
	}
	public void vagueQueryByName(String name){ //按姓名模糊查询
		Methor methor = new Methor();
		methor.vagueQueryByName(this, name);
	}
	public void vagueQueryByAddress(String address){ //按地址模糊查询
		Methor methor = new Methor();
		methor.vagueQueryByAddress(this, address);
	}
	public void queryByAge(int lowAge,int highAge){ //按年龄段查询
		Methor methor = new Methor();
		methor.queryByAge(this, lowAge, highAge);
	}
	public void repsw(String studentID){ //修改密码功能
		Methor methor = new Methor();
		methor.repsw(studentID);
	}
	public void reStudentInfomation(String studentID){//修改学生信息
		Methor methor = new Methor();
		methor.reStudentInfomation(studentID);
	}
	public void queryAllfriend(String studentID){//查询所有好友
		Methor methor = new Methor();
		methor.queryAllfriend(studentID);
	}
	public void addFriend(String studentID,Friend friend){//添加好友
		Methor methor = new Methor();
		methor.addFriend(studentID, friend);
	}
	public void delFriend(String studentID,String friendID){//删除好友
		Methor methor = new Methor();
		methor.delFriend(studentID,friendID);
	}
	public void reFriendName(String studentID,Friend friend){//修改好友备注
		Methor methor = new Methor();
		methor.reFriendName(studentID, friend);
	}
}
class Teach{
	private String name;
	private String psw;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public void addStudent(){ //添加学生
		Methor methor = new Methor();
		methor.addStudent();
	}
	public void queryAll(){ //查询所有同学信息
		Methor methor = new Methor();
		methor.queryAll(this);
	}
	public void delStudent(String studentID){ //删除学生
		Methor methor = new Methor();
		methor.delStudent(studentID);
	}
	public void queryByStudentID(String studentID){ //按学生编号查询
		Methor methor = new Methor();
		methor.queryByStudentID(this, studentID);
	}
	public void vagueQueryByName(String name){ //按姓名模糊查询
		Methor methor = new Methor();
		methor.vagueQueryByName(this, name);
	}
	public void vagueQueryByAddress(String address){ //按地址模糊查询
		Methor methor = new Methor();
		methor.vagueQueryByAddress(this, address);
	}
	public void queryByAge(int lowAge,int highAge){ //按年龄段查询
		Methor methor = new Methor();
		methor.queryByAge(this, lowAge, highAge);
	}
	public void reStudentInfomation(String studentID){ //修改学生信息
		Methor methor = new Methor();
		methor.reStudentInfomation(studentID);
	}
}
class Methor{
	public void printByTeach(){//老师查询输出的信息
		System.out.printf("学号\t姓名\t密码\t性别\t年龄\t电话\t\t地址\n");
		for(int i=0;i<Data.index;i++){
			Data.parr[i].showInfomationByTeach();
		}
	}
	public void printByStudent(){//学生查询输出的信息
		System.out.printf("学号\t姓名\t性别\t年龄\t电话\t\t地址\n");
		for(int i=0;i<Data.index;i++){
			Data.parr[i].showInfomationByStudent();
		}
	}
	public void queryAll(Object o){ //查询所有同学信息
		if(o instanceof Teach){//老师调用查询
			printByTeach();
		}
		if(o instanceof Student){//学生调用查询
			printByStudent();
		}
	}
	public void queryByStudentID(Object o,String studentID){ //按学生编号查询
		if(o instanceof Teach){//老师调用查询
			System.out.printf("学号\t姓名\t密码\t性别\t年龄\t电话\t\t地址\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getStudentID().equals(studentID)){
					Data.parr[i].showInfomationByTeach();
					break;
				}
			}
		}
		if(o instanceof Student){//学生调用查询
			System.out.printf("学号\t姓名\tt性别\t年龄\t电话\t\t地址\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getStudentID().equals(studentID)){
					Data.parr[i].showInfomationByStudent();
					break;
				}
			}
		}
	}
	public void vagueQueryByName(Object o,String name){ //按姓名模糊查询
		if(o instanceof Teach){//老师调用查询
			System.out.printf("学号\t姓名\t密码\t性别\t年龄\t电话\t\t地址\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getName().contains(name)){
					Data.parr[i].showInfomationByTeach();
				}
			}
		}
		if(o instanceof Student){//学生调用查询
			System.out.printf("学号\t姓名\t性别\t年龄\t电话\t\t地址\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getName().contains(name)){
					Data.parr[i].showInfomationByStudent();
				}
			}
		}
	}
	public void vagueQueryByAddress(Object o,String address){ //按地址模糊查询
		if(o instanceof Teach){//老师调用查询
			System.out.printf("学号\t姓名\t密码\t性别\t年龄\t电话\t\t地址\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getAddress().contains(address)){
					Data.parr[i].showInfomationByTeach();
				}
			}
		}
		if(o instanceof Student){//学生调用查询
			System.out.printf("学号\t姓名\t性别\t年龄\t电话\t\t地址\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getAddress().contains(address)){
					Data.parr[i].showInfomationByStudent();
				}
			}
		}
	}
	public void queryByAge(Object o,int lowAge , int highAge){ //按年龄段查询
		if(o instanceof Teach){//老师调用查询
			System.out.printf("学号\t姓名\t密码\t性别\t年龄\t电话\t\t地址\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getAge()>=lowAge && Data.parr[i].getAge()<=highAge){
					Data.parr[i].showInfomationByTeach();
				}
			}
		}
		if(o instanceof Student){//学生调用查询
			System.out.printf("学号\t姓名\t性别\t年龄\t电话\t\t地址\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getAge()>=lowAge && Data.parr[i].getAge()<=highAge){
					Data.parr[i].showInfomationByStudent();
				}
			}
		}
	}
	public void repsw(String studentID){ //修改密码
		String str = null; //记录原密码
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(studentID)){
				str = Data.parr[i].getPsw();
				break;
			}
		}
		while(true){
			Scanner in = new Scanner(System.in);
			System.out.println("请输入原密码:");
			String ypsw = in.nextLine();
			System.out.println("请输入新密码:");
			String xpsw = in.nextLine();
			System.out.println("请再次输入新密码:");
			String xpsw_1 = in.nextLine();
			if(ypsw.equals(str)){
				if(xpsw.equals(xpsw_1)){
					Data.parr[i].setPsw(xpsw);
					System.out.println("修改密码成功!");
					break;
				}
				else{
					System.out.println("两次新密码输入不一致");
				}
			}
			else{
				System.out.println("原密码输入错误!");
			}
		}
		System.out.printf("学号\t姓名\t性别\t年龄\t电话\t\t地址\n");
		Data.parr[i].showInfomationByStudent();
	}
	public void delStudent(String studentID){//删除学生
		int i=0,flag=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(studentID)){
				flag=1;
			}
			if(flag==1){
				while(i<Data.index-1){
					Data.parr[i]=Data.parr[i+1];
					i++;
				}
				//对朋友表中的数据进行维护
				int p=0;
				for(int j=0;j<Data.index;j++){
					p=0;
					int k=0;
					for(k=0;k<Data.index;k++){
						if(Data.parr[j].f[k]==null)break;
						if(studentID.equals(Data.parr[j].f[k].getFriendID())){
							p=1;
							break;
						}
					}
					if(p==1){
						while(k<Data.index-1){
							Data.parr[j].f[k]=Data.parr[j].f[k+1];
							k++;
						}
						Data.parr[j].f[k]=null;
					}
				}
				break;
			}
		}
		if(flag==1){	
			System.out.println("删除成功!");
			Data.index -= 1;	
		}
		else{
			System.out.println("不存在该学生,删除失败!");
		}
		Teach teach = new Teach();
		System.out.printf("学号\t姓名\t密码\t性别\t年龄\t电话\t\t地址\n");
		teach.queryAll();
	}
	public void addStudent(){//添加学生
		Scanner in = new Scanner(System.in);
		Student stu = new Student();
		String str =null;
		int t = 0;
		System.out.printf("************添加学生信息************\n");
		System.out.printf("学号:" + stu.getStudentID() + "\n");//学号由构造器生成
		//设置密码
		System.out.printf("密码:");
		str = in.nextLine();
		while(str.length()<6){
			System.out.println("密码设置错误!密码长度不小于6位!");
			System.out.printf("请重新输入密码:");
			str = in.nextLine();
		}
		stu.setPsw(str);
		//设置姓名
		System.out.printf("姓名:");
		stu.setName(in.nextLine());
		//设置性别
		System.out.printf("性别:");
		str = in.nextLine();
		while(!str.equals("男") && !str.equals("女")){
			System.out.println("性别设置错误!性别应为男或女!");
			System.out.printf("请重新输入性别:");
			str = in.nextLine();
		}
		stu.setSex(str);
		//设置年龄
		System.out.printf("年龄:");
		t = Integer.valueOf(in.nextLine());
		while(t<6){
			System.out.println("年龄输入错误!不到6岁不让上学!");
			System.out.printf("请重新输入年龄:");
			t = in.nextInt();
		}
		stu.setAge(t);
		//设置电话
		System.out.printf("电话:");
		str = in.nextLine();
		while(str.length()!=8 && str.length()!=11){
			System.out.println("电话号码输入错误!电话号码应为8位或11位!");
			System.out.printf("请重新输入电话:");
			str = in.nextLine();
		}
		stu.setPhone(str);
		//设置地址
		System.out.printf("地址:");
		stu.setAddress(in.nextLine());
		Data.parr[Data.index] = stu;
		Data.index += 1;
		//in.close(); 
	}
	public void reStudentInfomation(String studentID){//修改学生信息信息
		Scanner in = new Scanner(System.in);
		int i=0,flag=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(studentID)){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.printf("学号\t姓名\t密码\t性别\t年龄\t电话\t\t地址\n");
			Data.parr[i].showInfomationByTeach();
			System.out.printf("*************修改操作************\n");
			System.out.printf("*\t1.修改姓名\t\t*\n");
			System.out.printf("*\t2.修改性别\t\t*\n");
			System.out.printf("*\t3.修改年龄\t\t*\n");
			System.out.printf("*\t4.修改电话\t\t*\n");
			System.out.printf("*\t5.修改地址\t\t*\n");
			System.out.printf("*\t6.修改密码\t\t*\n");
			System.out.printf("*\t7.修改全部\t\t*\n");
			System.out.printf("*\t0.退出\t\t*\n");
			System.out.printf("*****************************\n");	
			System.out.print("1,2,3,4,5,6,7,0请选择:");
			int num = in.nextInt();
			switch(num){
			case 1:case_1(i);break;
			case 2:case_2(i);break;
			case 3:case_3(i);break;
			case 4:case_4(i);break;
			case 5:case_5(i);break;
			case 6:case_6(i);break;
			case 7:
				case_1(i);
				case_2(i);
				case_3(i);
				case_4(i);
				case_5(i);
				case_6(i);
				break;
			case 0:
			default:
				return;
			}
		}
	}
	public void case_1(int index){//修改姓名
		Scanner in = new Scanner(System.in);
		System.out.print("请输入新姓名:");
		String str = in.nextLine();
		Data.parr[index].setName(str);
	}
	public void case_2(int index){//修改性别
		Scanner in = new Scanner(System.in);
		System.out.print("请输入新性别(男或女):");
		String str = in.nextLine();
		Data.parr[index].setSex(str);
	}
	public void case_3(int index){//修改年龄
		Scanner in = new Scanner(System.in);
		System.out.print("请输入新年龄:");
		int age = in.nextInt();
		Data.parr[index].setAge(age);
	}
	public void case_4(int index){//修改电话
		Scanner in = new Scanner(System.in);
		System.out.print("请输入新电话(8位或11位):");
		String str = in.nextLine();
		Data.parr[index].setPhone(str);
	}
	public void case_5(int index){//修改地址
		Scanner in = new Scanner(System.in);
		System.out.print("请输入新地址:");
		String str = in.nextLine();
		Data.parr[index].setAddress(str);
	}
	public void case_6(int index){//修改密码
		Scanner in = new Scanner(System.in);
		System.out.print("请输入新密码:");
		String str = in.nextLine();
		Data.parr[index].setPsw(str);
	}
	public void queryAllfriend(String studentID){//查询所有好友
		int i=0;
		for(i=0;i<Data.index;i++){
			if(studentID.equals(Data.parr[i].getStudentID())){
				break;
			}
		}
		int cnt=0;
		for(int j=0;j<Data.index;j++){
			if(Data.parr[i].f[j]==null){
				break;
			}
			for(int k=0;k<Data.index;k++){
				if(Data.parr[i].f[j].getFriendID().equals(Data.parr[k].getStudentID())){
					if(cnt==0){
						System.out.printf("学号\t姓名\t性别\t年龄\t电话\t\t地址\n");
					}
					Data.parr[k].showInfomationByStudent();
					cnt++;
				}
			}
		}
		if(cnt==0){
			System.out.println("你还没有好友!");
		}
	}
	public void addFriend(String studentID,Friend friend){//添加好友
		int i=0;
		for(i=0;i<Data.index;i++){
			if(studentID.equals(Data.parr[i].getStudentID())){
				break;
			}
		}
		for(int j=0;j<Data.index;j++){
			if(Data.parr[i].f[j]==null){
				Data.parr[i].f[j]=friend;
				System.out.println("添加好友成功!");
				break;
			}
		}
	}
	public void delFriend(String studentID,String friendID){//删除好友
		int i=0;
		for(i=0;i<Data.index;i++){
			if(studentID.equals(Data.parr[i].getStudentID())){
				break;
			}
		}
		int flag=0;
		for(int j=0;j<Data.index;j++){
			if(Data.parr[i].f[j]==null) break;
			if(Data.parr[i].f[j].getFriendID().equals(friendID)){
				flag=1;				
			}
			if(flag==1){
				while(j<Data.index-1){
					Data.parr[i].f[j]=Data.parr[i].f[j+1];
					j++;
				}
				Data.parr[i].f[j]=null;
				System.out.println("删除好友成功!");
				break;
			}
		}
	}
	public void reFriendName(String studentID,Friend friend){//修改好友备注
		int i=0;
		for(i=0;i<Data.index;i++){
			if(studentID.equals(Data.parr[i].getStudentID())){
				break;
			}
		}
		for(int j=0;j<Data.index;j++){
			if(Data.parr[i].f[j]==null) break;
			if(Data.parr[i].f[j].getFriendID().equals(friend.getFriendID())){
				Data.parr[i].f[j]=friend;
				System.out.println("修改好友备注成功!");
				break;
			}
		}
	}
}
class Data{
	//static修饰的变量或引用或方法,可以通过对象访问,也可以类名.访问
	static Student[] parr = new Student[50];//存储对象
	static int  cnt = 0;//统计生成学生的个数
	static int index = 10;//记录数组中的元素的个数
	public static void init(){//初始化赋值
		int i=0;
		Student stu_1 = new Student("111111","李鑫","男",22,"15079029607","江西南昌");
		parr[i++] = stu_1;
		Student stu_2 = new Student("222222","张蓝帆","男",18,"18370397321","江西上饶");
		parr[i++] = stu_2;
		Student stu_3 = new Student("333333","胡魁","男",22,"11011011","江西抚州");
		parr[i++] = stu_3;
		Student stu_4 = new Student("444444","戈毛辉","男",25,"1771950795","江西宜春");
		parr[i++] = stu_4;
		Student stu_5 = new Student("555555","熊子健","男",22,"12233445","江西九江");
		parr[i++] = stu_5;
		Student stu_6 = new Student("666666","唐国强","男",22,"12346525","江西南昌");
		parr[i++] = stu_6;
		Student stu_7 = new Student("777777","素素","女",22,"15979194783","江西九江");
		parr[i++] = stu_7;
		Student stu_8 = new Student("888888","吴松杏","女",22,"88888888","广东广州");
		parr[i++] = stu_8;
		Student stu_9 = new Student("999999","彭存","男",22,"55555555","江西南昌");
		parr[i++] = stu_9;
		Student stu_10 = new Student("123456","王键","男",22,"77788899","江西南昌");
		parr[i++] = stu_10;
	}
}

class Print{
	public static void checkStudent(){//学生登录检查
		Scanner in = new Scanner(System.in);
		Scanner in_1 = new Scanner(System.in);
		System.out.print("学生编号:");
		String strNo = in.nextLine();
		System.out.print("密码:");
		String strPsw = in_1.nextLine();
		int flag=0;
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(strNo)){
				if(Data.parr[i].getPsw().equals(strPsw)){
					flag=1;
					break;
				}
				else{
					flag=2;
					break;
				}
			}
		}
		if(flag==1){
			print1(strNo);
		}
		if(flag==2){
			System.out.println("密码输入错误,请重新输入!");
			checkStudent();
		}
		if(flag==0){
			System.out.println("学号输入错误,请重新输入!");
			checkStudent();
		}
	}
	public static void checkTeach(){//教师登录检查
		Scanner in = new Scanner(System.in);
		Scanner in_1 = new Scanner(System.in);
		System.out.print("用户名:");
		String strNo = in.nextLine();
		System.out.print("密码:");
		String strPsw = in_1.nextLine();
		if(strNo.equals("admin") && strPsw.equals("123456")){
			print2();
		}
		else{
			if(!strNo.equals("admin")){
				System.out.println("用户名输入错误!");
			}
			else{
				System.out.println("密码输入错误!");
			}
		}
	}
	public static void print(){ //刚进入界面
		Scanner in = new Scanner(System.in);
		System.out.printf("*************用户登录**********\n");
		System.out.printf("*\t1.学生登录\t\t*\n");
		System.out.printf("*\t2.教师登录\t\t*\n");
		System.out.printf("*\t3.退出\t\t*\n");
		System.out.printf("****************************\n");	
		System.out.print("1,2,3请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:checkStudent();break;
		case 2:checkTeach();break;
		case 3: return;
		}
	}
	public static void print1(String studentID){//学生登录界面
		Scanner in = new Scanner(System.in);
		System.out.printf("\n****欢迎学号为:"+studentID+"同学 *****\n");
		System.out.printf("*\t1.查询个人信息\t*\n");
		System.out.printf("*\t2.修改密码\t\t*\n");
		System.out.printf("*\t3.修改个人信息\t*\n");
		System.out.printf("*\t4.查询同学信息\t*\n");
		System.out.printf("*\t5.查询所有好友\t*\n");
		System.out.printf("*\t6.添加好友信息\t*\n");
		System.out.printf("*\t7.删除好友信息\t*\n");
		System.out.printf("*\t8.修改好友备注\t*\n");
		System.out.printf("*\t0.任意键退出\t*\n");
		System.out.printf("\n***************************\n");
		System.out.print("1,2,3,4,5,6,7,8,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print11(studentID);break;
		case 2:print12(studentID);break;
		case 3:print13(studentID);break;
		case 4:print14(studentID);break;
		case 5:print15(studentID);break;
		case 6:print16(studentID);break;
		case 7:print17(studentID);break;
		case 8:print18(studentID);break;
		case 0:
		default:return;
		}
	}
	public static void print11(String str){//查询个人信息
		Scanner in = new Scanner(System.in);
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				System.out.printf("学号\t姓名\t性别\t年龄\t电话\t\t地址\n");
				Data.parr[i].showInfomationByStudent();
				break;
			}
		}
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print1(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	} 
	public static void print12(String str){//修改密码
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				Data.parr[i].repsw(str);
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");	
		int num = in.nextInt();
		switch(num){
		case 1:print1(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	} 
	public static void print13(String str){//修改个人信息
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				Data.parr[i].reStudentInfomation(str);;
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");	
		int num = in.nextInt();
		switch(num){
		case 1:print1(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	} 
	public static void print14(String str){//查询同学信息
		Scanner in = new Scanner(System.in);
		System.out.printf("\n****欢迎学号为:"+str+"同学 *****\n");
		System.out.printf("\n***********查询同学信息**********\n");
		System.out.printf("*\t1.查询所有同学信息\t*\n");
		System.out.printf("*\t2.按编号查询\t*\n");
		System.out.printf("*\t3.按姓名模糊查询\t*\n");
		System.out.printf("*\t4.按地址模糊查询\t*\n");
		System.out.printf("*\t5.按年龄段查询查询\t*\n");
		System.out.printf("*\t0.任意键退出\t*\n");
		System.out.printf("***************************\n");
		System.out.print("1,2,3,4,5,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print141(str);break;
		case 2:print142(str);break;
		case 3:print143(str);break;
		case 4:print144(str);break;
		case 5:print145(str);break;
		case 0:
		default:
			return;
		}
	} 
	public static void print15(String str){//查询所有好友
		for(int i=0;i<Data.index;i++){
			if(str.equals(Data.parr[i].getStudentID())){
				Data.parr[i].queryAllfriend(str);
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print1(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	}
	public static void print16(String str){//添加好友信息
		int j=0;
		for(j=0;j<Data.index;j++){
			if(Data.parr[j].getStudentID().equals(str)){
				break;
			}
		}
		int flag=0,cnt=0;
		for(int i=0;i<Data.index;i++){
			flag=1;
			for(int k=0;k<Data.index;k++){
				if(Data.parr[j].f[k]==null){
					flag=1;
					cnt++;
					break;
				}
				if(Data.parr[i].getStudentID().equals(Data.parr[j].f[k].getFriendID())){
					flag=0;
					break;
				}
			}
			if(flag==1){
				if(cnt==1){
					System.out.printf("学号\t姓名\t性别\t年龄\t电话\t\t地址\n");
				}
				Data.parr[i].showInfomationByStudent();
			}
		}
		Scanner in = new Scanner(System.in);
		Friend friend = new Friend();
		System.out.print("请输入要添加的好友编号:");
		String fid = in.nextLine();
		flag = 0;
		for(int i=0;i<Data.index;i++){
			if(fid.equals(Data.parr[i].getStudentID())){
				flag=1;
				break;
			}
		}
		if(flag==1){
			friend.setFriendID(fid);
		}
		else{
			System.out.println("不存在该学生!请重新输入!");
			while(flag==0){
				print16(str);
			}
		}
		System.out.print("请输入好友备注:");
		friend.setOtherName(in.nextLine());
		for(int i=0;i<Data.index;i++){
			if(str.equals(Data.parr[i].getStudentID())){
				Data.parr[i].addFriend(str,friend);
				break;
			}
		}
		Scanner in_1 = new Scanner(System.in);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续添加\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");
		int num = in_1.nextInt();
		switch(num){
		case 1:print1(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print16(str);break;//继续添加
		case 0:
		default:
			return ;
		}
	}
	public static void print17(String str){//删除好友信息
		Scanner in = new Scanner(System.in);
		System.out.print("请输入要删除好友的编号:");
		String fid = in.nextLine();
		int i =0,flag=0;
		for(i=0;i<Data.index;i++){
			if(str.equals(Data.parr[i].getStudentID())){
				break;
			}
		}
		for(int j=0;j<Data.index;j++){
			if(Data.parr[i].f[j]==null) break;
			if(fid.equals(Data.parr[i].f[j].getFriendID())){
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("不存在该好友编号,请重新输入!");
			while(flag==0){
				print17(str);
			}
		}
		Data.parr[i].delFriend(str,fid);
		Scanner in_1 = new Scanner(System.in);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");
		int num = in_1.nextInt();
		switch(num){
		case 1:print1(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	}
	public static void print18(String str){//修改好友备注
		Friend friend = new Friend();
		Scanner in = new Scanner(System.in);
		System.out.print("请输入要修改备注的好友编号:");
		String fid = in.nextLine();
		int flag = 0,i=0;
		for(i=0;i<Data.index;i++){
			if(str.equals(Data.parr[i].getStudentID())){
				break;
			}
		}
		for(int j=0;j<Data.index;j++){
			if(Data.parr[i].f[j].equals(fid)){
				flag=1;
				break;
			}
		}
		if(flag==1){
			friend.setFriendID(fid);
		}
		else{
			System.out.println("不存在该学生!请重新输入!");
			while(flag==0){
				print16(str);
			}
		}
		System.out.print("请输入新备注:");
		friend.setOtherName(in.nextLine());
		Data.parr[i].reFriendName(str, friend);	
		Scanner in_1 = new Scanner(System.in);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");
		int num = in_1.nextInt();
		switch(num){
		case 1:print1(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	}
	public static void print141(String str){//查询所有同学信息
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				Data.parr[i].queryAll();
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	}
	public static void print142(String str){//按编号查询
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.print("请输入要查询的编号:");
		String studentID = in.nextLine();
		Data.parr[i].queryByStudentID(studentID);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续查询\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print142(str);break;//继续查询
		case 0:
		default:
			return ;
		}
	}
	public static void print143(String str){//按姓名模糊查询
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				break;
			}
		}
		System.out.print("请输入要查询的姓名关键字(必须联系且不能出错):");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		Data.parr[i].vagueQueryByName(name);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续查询\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print143(str);break; //继续查询
		case 0:
		default:
			return ;
		}
	}
	public static void print144(String str){//按地址模糊查询
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.print("请输入查询的地址(必须连续且没有错误):");
		String address = in.nextLine();
		Data.parr[i].vagueQueryByAddress(address);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续查询\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print144(str);break; //继续查询
		case 0:
		default:
			return;
		}
	}
	public static void print145(String str){//按年龄段查询查询
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.print("请输入要查找的年龄范围(low to high):");
		int low = in.nextInt();
		int high = in.nextInt();
		Data.parr[i].queryByAge(low, high);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续查询\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//返回上级目录
		case 2:print1(str);break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print145(str);break; //继续查询
		case 0:
		default:
			return;
		}
	}
	public static void print2(){//教师登录界面
		Scanner in = new Scanner(System.in);
		System.out.printf("\n*************欢迎************\n");
		System.out.printf("*\t1.添加学生信息\t*\n");
		System.out.printf("*\t2.查询学生信息\t*\n");
		System.out.printf("*\t3.修改学生信息\t*\n");
		System.out.printf("*\t4.删除学生信息\t*\n");
		System.out.printf("*\t0.退出\t\t*\n");
		System.out.printf("***************************\n");
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print21();break;
		case 2:print22();break;
		case 3:print23();break;
		case 4:print24();break;
		case 0:
		default:return;
		}
	}
	public static void print21(){//添加学生信息
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		while(true){
			teach.addStudent();
			System.out.printf("是否继续添加<Y/N>?");
			String str = in.nextLine();
			if(str.equals("Y")){
				continue;
			}
			if(str.equals("N")){
				break;
			}
		}
		teach.queryAll();
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print2();break;//返回上级目录
		case 2:print2();break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	}
	public static void print22(){//查询学生信息
		Scanner in = new Scanner(System.in);
		System.out.printf("\n***********查询学生信息**********\n");
		System.out.printf("*\t1.查询所有学生信息\t*\n");
		System.out.printf("*\t2.按编号查询\t*\n");
		System.out.printf("*\t3.按姓名模糊查询\t*\n");
		System.out.printf("*\t4.按地址模糊查询\t*\n");
		System.out.printf("*\t5.按年龄段查询查询\t*\n");
		System.out.printf("*\t0.任意键退出\t*\n");
		System.out.printf("***************************\n");
		System.out.print("1,2,3,4,5,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print221();break;
		case 2:print222();break;
		case 3:print223();break;
		case 4:print224();break;
		case 5:print225();break;
		case 0:
		default:
			return;
		}
	}
	public static void print221(){//查询所有学生信息
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		teach.queryAll();
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//返回上级目录
		case 2:print2();break;//返回主目录
		case 3:print();break;//退出登录
		case 0:
		default:
			return ;
		}
	}
	public static void print222(){//按编号查询
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		System.out.print("请输入要查询的编号:");
		String str = in.nextLine();
		teach.queryByStudentID(str);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续查询\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//返回上级目录
		case 2:print2();break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print222();break;//继续查询
		case 0:
		default:
			return ;
		}
	}
	public static void print223(){//按姓名模糊查询
		System.out.print("请输入要查询的姓名关键字(必须联系且不能出错):");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Teach teach = new Teach();
		teach.vagueQueryByName(str);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续查询\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//返回上级目录
		case 2:print2();break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print223();break; //继续查询
		case 0:
		default:
			return ;
		}
	}
	public static void print224(){//按地址模糊查询
		Scanner in = new Scanner(System.in);
		Teach teach = new Teach();
		System.out.print("请输入查询的地址(必须连续且没有错误):");
		String str = in.nextLine();
		teach.vagueQueryByAddress(str);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续查询\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//返回上级目录
		case 2:print2();break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print224();break; //继续查询
		case 0:
		default:
			return;
		}
	}
	public static void print225(){//按年龄段查询查询
		Scanner in = new Scanner(System.in);
		Teach teach = new Teach();
		System.out.print("请输入要查找的年龄范围(low to high):");
		int low = in.nextInt();
		int high = in.nextInt();
		teach.queryByAge(low, high);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续查询\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//返回上级目录
		case 2:print2();break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print224();break; //继续查询
		case 0:
		default:
			return;
		}
	}
	public static void print23(){//修改学生信息
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		System.out.print("请输入要修改学生的编号:");
		String  str = in.nextLine();
		teach.reStudentInfomation(str);
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续修改\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print2();break;//返回上级目录
		case 2:print2();break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print23();break;//继续修改
		case 0:
		default:
			return ;
		}
	}
	public static void print24(){//删除学生信息
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		System.out.print("删除学生的编号:");
		String str = in.nextLine();
		teach.delStudent(str);
		teach.queryAll();
		System.out.printf("*************操作选择************\n");
		System.out.printf("*\t1.返回上级目录\t*\n");
		System.out.printf("*\t2.返回主目录\t*\n");
		System.out.printf("*\t3.退出登录\t\t*\n");
		System.out.printf("*\t4.继续删除\t\t*\n");
		System.out.printf("*\t0.结束程序\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0请选择:");
		int num = in.nextInt();
		switch(num){
		case 1:print2();break;//返回上级目录
		case 2:print2();break;//返回主目录
		case 3:print();break;//退出登录
		case 4:print24();break;//继续删除
		case 0:
		default:
			return ;
		}
	}
}
public class  InstructionalManagementSystem{
	public static void main(String[] args){
		Data.init();
		Print.print();
	}
}
