#分区间素数筛选
#定理：任何一个合数可以分解为多个素素乘积
import datetime
start = datetime.datetime.now()
total = 0	#统计计算次数
list1 = [2] #质数列表
#求第一阶段素数，放入列表中，个数为目标用户开根号
for i in range(3, 3000, 2):
    for j in range(3, int(i**0.5)+1, 2): 
    	total += 1
    	if i % j == 0:
    		break
    else:
        list1.append(i)   
count = len(list1)
for i in range(1001,9000000,2):
	for j in list1:
		total += 1
		if i % j == 0:
			break
	else:
		count += 1
detal = (datetime.datetime.now()-start).total_seconds()
print("The number of prime is :", count)
print("The total traversal is :", total)
print("The time is :", detal)

#9000000
#The number of prime is : 602489
#The total traversal is : 325926137
#The time is : 224.807858
#[Finished in 225.5s]