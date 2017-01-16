package IMS;
import java.util.*;
class Friend{//������
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
	private String studentID; //����ѧ���������
	private String psw; //������������
	private String name; //������������
	private String sex; //�����Ա�����
	private int age;  //������������
	private String phone;  //����绰����
	private String address; //�����ַ����
	Friend[] f = new Friend[50];	
 	public Student(){ //���캯��,�Զ�����ѧ�����
		Data.cnt++;
		if(Data.cnt<10){
			this.studentID = "012430" + Data.cnt;
		}
		else{
			this.studentID = "01243" + Data.cnt;
		}
	}
 	//���캯�����ڳ�ʼ��
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
		if(studentID.length()==7) //Ĭ��ѧ�ų���Ϊ7
			this.studentID = studentID;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		if(psw.length()>=6)//Ĭ�����볤�ȴ���6λ
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
		if(age>=0) //������Ҫ����0
			this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if(phone.length()==8)//�绰����Ĭ��Ϊ8λ
			this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void showInfomationByTeach(){ //��ʾѧ����Ϣ,����ʦ��ѯ
		System.out.printf(this.getStudentID() +"\t"+ this.getName() +"\t"+ this.getPsw() +"\t"+
				this.getSex() + "\t"+ this.getAge() +"\t"+ this.getPhone() +"\t"+ 
				this.getAddress() + "\n");
		
	}
	public void showInfomationByStudent(){ //��ʾѧ����Ϣ,��ѧ����ѯ
		System.out.printf(this.getStudentID() +"\t"+ this.getName() +"\t"+
				this.getSex() + "\t"+ this.getAge() +"\t"+ this.getPhone() +"\t"+ 
				this.getAddress() + "\n");
	}
	public void queryAll(){ //��ѯ����ͬѧ��Ϣ
		Methor methor = new Methor();
		methor.queryAll(this);
	}
	public void queryByStudentID(String studentID){ //��ѧ����Ų�ѯ
		Methor methor = new Methor();
		methor.queryByStudentID(this, studentID);
	}
	public void vagueQueryByName(String name){ //������ģ����ѯ
		Methor methor = new Methor();
		methor.vagueQueryByName(this, name);
	}
	public void vagueQueryByAddress(String address){ //����ַģ����ѯ
		Methor methor = new Methor();
		methor.vagueQueryByAddress(this, address);
	}
	public void queryByAge(int lowAge,int highAge){ //������β�ѯ
		Methor methor = new Methor();
		methor.queryByAge(this, lowAge, highAge);
	}
	public void repsw(String studentID){ //�޸����빦��
		Methor methor = new Methor();
		methor.repsw(studentID);
	}
	public void reStudentInfomation(String studentID){//�޸�ѧ����Ϣ
		Methor methor = new Methor();
		methor.reStudentInfomation(studentID);
	}
	public void queryAllfriend(String studentID){//��ѯ���к���
		Methor methor = new Methor();
		methor.queryAllfriend(studentID);
	}
	public void addFriend(String studentID,Friend friend){//��Ӻ���
		Methor methor = new Methor();
		methor.addFriend(studentID, friend);
	}
	public void delFriend(String studentID,String friendID){//ɾ������
		Methor methor = new Methor();
		methor.delFriend(studentID,friendID);
	}
	public void reFriendName(String studentID,Friend friend){//�޸ĺ��ѱ�ע
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
	public void addStudent(){ //���ѧ��
		Methor methor = new Methor();
		methor.addStudent();
	}
	public void queryAll(){ //��ѯ����ͬѧ��Ϣ
		Methor methor = new Methor();
		methor.queryAll(this);
	}
	public void delStudent(String studentID){ //ɾ��ѧ��
		Methor methor = new Methor();
		methor.delStudent(studentID);
	}
	public void queryByStudentID(String studentID){ //��ѧ����Ų�ѯ
		Methor methor = new Methor();
		methor.queryByStudentID(this, studentID);
	}
	public void vagueQueryByName(String name){ //������ģ����ѯ
		Methor methor = new Methor();
		methor.vagueQueryByName(this, name);
	}
	public void vagueQueryByAddress(String address){ //����ַģ����ѯ
		Methor methor = new Methor();
		methor.vagueQueryByAddress(this, address);
	}
	public void queryByAge(int lowAge,int highAge){ //������β�ѯ
		Methor methor = new Methor();
		methor.queryByAge(this, lowAge, highAge);
	}
	public void reStudentInfomation(String studentID){ //�޸�ѧ����Ϣ
		Methor methor = new Methor();
		methor.reStudentInfomation(studentID);
	}
}
class Methor{
	public void printByTeach(){//��ʦ��ѯ�������Ϣ
		System.out.printf("ѧ��\t����\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
		for(int i=0;i<Data.index;i++){
			Data.parr[i].showInfomationByTeach();
		}
	}
	public void printByStudent(){//ѧ����ѯ�������Ϣ
		System.out.printf("ѧ��\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
		for(int i=0;i<Data.index;i++){
			Data.parr[i].showInfomationByStudent();
		}
	}
	public void queryAll(Object o){ //��ѯ����ͬѧ��Ϣ
		if(o instanceof Teach){//��ʦ���ò�ѯ
			printByTeach();
		}
		if(o instanceof Student){//ѧ�����ò�ѯ
			printByStudent();
		}
	}
	public void queryByStudentID(Object o,String studentID){ //��ѧ����Ų�ѯ
		if(o instanceof Teach){//��ʦ���ò�ѯ
			System.out.printf("ѧ��\t����\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getStudentID().equals(studentID)){
					Data.parr[i].showInfomationByTeach();
					break;
				}
			}
		}
		if(o instanceof Student){//ѧ�����ò�ѯ
			System.out.printf("ѧ��\t����\tt�Ա�\t����\t�绰\t\t��ַ\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getStudentID().equals(studentID)){
					Data.parr[i].showInfomationByStudent();
					break;
				}
			}
		}
	}
	public void vagueQueryByName(Object o,String name){ //������ģ����ѯ
		if(o instanceof Teach){//��ʦ���ò�ѯ
			System.out.printf("ѧ��\t����\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getName().contains(name)){
					Data.parr[i].showInfomationByTeach();
				}
			}
		}
		if(o instanceof Student){//ѧ�����ò�ѯ
			System.out.printf("ѧ��\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getName().contains(name)){
					Data.parr[i].showInfomationByStudent();
				}
			}
		}
	}
	public void vagueQueryByAddress(Object o,String address){ //����ַģ����ѯ
		if(o instanceof Teach){//��ʦ���ò�ѯ
			System.out.printf("ѧ��\t����\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getAddress().contains(address)){
					Data.parr[i].showInfomationByTeach();
				}
			}
		}
		if(o instanceof Student){//ѧ�����ò�ѯ
			System.out.printf("ѧ��\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getAddress().contains(address)){
					Data.parr[i].showInfomationByStudent();
				}
			}
		}
	}
	public void queryByAge(Object o,int lowAge , int highAge){ //������β�ѯ
		if(o instanceof Teach){//��ʦ���ò�ѯ
			System.out.printf("ѧ��\t����\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getAge()>=lowAge && Data.parr[i].getAge()<=highAge){
					Data.parr[i].showInfomationByTeach();
				}
			}
		}
		if(o instanceof Student){//ѧ�����ò�ѯ
			System.out.printf("ѧ��\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
			for(int i=0;i<Data.index;i++){
				if(Data.parr[i].getAge()>=lowAge && Data.parr[i].getAge()<=highAge){
					Data.parr[i].showInfomationByStudent();
				}
			}
		}
	}
	public void repsw(String studentID){ //�޸�����
		String str = null; //��¼ԭ����
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(studentID)){
				str = Data.parr[i].getPsw();
				break;
			}
		}
		while(true){
			Scanner in = new Scanner(System.in);
			System.out.println("������ԭ����:");
			String ypsw = in.nextLine();
			System.out.println("������������:");
			String xpsw = in.nextLine();
			System.out.println("���ٴ�����������:");
			String xpsw_1 = in.nextLine();
			if(ypsw.equals(str)){
				if(xpsw.equals(xpsw_1)){
					Data.parr[i].setPsw(xpsw);
					System.out.println("�޸�����ɹ�!");
					break;
				}
				else{
					System.out.println("�������������벻һ��");
				}
			}
			else{
				System.out.println("ԭ�����������!");
			}
		}
		System.out.printf("ѧ��\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
		Data.parr[i].showInfomationByStudent();
	}
	public void delStudent(String studentID){//ɾ��ѧ��
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
				//�����ѱ��е����ݽ���ά��
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
			System.out.println("ɾ���ɹ�!");
			Data.index -= 1;	
		}
		else{
			System.out.println("�����ڸ�ѧ��,ɾ��ʧ��!");
		}
		Teach teach = new Teach();
		System.out.printf("ѧ��\t����\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
		teach.queryAll();
	}
	public void addStudent(){//���ѧ��
		Scanner in = new Scanner(System.in);
		Student stu = new Student();
		String str =null;
		int t = 0;
		System.out.printf("************���ѧ����Ϣ************\n");
		System.out.printf("ѧ��:" + stu.getStudentID() + "\n");//ѧ���ɹ���������
		//��������
		System.out.printf("����:");
		str = in.nextLine();
		while(str.length()<6){
			System.out.println("�������ô���!���볤�Ȳ�С��6λ!");
			System.out.printf("��������������:");
			str = in.nextLine();
		}
		stu.setPsw(str);
		//��������
		System.out.printf("����:");
		stu.setName(in.nextLine());
		//�����Ա�
		System.out.printf("�Ա�:");
		str = in.nextLine();
		while(!str.equals("��") && !str.equals("Ů")){
			System.out.println("�Ա����ô���!�Ա�ӦΪ�л�Ů!");
			System.out.printf("�����������Ա�:");
			str = in.nextLine();
		}
		stu.setSex(str);
		//��������
		System.out.printf("����:");
		t = Integer.valueOf(in.nextLine());
		while(t<6){
			System.out.println("�����������!����6�겻����ѧ!");
			System.out.printf("��������������:");
			t = in.nextInt();
		}
		stu.setAge(t);
		//���õ绰
		System.out.printf("�绰:");
		str = in.nextLine();
		while(str.length()!=8 && str.length()!=11){
			System.out.println("�绰�����������!�绰����ӦΪ8λ��11λ!");
			System.out.printf("����������绰:");
			str = in.nextLine();
		}
		stu.setPhone(str);
		//���õ�ַ
		System.out.printf("��ַ:");
		stu.setAddress(in.nextLine());
		Data.parr[Data.index] = stu;
		Data.index += 1;
		//in.close(); 
	}
	public void reStudentInfomation(String studentID){//�޸�ѧ����Ϣ��Ϣ
		Scanner in = new Scanner(System.in);
		int i=0,flag=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(studentID)){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.printf("ѧ��\t����\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
			Data.parr[i].showInfomationByTeach();
			System.out.printf("*************�޸Ĳ���************\n");
			System.out.printf("*\t1.�޸�����\t\t*\n");
			System.out.printf("*\t2.�޸��Ա�\t\t*\n");
			System.out.printf("*\t3.�޸�����\t\t*\n");
			System.out.printf("*\t4.�޸ĵ绰\t\t*\n");
			System.out.printf("*\t5.�޸ĵ�ַ\t\t*\n");
			System.out.printf("*\t6.�޸�����\t\t*\n");
			System.out.printf("*\t7.�޸�ȫ��\t\t*\n");
			System.out.printf("*\t0.�˳�\t\t*\n");
			System.out.printf("*****************************\n");	
			System.out.print("1,2,3,4,5,6,7,0��ѡ��:");
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
	public void case_1(int index){//�޸�����
		Scanner in = new Scanner(System.in);
		System.out.print("������������:");
		String str = in.nextLine();
		Data.parr[index].setName(str);
	}
	public void case_2(int index){//�޸��Ա�
		Scanner in = new Scanner(System.in);
		System.out.print("���������Ա�(�л�Ů):");
		String str = in.nextLine();
		Data.parr[index].setSex(str);
	}
	public void case_3(int index){//�޸�����
		Scanner in = new Scanner(System.in);
		System.out.print("������������:");
		int age = in.nextInt();
		Data.parr[index].setAge(age);
	}
	public void case_4(int index){//�޸ĵ绰
		Scanner in = new Scanner(System.in);
		System.out.print("�������µ绰(8λ��11λ):");
		String str = in.nextLine();
		Data.parr[index].setPhone(str);
	}
	public void case_5(int index){//�޸ĵ�ַ
		Scanner in = new Scanner(System.in);
		System.out.print("�������µ�ַ:");
		String str = in.nextLine();
		Data.parr[index].setAddress(str);
	}
	public void case_6(int index){//�޸�����
		Scanner in = new Scanner(System.in);
		System.out.print("������������:");
		String str = in.nextLine();
		Data.parr[index].setPsw(str);
	}
	public void queryAllfriend(String studentID){//��ѯ���к���
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
						System.out.printf("ѧ��\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
					}
					Data.parr[k].showInfomationByStudent();
					cnt++;
				}
			}
		}
		if(cnt==0){
			System.out.println("�㻹û�к���!");
		}
	}
	public void addFriend(String studentID,Friend friend){//��Ӻ���
		int i=0;
		for(i=0;i<Data.index;i++){
			if(studentID.equals(Data.parr[i].getStudentID())){
				break;
			}
		}
		for(int j=0;j<Data.index;j++){
			if(Data.parr[i].f[j]==null){
				Data.parr[i].f[j]=friend;
				System.out.println("��Ӻ��ѳɹ�!");
				break;
			}
		}
	}
	public void delFriend(String studentID,String friendID){//ɾ������
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
				System.out.println("ɾ�����ѳɹ�!");
				break;
			}
		}
	}
	public void reFriendName(String studentID,Friend friend){//�޸ĺ��ѱ�ע
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
				System.out.println("�޸ĺ��ѱ�ע�ɹ�!");
				break;
			}
		}
	}
}
class Data{
	//static���εı��������û򷽷�,����ͨ���������,Ҳ��������.����
	static Student[] parr = new Student[50];//�洢����
	static int  cnt = 0;//ͳ������ѧ���ĸ���
	static int index = 10;//��¼�����е�Ԫ�صĸ���
	public static void init(){//��ʼ����ֵ
		int i=0;
		Student stu_1 = new Student("111111","����","��",22,"15079029607","�����ϲ�");
		parr[i++] = stu_1;
		Student stu_2 = new Student("222222","������","��",18,"18370397321","��������");
		parr[i++] = stu_2;
		Student stu_3 = new Student("333333","����","��",22,"11011011","��������");
		parr[i++] = stu_3;
		Student stu_4 = new Student("444444","��ë��","��",25,"1771950795","�����˴�");
		parr[i++] = stu_4;
		Student stu_5 = new Student("555555","���ӽ�","��",22,"12233445","�����Ž�");
		parr[i++] = stu_5;
		Student stu_6 = new Student("666666","�ƹ�ǿ","��",22,"12346525","�����ϲ�");
		parr[i++] = stu_6;
		Student stu_7 = new Student("777777","����","Ů",22,"15979194783","�����Ž�");
		parr[i++] = stu_7;
		Student stu_8 = new Student("888888","������","Ů",22,"88888888","�㶫����");
		parr[i++] = stu_8;
		Student stu_9 = new Student("999999","���","��",22,"55555555","�����ϲ�");
		parr[i++] = stu_9;
		Student stu_10 = new Student("123456","����","��",22,"77788899","�����ϲ�");
		parr[i++] = stu_10;
	}
}

class Print{
	public static void checkStudent(){//ѧ����¼���
		Scanner in = new Scanner(System.in);
		Scanner in_1 = new Scanner(System.in);
		System.out.print("ѧ�����:");
		String strNo = in.nextLine();
		System.out.print("����:");
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
			System.out.println("�����������,����������!");
			checkStudent();
		}
		if(flag==0){
			System.out.println("ѧ���������,����������!");
			checkStudent();
		}
	}
	public static void checkTeach(){//��ʦ��¼���
		Scanner in = new Scanner(System.in);
		Scanner in_1 = new Scanner(System.in);
		System.out.print("�û���:");
		String strNo = in.nextLine();
		System.out.print("����:");
		String strPsw = in_1.nextLine();
		if(strNo.equals("admin") && strPsw.equals("123456")){
			print2();
		}
		else{
			if(!strNo.equals("admin")){
				System.out.println("�û����������!");
			}
			else{
				System.out.println("�����������!");
			}
		}
	}
	public static void print(){ //�ս������
		Scanner in = new Scanner(System.in);
		System.out.printf("*************�û���¼**********\n");
		System.out.printf("*\t1.ѧ����¼\t\t*\n");
		System.out.printf("*\t2.��ʦ��¼\t\t*\n");
		System.out.printf("*\t3.�˳�\t\t*\n");
		System.out.printf("****************************\n");	
		System.out.print("1,2,3��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:checkStudent();break;
		case 2:checkTeach();break;
		case 3: return;
		}
	}
	public static void print1(String studentID){//ѧ����¼����
		Scanner in = new Scanner(System.in);
		System.out.printf("\n****��ӭѧ��Ϊ:"+studentID+"ͬѧ *****\n");
		System.out.printf("*\t1.��ѯ������Ϣ\t*\n");
		System.out.printf("*\t2.�޸�����\t\t*\n");
		System.out.printf("*\t3.�޸ĸ�����Ϣ\t*\n");
		System.out.printf("*\t4.��ѯͬѧ��Ϣ\t*\n");
		System.out.printf("*\t5.��ѯ���к���\t*\n");
		System.out.printf("*\t6.��Ӻ�����Ϣ\t*\n");
		System.out.printf("*\t7.ɾ��������Ϣ\t*\n");
		System.out.printf("*\t8.�޸ĺ��ѱ�ע\t*\n");
		System.out.printf("*\t0.������˳�\t*\n");
		System.out.printf("\n***************************\n");
		System.out.print("1,2,3,4,5,6,7,8,0��ѡ��:");
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
	public static void print11(String str){//��ѯ������Ϣ
		Scanner in = new Scanner(System.in);
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				System.out.printf("ѧ��\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
				Data.parr[i].showInfomationByStudent();
				break;
			}
		}
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print1(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	} 
	public static void print12(String str){//�޸�����
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				Data.parr[i].repsw(str);
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");	
		int num = in.nextInt();
		switch(num){
		case 1:print1(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	} 
	public static void print13(String str){//�޸ĸ�����Ϣ
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				Data.parr[i].reStudentInfomation(str);;
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");	
		int num = in.nextInt();
		switch(num){
		case 1:print1(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	} 
	public static void print14(String str){//��ѯͬѧ��Ϣ
		Scanner in = new Scanner(System.in);
		System.out.printf("\n****��ӭѧ��Ϊ:"+str+"ͬѧ *****\n");
		System.out.printf("\n***********��ѯͬѧ��Ϣ**********\n");
		System.out.printf("*\t1.��ѯ����ͬѧ��Ϣ\t*\n");
		System.out.printf("*\t2.����Ų�ѯ\t*\n");
		System.out.printf("*\t3.������ģ����ѯ\t*\n");
		System.out.printf("*\t4.����ַģ����ѯ\t*\n");
		System.out.printf("*\t5.������β�ѯ��ѯ\t*\n");
		System.out.printf("*\t0.������˳�\t*\n");
		System.out.printf("***************************\n");
		System.out.print("1,2,3,4,5,0��ѡ��:");
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
	public static void print15(String str){//��ѯ���к���
		for(int i=0;i<Data.index;i++){
			if(str.equals(Data.parr[i].getStudentID())){
				Data.parr[i].queryAllfriend(str);
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print1(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	}
	public static void print16(String str){//��Ӻ�����Ϣ
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
					System.out.printf("ѧ��\t����\t�Ա�\t����\t�绰\t\t��ַ\n");
				}
				Data.parr[i].showInfomationByStudent();
			}
		}
		Scanner in = new Scanner(System.in);
		Friend friend = new Friend();
		System.out.print("������Ҫ��ӵĺ��ѱ��:");
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
			System.out.println("�����ڸ�ѧ��!����������!");
			while(flag==0){
				print16(str);
			}
		}
		System.out.print("��������ѱ�ע:");
		friend.setOtherName(in.nextLine());
		for(int i=0;i<Data.index;i++){
			if(str.equals(Data.parr[i].getStudentID())){
				Data.parr[i].addFriend(str,friend);
				break;
			}
		}
		Scanner in_1 = new Scanner(System.in);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.�������\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");
		int num = in_1.nextInt();
		switch(num){
		case 1:print1(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print16(str);break;//�������
		case 0:
		default:
			return ;
		}
	}
	public static void print17(String str){//ɾ��������Ϣ
		Scanner in = new Scanner(System.in);
		System.out.print("������Ҫɾ�����ѵı��:");
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
			System.out.println("�����ڸú��ѱ��,����������!");
			while(flag==0){
				print17(str);
			}
		}
		Data.parr[i].delFriend(str,fid);
		Scanner in_1 = new Scanner(System.in);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");
		int num = in_1.nextInt();
		switch(num){
		case 1:print1(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	}
	public static void print18(String str){//�޸ĺ��ѱ�ע
		Friend friend = new Friend();
		Scanner in = new Scanner(System.in);
		System.out.print("������Ҫ�޸ı�ע�ĺ��ѱ��:");
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
			System.out.println("�����ڸ�ѧ��!����������!");
			while(flag==0){
				print16(str);
			}
		}
		System.out.print("�������±�ע:");
		friend.setOtherName(in.nextLine());
		Data.parr[i].reFriendName(str, friend);	
		Scanner in_1 = new Scanner(System.in);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");
		int num = in_1.nextInt();
		switch(num){
		case 1:print1(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	}
	public static void print141(String str){//��ѯ����ͬѧ��Ϣ
		for(int i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				Data.parr[i].queryAll();
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	}
	public static void print142(String str){//����Ų�ѯ
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.print("������Ҫ��ѯ�ı��:");
		String studentID = in.nextLine();
		Data.parr[i].queryByStudentID(studentID);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.������ѯ\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print142(str);break;//������ѯ
		case 0:
		default:
			return ;
		}
	}
	public static void print143(String str){//������ģ����ѯ
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				break;
			}
		}
		System.out.print("������Ҫ��ѯ�������ؼ���(������ϵ�Ҳ��ܳ���):");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		Data.parr[i].vagueQueryByName(name);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.������ѯ\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print143(str);break; //������ѯ
		case 0:
		default:
			return ;
		}
	}
	public static void print144(String str){//����ַģ����ѯ
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.print("�������ѯ�ĵ�ַ(����������û�д���):");
		String address = in.nextLine();
		Data.parr[i].vagueQueryByAddress(address);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.������ѯ\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print144(str);break; //������ѯ
		case 0:
		default:
			return;
		}
	}
	public static void print145(String str){//������β�ѯ��ѯ
		int i=0;
		for(i=0;i<Data.index;i++){
			if(Data.parr[i].getStudentID().equals(str)){
				break;
			}
		}
		Scanner in = new Scanner(System.in);
		System.out.print("������Ҫ���ҵ����䷶Χ(low to high):");
		int low = in.nextInt();
		int high = in.nextInt();
		Data.parr[i].queryByAge(low, high);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.������ѯ\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print14(str);break;//�����ϼ�Ŀ¼
		case 2:print1(str);break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print145(str);break; //������ѯ
		case 0:
		default:
			return;
		}
	}
	public static void print2(){//��ʦ��¼����
		Scanner in = new Scanner(System.in);
		System.out.printf("\n*************��ӭ************\n");
		System.out.printf("*\t1.���ѧ����Ϣ\t*\n");
		System.out.printf("*\t2.��ѯѧ����Ϣ\t*\n");
		System.out.printf("*\t3.�޸�ѧ����Ϣ\t*\n");
		System.out.printf("*\t4.ɾ��ѧ����Ϣ\t*\n");
		System.out.printf("*\t0.�˳�\t\t*\n");
		System.out.printf("***************************\n");
		System.out.print("1,2,3,4,0��ѡ��:");
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
	public static void print21(){//���ѧ����Ϣ
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		while(true){
			teach.addStudent();
			System.out.printf("�Ƿ�������<Y/N>?");
			String str = in.nextLine();
			if(str.equals("Y")){
				continue;
			}
			if(str.equals("N")){
				break;
			}
		}
		teach.queryAll();
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print2();break;//�����ϼ�Ŀ¼
		case 2:print2();break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	}
	public static void print22(){//��ѯѧ����Ϣ
		Scanner in = new Scanner(System.in);
		System.out.printf("\n***********��ѯѧ����Ϣ**********\n");
		System.out.printf("*\t1.��ѯ����ѧ����Ϣ\t*\n");
		System.out.printf("*\t2.����Ų�ѯ\t*\n");
		System.out.printf("*\t3.������ģ����ѯ\t*\n");
		System.out.printf("*\t4.����ַģ����ѯ\t*\n");
		System.out.printf("*\t5.������β�ѯ��ѯ\t*\n");
		System.out.printf("*\t0.������˳�\t*\n");
		System.out.printf("***************************\n");
		System.out.print("1,2,3,4,5,0��ѡ��:");
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
	public static void print221(){//��ѯ����ѧ����Ϣ
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		teach.queryAll();
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//�����ϼ�Ŀ¼
		case 2:print2();break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 0:
		default:
			return ;
		}
	}
	public static void print222(){//����Ų�ѯ
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		System.out.print("������Ҫ��ѯ�ı��:");
		String str = in.nextLine();
		teach.queryByStudentID(str);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.������ѯ\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//�����ϼ�Ŀ¼
		case 2:print2();break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print222();break;//������ѯ
		case 0:
		default:
			return ;
		}
	}
	public static void print223(){//������ģ����ѯ
		System.out.print("������Ҫ��ѯ�������ؼ���(������ϵ�Ҳ��ܳ���):");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Teach teach = new Teach();
		teach.vagueQueryByName(str);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.������ѯ\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//�����ϼ�Ŀ¼
		case 2:print2();break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print223();break; //������ѯ
		case 0:
		default:
			return ;
		}
	}
	public static void print224(){//����ַģ����ѯ
		Scanner in = new Scanner(System.in);
		Teach teach = new Teach();
		System.out.print("�������ѯ�ĵ�ַ(����������û�д���):");
		String str = in.nextLine();
		teach.vagueQueryByAddress(str);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.������ѯ\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//�����ϼ�Ŀ¼
		case 2:print2();break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print224();break; //������ѯ
		case 0:
		default:
			return;
		}
	}
	public static void print225(){//������β�ѯ��ѯ
		Scanner in = new Scanner(System.in);
		Teach teach = new Teach();
		System.out.print("������Ҫ���ҵ����䷶Χ(low to high):");
		int low = in.nextInt();
		int high = in.nextInt();
		teach.queryByAge(low, high);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.������ѯ\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print22();break;//�����ϼ�Ŀ¼
		case 2:print2();break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print224();break; //������ѯ
		case 0:
		default:
			return;
		}
	}
	public static void print23(){//�޸�ѧ����Ϣ
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		System.out.print("������Ҫ�޸�ѧ���ı��:");
		String  str = in.nextLine();
		teach.reStudentInfomation(str);
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.�����޸�\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print2();break;//�����ϼ�Ŀ¼
		case 2:print2();break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print23();break;//�����޸�
		case 0:
		default:
			return ;
		}
	}
	public static void print24(){//ɾ��ѧ����Ϣ
		Teach teach = new Teach();
		Scanner in = new Scanner(System.in);
		System.out.print("ɾ��ѧ���ı��:");
		String str = in.nextLine();
		teach.delStudent(str);
		teach.queryAll();
		System.out.printf("*************����ѡ��************\n");
		System.out.printf("*\t1.�����ϼ�Ŀ¼\t*\n");
		System.out.printf("*\t2.������Ŀ¼\t*\n");
		System.out.printf("*\t3.�˳���¼\t\t*\n");
		System.out.printf("*\t4.����ɾ��\t\t*\n");
		System.out.printf("*\t0.��������\t\t*\n");
		System.out.printf("*****************************\n");	
		System.out.print("1,2,3,4,0��ѡ��:");
		int num = in.nextInt();
		switch(num){
		case 1:print2();break;//�����ϼ�Ŀ¼
		case 2:print2();break;//������Ŀ¼
		case 3:print();break;//�˳���¼
		case 4:print24();break;//����ɾ��
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
